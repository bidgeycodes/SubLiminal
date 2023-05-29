
package com.bree.dao;

import com.bree.model.Image;
import com.bree.model.Post;

import java.util.List;

public interface ImageDAO {

    List<Image> getImagesForPostByPostId(int postId);

    List<Image> getAllSiteImages();

}
