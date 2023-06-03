package com.bree.dao;

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
        String query = "SELECT * FROM post ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query);
        return null;
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


    private Post mapRowToPost(SqlRowSet row) {
        Post post = new Post();
        post.setPostId(row.getInt("post_id"));
        post.setPostDate(row.getDate("post_date"));
        post.setPostLocation(row.getString("post_location"));
        return post;
    }
}
