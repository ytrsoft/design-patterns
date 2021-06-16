package com.ytrsoft.basic.button;

import com.ytrsoft.basic.color.Color;

public class RaisedButton extends Button {

    public RaisedButton() {
        super();
    }

    public RaisedButton(Color color) {
        super(color);
    }

    @Override
    public void paint() {
        if (this.color == null) {
            System.out.println("绘制凸起的按钮");
        } else {
            System.out.println("绘制凸起" + color.getName() +"的按钮");
        }
    }
}
