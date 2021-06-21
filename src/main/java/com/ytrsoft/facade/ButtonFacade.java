package com.ytrsoft.facade;

import com.ytrsoft.basic.button.FlatButton;
import com.ytrsoft.basic.button.RaisedButton;

public class ButtonFacade {
    private FlatButton flatButton;
    private RaisedButton raisedButton;
    public ButtonFacade() {
        this.flatButton = new FlatButton();
        this.raisedButton = new RaisedButton();
    }
    public void paintFlatButton() {
        this.flatButton.paint();
    }
    public void paintRaisedButton() {
        this.raisedButton.paint();
    }
}
