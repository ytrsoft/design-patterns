package com.ytrsoft.proxy;

import com.ytrsoft.basic.User;

public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void save(User user) {
        System.out.println("after...");
        userService.save(user);
        System.out.println("before...");
    }
}
