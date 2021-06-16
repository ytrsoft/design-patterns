package com.ytrsoft.basic.button;

import com.ytrsoft.basic.color.Color;

public class FlatButton extends Button {

    public FlatButton() {}

    public FlatButton(Color color) {
        super(color);
    }

    @Override
    public void paint() {
        if (this.color == null) {
            System.out.println("绘制扁平化的按钮");
        } else {
            System.out.println("绘制扁平化" + color.getName() +"的按钮");
        }
    }
}
