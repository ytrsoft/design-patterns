package com.ytrsoft.flyweight;

import com.ytrsoft.basic.button.FlatButton;

/**
 * 享元模式
 */
public class MainClass {
    public static void main(String[] args) {
        ButtonContainer container = new ButtonContainer();
        FlatButton f1 = (FlatButton) container.getButton("flat");
        FlatButton f2 = (FlatButton) container.getButton("flat");
        f1.paint();
        f2.paint();
    }
}
