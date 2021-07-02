package com.ytrsoft.observer;

/**
 *  观察者模式
 */
public class MainClass {
    public static void main(String[] args) {
        Jack jack = new Jack();
        Marry marry = new Marry();
        Teacher teacher = new Teacher();
        teacher.addStudent(jack);
        teacher.addStudent(marry);
        teacher.notifyAllStudent("起立");
    }
}
