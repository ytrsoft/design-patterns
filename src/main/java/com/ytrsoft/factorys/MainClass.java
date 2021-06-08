package com.ytrsoft.factorys;

import com.ytrsoft.basic.button.FlatButton;
import com.ytrsoft.basic.button.RaisedButton;
import com.ytrsoft.basic.input.PasswordInput;
import com.ytrsoft.basic.input.TextInput;

public class MainClass {
    public static void main(String[] args) {
        AbstractFactory  ab = new AbstractFactory();
        ButtonFactory bf = (ButtonFactory) ab.getFactory("button");
        FlatButton fb = (FlatButton) bf.getComponent("button.flat");
        fb.paint();
        RaisedButton rb = (RaisedButton) bf.getComponent("button.raised");
        rb.paint();
        InputFactory inf = (InputFactory) ab.getFactory("input");
        TextInput ti = (TextInput) inf.getComponent("input.text");
        ti.paint();
        PasswordInput pi = (PasswordInput) inf.getComponent("input.password");
        pi.paint();
    }
}
