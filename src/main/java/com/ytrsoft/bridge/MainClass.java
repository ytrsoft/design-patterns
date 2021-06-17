package com.ytrsoft.bridge;

import com.ytrsoft.basic.button.Button;
import com.ytrsoft.basic.button.FlatButton;
import com.ytrsoft.basic.button.RaisedButton;
import com.ytrsoft.basic.color.Black;
import com.ytrsoft.basic.color.Color;
import com.ytrsoft.basic.color.White;

/**
 * 桥接模式
 */
public class MainClass {
    public static void main(String[] args) {
        Color white = new White();
        Button flatButton = new FlatButton(white);
        flatButton.paint();
        Color black = new Black();
        Button raisedButton = new RaisedButton(black);
        raisedButton.paint();
    }
}
