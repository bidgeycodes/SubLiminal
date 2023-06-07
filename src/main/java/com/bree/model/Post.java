package com.bree.model;

import java.sql.Date;
import java.util.List;

public class Post {

    public int postId;
    public String postName;
    public Date postDate;
    public boolean postExist;
    public String postLocation;
    public String postDescription;

    public boolean isPostExist() {
        return postExist;
    }

    public Image getPostImage() {
        return postImage;
    }

    public void setPostImage(Image postImage) {
        this.postImage = postImage;
    }

    public Image postImage;


    // empty constructor
    public Post() {
    }

    public Post(int postId, String postName, Date postDate, boolean postExist, String postLocation, String postDescription) {
        this.postId = postId;
        this.postName = postName;
        this.postDate = postDate;
        this.postExist = postExist;
        this.postLocation = postLocation;
        this.postDescription = postDescription;
    }

    public int getPostId() {
        return postId;
    }

    public String getPostName() {
        return postName;
    }

    public Date getPostDate() {return postDate;}

    public boolean doesPostExist() {return postExist;}

    public String getPostLocation() {
        return postLocation;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public void setPostExist(boolean postExist) {
        this.postExist = postExist;
    }

    public void setPostLocation(String postLocation) {
        this.postLocation = postLocation;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }
}