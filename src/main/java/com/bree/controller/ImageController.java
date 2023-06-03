package com.bree.controller;

import com.bree.dao.ImageDAO;
import com.bree.dao.PostDAO;
import com.bree.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ImageController {

    @Autowired
    public ImageDAO imageDAO;

    @Autowired
    public PostDAO postDAO;

    @RequestMapping(path = "/posts/post/{id}", method= RequestMethod.GET)
    public List<Image> postImages(int postId) {
        return imageDAO.getImagesForPostByPostId(postImages(postId));
    }
}
