package com.ytrsoft.visitor;

/**
 * 访问者设计模式
 */
public class MainClass {
    public static void main(String[] args) {
        Jack jack = new Jack();
        Alen alen = new Alen();
        Tom tom = new Tom();
        John john = new John();
        tom.visit(jack);
        john.visit(alen);
    }
}
