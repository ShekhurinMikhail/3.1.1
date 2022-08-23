package ru.ShekhurinMikhail.FirstSpringBoot.service;



import ru.ShekhurinMikhail.FirstSpringBoot.model.User;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
    User showUser(long id);
}
