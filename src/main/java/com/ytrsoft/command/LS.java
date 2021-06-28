package com.ytrsoft.command;

public class LS implements Shell {
    @Override
    public void apply() {
        System.out.println("ls -- list directory contents");
    }
}
