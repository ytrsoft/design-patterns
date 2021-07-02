package com.ytrsoft.observer;

import java.util.Observable;

public class Marry implements Student {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("marry：" + arg);
    }
}
