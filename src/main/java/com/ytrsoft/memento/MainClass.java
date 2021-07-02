package com.ytrsoft.memento;

/**
 *  备忘录模式
 */
public class MainClass {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("#1");
        caretaker.setMemento(originator.createMemento());
        originator.setState("#2");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
