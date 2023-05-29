package com.bree.dao;

import com.bree.model.Image;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JDBCImageDAO implements ImageDAO {

    private final JdbcTemplate jdbcTemplate;

    public JDBCImageDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Image> getImagesForPostByPostId(int post_id) {
        List<Image> images = new ArrayList<>();
        String query = "SELECT image_id FROM image " +
                "WHERE post_id = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query, post_id);
        while (result.next()) {
            Image image = mapRowToImage(result);
            images.add(image);
        }
        return images;
    }

    public List<Image> getAllSiteImages() {
        List<Image> allImages = new ArrayList<>();
        String query = "SELECT image_url FROM image ";
        SqlRowSet result = jdbcTemplate.queryForRowSet(query);
        while (result.next()) {
            Image image = mapRowToImage(result);
            allImages.add(image);
        }
        return allImages;
    }

    private Image mapRowToImage(SqlRowSet row) {
        Image image = new Image();
        image.setImageUrl(row.getString("image_url"));

        return image;
    }
}
