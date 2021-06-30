package com.ytrsoft.mediator;

import com.ytrsoft.basic.button.Button;
import com.ytrsoft.basic.button.FlatButton;
import com.ytrsoft.basic.button.RaisedButton;

public class ButtonRender extends RenderMediator {

    private Button flat;
    private Button raised;

    public ButtonRender() {
        this.flat = new FlatButton();
        this.raised = new RaisedButton();
    }

    @Override
    public void render(String name) {
        if (name.equalsIgnoreCase("flat")) {
            flat.paint();
        }
        if (name.equalsIgnoreCase("raised")) {
            raised.paint();
        }
    }
}
