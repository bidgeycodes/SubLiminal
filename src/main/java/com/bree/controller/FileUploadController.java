package com.bree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Value;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

    @RestController
    @RequestMapping("/api/images")
    public class FileUploadController {

        @Value("${app.upload.dir:${user.home}}")
        public String uploadDir;

        @PostMapping("/upload")
        public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
            try {
                saveFile(file);
                return ResponseEntity.ok("Successfully uploaded: " + file.getOriginalFilename());
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload "+ file.getOriginalFilename());
            }
        }
        private void saveFile(MultipartFile file) throws IOException {
            if (!file.isEmpty()) {
                Path copied = Paths.get(uploadDir, file.getOriginalFilename());
                Files.copy(file.getInputStream(), copied, StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }

