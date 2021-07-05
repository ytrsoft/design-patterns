package com.ytrsoft.state;

public class OnDestroy implements State {
    @Override
    public void doAction(RunTimeContext context) {
        System.out.println("into destroy...");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "OnDestroy";
    }
}
