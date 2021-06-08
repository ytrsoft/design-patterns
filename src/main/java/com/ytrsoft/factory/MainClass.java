package com.ytrsoft.factory;

import com.ytrsoft.basic.Button;
import com.ytrsoft.basic.ButtonType;

/**
 * 工厂方法模式
 */
public class MainClass {
    public static void main(String[] args) {
        ButtonFactory btnFactory = new ButtonFactory();
        Button flatBtn = btnFactory.getButton(ButtonType.FLAT);
        flatBtn.paint();
        Button raisedBtn = btnFactory.getButton(ButtonType.RAISED);
        raisedBtn.paint();
    }
}
