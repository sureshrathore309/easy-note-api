package com.apisero.service;

import java.util.List;

import com.apisero.easynotes.model.User;

public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
