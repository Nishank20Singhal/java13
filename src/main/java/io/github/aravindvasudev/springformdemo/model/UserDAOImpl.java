package io.github.aravindvasudev.springformdemo.model;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<User> getUsers() {
        return sessionFactory.getCurrentSession()
                .createQuery("from User", User.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
