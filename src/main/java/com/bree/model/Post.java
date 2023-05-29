package com.bree.model;

import java.sql.Date;
import java.util.List;

public class Post {

    public int postId;
    public String postName;
    public Date postDate;
    public String postLocation;
    public String postDescription;


    // empty constructor
    public Post() {
    }

    public Post(int postId, String postName, Date postDate, String postLocation, String postDescription) {
        this.postId = postId;
        this.postName = postName;
        this.postDate = postDate;
        this.postLocation = postLocation;
        this.postDescription = postDescription;
    }

    public int getPostId() {
        return postId;
    }

    public String getPostName() {
        return postName;
    }

    public Date getPostDate() {
        return postDate;
    }

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

    public void setPostLocation(String postLocation) {
        this.postLocation = postLocation;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }
}