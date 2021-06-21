package com.ytrsoft.basic.button;

import com.ytrsoft.basic.Component;
import com.ytrsoft.basic.color.Color;


public abstract class Button implements Component {

    protected Color color;

    public Button() {}

    public Button(Color color) {
        this.color = color;
    }

    public abstract void paint();
}
