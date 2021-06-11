package com.ytrsoft.singleton;

/**
 * 单例模式
 */
public class MainClass {
    public static void main(String[] args) {
        Jdbc instance = Jdbc.getInstance();
        instance.getConnection();
    }
}
