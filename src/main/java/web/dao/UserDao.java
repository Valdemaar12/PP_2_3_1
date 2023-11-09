package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User updateUser(User user);

    User findUserById(long id);

    void deleteUserById(long id);

    List<User> getAllUsers();

}
