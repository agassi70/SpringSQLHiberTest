package com.springsqlhibertest.dao;

import com.springsqlhibertest.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Юрий on 28.03.2015.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private Session getSession() {
        Session session = getSessionFactory().getCurrentSession();
        if (session == null) {
            session = getSessionFactory().openSession();
        }
        return session;
    }

    @Override
    public void addUser(User user){
        Session session = getSession();
        session.save(user);
    }


    @Override
    public void deleteUser(int id) {
        Session session = getSession();
        session.delete(getUser(id));
    }

    @Override
    public User getUser(int id) {
        Session session = getSession();
        return (User) session.get(User.class, new Integer(id));
    }

    @Override
    public void updateUser(User user) {
        Session session = getSession();
        session.update(user);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getUsers(){
        Session session = getSession();
        //Query query = session.createQuery("from User");
        return session.createCriteria(User.class).list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User>  findUser(String string) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(User.class);

        return criteria.add(Restrictions.ilike("name", string + "%")).list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> userPage(int pages) {
        Session session = getSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.setFirstResult((pages - 1) * 10);
        criteria.setMaxResults(10);
        return criteria.list();
    }
}