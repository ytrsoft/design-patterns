package com.ytrsoft.factory;

import com.ytrsoft.basic.button.Button;
import com.ytrsoft.basic.button.FlatButton;
import com.ytrsoft.basic.button.RaisedButton;

public class ButtonFactory {

    public Button getButton(String name) {
        if (name.equalsIgnoreCase("flat")) {
            return new FlatButton();
        }
        if (name.equalsIgnoreCase("raised")) {
            return new RaisedButton();
        }
        return null;
    }

}
