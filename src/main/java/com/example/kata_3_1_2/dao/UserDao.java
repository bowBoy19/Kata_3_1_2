package com.example.kata_3_1_2.dao;

import com.example.kata_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    void delete(int id);
    void add(User user);
    public User getById( int id);
    void update(User user);
    List<User> listUsers();
}
