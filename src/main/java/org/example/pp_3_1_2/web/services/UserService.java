package org.example.pp_3_1_2.web.services;

import org.example.pp_3_1_2.web.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUserById(long id);
    void updateUser(User user);
    void deleteUser(long id);
    List<User> getAllUsers();
}
