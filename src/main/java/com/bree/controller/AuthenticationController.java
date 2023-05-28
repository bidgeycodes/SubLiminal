package com.bree.controller;

import javax.validation.Valid;

import com.bree.dao.UserDAO;
import com.bree.model.LoginDTO;
import com.bree.model.LoginResponseDTO;
import com.bree.model.User;
import com.bree.security.jwt.JWTFilter;
import com.bree.security.jwt.TokenProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.security.Principal;

    @RestController
    @CrossOrigin
    public class AuthenticationController {

        private final TokenProvider tokenProvider;
        private final AuthenticationManagerBuilder authenticationManagerBuilder;
        private UserDAO userDAO;

        public AuthenticationController(TokenProvider tokenProvider, AuthenticationManagerBuilder authenticationManagerBuilder, UserDAO userDAO) {
            this.tokenProvider = tokenProvider;
            this.authenticationManagerBuilder = authenticationManagerBuilder;
            this.userDAO = userDAO;
        }

        @RequestMapping(value = "/login", method = RequestMethod.POST)
        public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginDTO loginDTO) {

            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword());

            Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = tokenProvider.createToken(authentication, false);

            User user = userDAO.getUserByUsername(loginDTO.getUsername());

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add(JWTFilter.AUTHORIZATION_HEADER, "Bearer " + jwt);
            return new ResponseEntity<>(new LoginResponseDTO(jwt, user), httpHeaders, HttpStatus.OK);
        }

    }

