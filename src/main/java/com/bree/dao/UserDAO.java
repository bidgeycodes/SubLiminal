package com.bree.dao;

import com.bree.model.User;

import java.util.List;

public interface UserDAO {

    List<User> returnAll();

    User getUserById(int userId);

    User getUserByUsername(String username);

}
