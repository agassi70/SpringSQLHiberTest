package com.springsqlhibertest.dao;

import com.springsqlhibertest.entity.User;

import java.util.List;

/**
 * Created by Юрий on 28.03.2015.
 */
public interface UserDao {
    public void addUser(User user);
    public void deleteUser(int id);
    public User getUser (int id);
    public void updateUser (User user);
    public List<User> getUsers();
    public List<User> findUser(String string);
    public List<User> userPage(int pages);
}
