package com.bree.dao;

import com.bree.model.Image;
import com.bree.model.Post;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCPostDAO implements PostDAO {

    private final JdbcTemplate jdbcTemplate;

    public JDBCPostDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Post> getAllSitePostsAndDetails() {
        List<Post> allPosts = new ArrayList<>();
        String query = "SELECT * FROM post " +
                "LEFT JOIN image ON image.post_id = post.post_id";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query);
        while (result.next()) {
            Post post = mapRowToPost(result);
            allPosts.add(post);
        }
        return allPosts;
    }

    public Post getPostByPostId(int postId) {
        Post postById;
        String query = "SELECT post_id FROM post ";
//        SqlRowSet result = jdbcTemplate.queryForObject(query, postId, Post.class);
        return null;
    }

    @Override
    public boolean doesPostExist(boolean postId) {
        return false;
    }

    @Override
    public List<Post> orderPostsDescByDate(int postId) {
        List<Post> postsDesc = new ArrayList<>();
        String query = "SELECT post_date FROM post " +
                "WHERE post_id = ? " +
                "ORDER BY post_date DESC";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, postId);
        while (result.next()) {
            Post post = mapRowToPost(result);
            postsDesc.add(post);
        }
        return postsDesc;
    }

    @Override
    public List<Post> orderPostsAscByDate(int postId) {
        List<Post> postsAsc = new ArrayList<>();
        String query = "SELECT post_date FROM post " +
                "WHERE post_id = ? " +
                "ORDER BY post_date ASC ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, postId);
        while (result.next()) {
            Post post = mapRowToPost(result);
            postsAsc.add(post);
        }
        return postsAsc;
    }

    public List<Post> orderPostsByLocation(int postId) {
        List<Post> postsLocation = new ArrayList<>();
        String query = "SELECT post_location FROM post" +
                "WHERE post_id = ? " +
                "ORDER BY post_location ASC ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, postId);
        while (result.next()) {
            Post post = mapRowToPost(result);
            postsLocation.add(post);
        }
        return postsLocation;
    }

    public Post addPostObject(Post post) {
       String query = "INSERT INTO post (post_name, post_location, post_exist, post_date, post_description)" +
               " VALUES ( ?, ?, ?, ?, ?) RETURNING post_id";
       int postId = jdbcTemplate.queryForObject(query, Integer.class, post.getPostName(), post.getPostLocation(), post.isPostExist(), post.getPostDate(), post.getPostDescription());
       post.setPostId(postId);
       return post;
    }



    private Post mapRowToPost(SqlRowSet row) {
        Post post = new Post();
        Image image = new Image();
        post.setPostName(row.getString("post_name"));
        post.setPostId(row.getInt("post_id"));
        post.setPostDate(row.getDate("post_date"));
        post.setPostLocation(row.getString("post_location"));
        post.setPostDescription(row.getString("post_description"));
        post.setPostExist(row.getBoolean("post_exist"));
        image.setImageId(row.getInt("image_id"));
        image.setImageUrl(row.getString("image_url"));
        post.setPostImage(image);

        return post;
    }
}
