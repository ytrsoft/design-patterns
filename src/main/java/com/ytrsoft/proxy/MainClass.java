package com.ytrsoft.proxy;

import com.ytrsoft.basic.User;

/**
 * 代理模式
 */
public class MainClass {
    public static void main(String[] args) {
        User user = new User("admin", "0000");
        UserService userService = new UserServiceProxy(new UserServiceImpl());
        userService.save(user);
    }
}
