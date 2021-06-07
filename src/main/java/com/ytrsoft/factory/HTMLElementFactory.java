package com.ytrsoft.factory;

public class HTMLElementFactory {

    public HTMLElement createHTMLElement(String name) {
        if (name.equalsIgnoreCase("span")) {
            return new HTMLSpanElement();
        }
        if (name.equalsIgnoreCase("form")) {
            return new HTMLFormElement();
        }
        return new HTMLDivElement();
    }

}
