package ru.ShekhurinMikhail.FirstSpringBoot.dao;



import ru.ShekhurinMikhail.FirstSpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
    User showUser(long id);
}
