package io.github.aravindvasudev.springformdemo.model;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    void addUser(User user);
}
