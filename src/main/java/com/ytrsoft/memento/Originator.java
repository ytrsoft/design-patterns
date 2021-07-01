package com.ytrsoft.memento;

public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(this);
    }

    public void restoreMemento(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
