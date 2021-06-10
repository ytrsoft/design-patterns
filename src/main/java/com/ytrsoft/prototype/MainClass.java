package com.ytrsoft.prototype;

import com.ytrsoft.basic.User;

/**
 * 原型模式
 */
public class MainClass {
    public static void main(String[] args) {
        User user = new User("admin", "0000");
        System.out.println(user);
        User cloneUser = user.clone();
        cloneUser.setPassword("123");
        System.out.println(cloneUser);
    }
}
