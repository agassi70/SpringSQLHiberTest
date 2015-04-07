package com.springsqlhibertest.service;

import com.springsqlhibertest.dao.UserDao;
import com.springsqlhibertest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Юрий on 28.03.2015.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Transactional
    @Override
    public void addUser(User user) {
        this.userDao.addUser(user);
    }


    @Transactional
    @Override
    public void deleteUser(int id) {
        this.userDao.deleteUser(id);
    }


    @Transactional
    @Override
    public User getUser(int id) {
        User result  = this.userDao.getUser(id);
        return result;
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Transactional
    @Override
    public List<User> getUsers() {

        return this.userDao.getUsers();
    }

    @Transactional
    @Override
    public List<User> findUser(String string) {
        return this.userDao.findUser(string);
    }

    @Transactional
    @Override
    public List<User> userPage(int pages) {
        return this.userDao.userPage(pages);
    }
}
