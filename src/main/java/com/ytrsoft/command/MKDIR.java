package com.ytrsoft.command;

public class MKDIR implements Shell {
    @Override
    public void apply() {
        System.out.println("mkdir -- make directories");
    }
}
