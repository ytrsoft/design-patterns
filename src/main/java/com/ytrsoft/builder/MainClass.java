package com.ytrsoft.builder;

import com.ytrsoft.basic.User;

/**
 * 生成器模式
 */
public class MainClass {
    public static void main(String[] args) {
        ResponseEntity.ResponseEntityBuilder builder = new ResponseEntity.ResponseEntityBuilder();
        ResponseEntity response = builder.data(new User("root", "0000"))
                .statusCode(200)
                .statusMessage("OK")
                .build();
        System.out.println(response);
    }
}
