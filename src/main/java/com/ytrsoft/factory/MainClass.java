package com.ytrsoft.factory;

import com.ytrsoft.basic.button.FlatButton;
import com.ytrsoft.basic.button.RaisedButton;

/**
 * 工厂方法模式
 */
public class MainClass {
    public static void main(String[] args) {
        ButtonFactory bf = new ButtonFactory();
        FlatButton fb = (FlatButton) bf.getButton("flat");
        fb.paint();
        RaisedButton rb = (RaisedButton) bf.getButton("raised");
        rb.paint();
    }
}
