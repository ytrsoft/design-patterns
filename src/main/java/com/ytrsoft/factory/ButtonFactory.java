package com.ytrsoft.factory;

import com.ytrsoft.basic.Button;
import com.ytrsoft.basic.ButtonType;
import com.ytrsoft.basic.FlatButton;
import com.ytrsoft.basic.RaisedButton;

public class ButtonFactory {

    public Button getButton(ButtonType type) {
        Button button = null;
        switch (type) {
            case FLAT:
                button = new FlatButton();
                break;
            case RAISED:
                button = new RaisedButton();
        }
        return button;
    }

}
