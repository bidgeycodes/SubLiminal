package com.bree.dao;

import com.bree.model.Image;
import com.bree.model.Post;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class JDBCPostDAO implements PostDAO {

    private final JdbcTemplate jdbcTemplate;

    public JDBCPostDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Image> getImagesForPostByPostId(int image_id) {
        List<Image> images = new ArrayList<>();
        String query = "SELECT post_id FROM post " +
                "JOIN image ON image.post_id = post.post_id " +
                "WHERE image_id = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, image_id);
        while (result.next()) {
            Image image = mapRowToPost(result);
            images.add(image);
        }
        return images;
    }

    @Override
    public List<Post> orderPostsDescByDate(int post_id) {
        List<Post> postsDesc = new ArrayList<>();
        String query = "SELECT post_date FROM post " +
                "WHERE post_id = ? " +
                "ORDER BY post_date DESC";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, post_id);
        while (result.next()) {
            Post post = mapRowToPost(result);
            postsDesc.add(post);
        }
        return postsDesc;
    }

    @Override
    public List<Post> orderPostsAscByDate(int post_id) {
        List<Post> postsAsc = new ArrayList<>();
        String query = "SELECT post_date FROM post " +
                "WHERE post_id = ? " +
                "ORDER BY post_date ASC ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, post_id);
        while (result.next()) {
            Post post = mapRowToPost(result);
            postsAsc.add(post);
        }
        return postsAsc;
    }

    public List<Post> orderPostsByLocation() {
        return null;
    }


    private Post mapRowToPost(SqlRowSet row) {
        Post post = new Post();
        post.setPostId(row.getInt("post_id"));

        return post;
    }
}
