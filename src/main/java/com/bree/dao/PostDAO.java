package com.bree.dao;

import com.bree.model.Image;
import com.bree.model.Post;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

public interface PostDAO {

    List<Image> getImagesForPostByPostId(int post_id);

    HashMap<Post, List<String>> getPostsWithImagesByPostId();

    List<Post> orderPostsDescByDate(int post_id);

    List<Post> orderPostsAscByDate(int post_id);

    List<Post> orderPostsByLocation();
}
