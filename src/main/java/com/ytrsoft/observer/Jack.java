package com.ytrsoft.observer;

import java.util.Observable;

public class Jack implements Student {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("jack：" + arg);
    }
}
