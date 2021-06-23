package com.ytrsoft.proxy;

import com.ytrsoft.basic.User;

public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("saved " + user.getUsername());
    }
}
