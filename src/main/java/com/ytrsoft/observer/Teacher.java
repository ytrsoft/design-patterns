package com.ytrsoft.observer;

import java.util.Observable;

public class Teacher extends Observable {

    public void addStudent(Student student) {
        addObserver(student);
    }

    public void notifyAllStudent(String msg) {
        setChanged();
        notifyObservers(msg);
    }

}
