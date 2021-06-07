package com.ytrsoft.factory;

import java.util.LinkedList;
import java.util.List;

public abstract class HTMLElement {

    private List<HTMLElement> list = new LinkedList<>();

    public void appendChild(HTMLElement element) {
        list.add(element);
    }

    public String getBody()  {
        StringBuilder innerHTML = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            if (i < list.size() - 1) {
                innerHTML.append(String.format("\t<%s>@</%s>\n", name, name));
            } else {
                innerHTML.append(String.format("\t<%s>@</%s>", name, name));
            }
        }
        return String.format("<%s>\n%s\n</%s>", getName(), innerHTML, getName());
    }

    public abstract String getName();

}
