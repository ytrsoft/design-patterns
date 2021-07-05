package com.ytrsoft.state;

public class RunTimeContext {

    private State state;

    public RunTimeContext() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
