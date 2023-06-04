package com.bree.controller;

import com.bree.dao.PostDAO;
import com.bree.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

    @CrossOrigin
    @RestController
    public class PostController {

        @Autowired
        public PostDAO postDAO;

}
