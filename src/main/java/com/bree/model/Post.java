package com.bree.model;

import java.sql.Date;

public class Post {

    public int postId;
    public String postTitle;
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

    public Post(int postId, String postTitle, Date postDate, boolean postExist, String postLocation, String postDescription) {
        this.postId = postId;
        this.postTitle = postTitle;
        this.postDate = postDate;
        this.postExist = postExist;
        this.postLocation = postLocation;
        this.postDescription = postDescription;
    }

    public int getPostId() {
        return postId;
    }

    public String getPostTitle() {
        return postTitle;
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

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
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