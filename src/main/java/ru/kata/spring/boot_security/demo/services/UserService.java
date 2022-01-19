package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.enteties.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public User getUserById(Long id);

    public void saveUser(User user);

    public void deleteUser(Long id);



}
