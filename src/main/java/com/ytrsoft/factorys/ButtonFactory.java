package com.ytrsoft.factorys;

import com.ytrsoft.basic.Component;
import com.ytrsoft.basic.button.FlatButton;
import com.ytrsoft.basic.button.RaisedButton;

public class ButtonFactory implements ComponentFactory {
    @Override
    public Component getComponent(String name) {
        if (name.equalsIgnoreCase("button.flat"))  {
            return new FlatButton();
        }
        if (name.equalsIgnoreCase("button.raised"))  {
            return new RaisedButton();
        }
        return null;
    }
}
