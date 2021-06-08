package com.ytrsoft.factorys;

import com.ytrsoft.basic.Component;
import com.ytrsoft.basic.input.PasswordInput;
import com.ytrsoft.basic.input.TextInput;

public class InputFactory implements ComponentFactory {
    @Override
    public Component getComponent(String name) {
        if (name.equalsIgnoreCase("input.text"))  {
            return new TextInput();
        }
        if (name.equalsIgnoreCase("input.password"))  {
            return new PasswordInput();
        }
        return null;
    }
}
