package com.bree.dao;

import com.bree.model.Image;
import com.bree.model.Post;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

public interface PostDAO {

    List<Post> getAllSitePostsAndDetails();

    List<Post> orderPostsDescByDate(int postId);

    List<Post> orderPostsAscByDate(int postId);

    List<Post> orderPostsByLocation(int postId);

}
