package com.ytrsoft.flyweight;

import com.ytrsoft.basic.button.Button;
import com.ytrsoft.factory.ButtonFactory;

import java.util.HashMap;
import java.util.Map;

public class ButtonContainer {

    private static Map<String, Button> cache = new HashMap<>();
    private ButtonFactory factory = new ButtonFactory();

    public Button getButton(String name) {
        Button button = cache.get(name);
        if (button == null) {
            button = factory.getButton(name);
            cache.put(name, button);
        }
        return button;
    }
}
