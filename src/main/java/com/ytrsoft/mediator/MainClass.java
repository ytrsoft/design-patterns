package com.ytrsoft.mediator;

/**
 * 中介者设计模式
 */
public class MainClass {
    public static void main(String[] args) {
        RenderMediator mediator = new ButtonRender();
        mediator.render("flat");
        mediator.render("raised");
    }
}
