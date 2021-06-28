package com.ytrsoft.command;

public class MV implements Shell {
    @Override
    public void apply() {
        System.out.println("mv -- move files");
    }
}
