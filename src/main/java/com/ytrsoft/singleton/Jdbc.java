package com.ytrsoft.singleton;

public class Jdbc {

    private static Jdbc instance;

    private Jdbc() {}

    public static Jdbc getInstance() {
        if (instance == null) {
            instance = new Jdbc();
        }
        return instance;
    }

    public void getConnection() {
        System.out.println("获得jdbc连接");
    }

}
