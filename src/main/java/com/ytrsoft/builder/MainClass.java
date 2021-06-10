package com.ytrsoft.builder;

import com.ytrsoft.basic.User;

/**
 * 生成器模式
 */
public class MainClass {
    public static void main(String[] args) {
        User user = new User("admin", "0000");
        Response.ResponseBuilder builder =  new Response.ResponseBuilder();
        Response response = builder.data(user)
                .statusCode(200)
                .statusMessage("OK")
                .build();
        System.out.println(response);
    }
}
