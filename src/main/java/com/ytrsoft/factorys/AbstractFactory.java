package com.ytrsoft.factorys;

public class AbstractFactory {

    public ComponentFactory getFactory(String name) {
        if (name.equalsIgnoreCase("button")) {
            return new ButtonFactory();
        }
        if (name.equalsIgnoreCase("input")) {
            return new InputFactory();
        }
        return null;
    }

}
