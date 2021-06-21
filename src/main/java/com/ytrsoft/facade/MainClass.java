package com.ytrsoft.facade;

/**
 * 外观模式
 */
public class MainClass {
    public static void main(String[] args) {
        ButtonFacade buttonFacade = new ButtonFacade();
        buttonFacade.paintFlatButton();
        buttonFacade.paintRaisedButton();
    }
}
