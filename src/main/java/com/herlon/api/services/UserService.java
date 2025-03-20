package com.herlon.api.services;


import com.herlon.api.domain.User;

public interface UserService {
    public User findById(Long id);
}
