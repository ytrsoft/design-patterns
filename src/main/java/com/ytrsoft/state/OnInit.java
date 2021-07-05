package com.ytrsoft.state;

public class OnInit implements State {
    @Override
    public void doAction(RunTimeContext context) {
        System.out.println("into init...");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "OnInit";
    }
}
