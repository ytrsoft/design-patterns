package com.ytrsoft.factory;

// 工厂方法模式
public class Bootstrap {
    public static void main(String[] args) {
        HTMLElementFactory factory = new HTMLElementFactory();
        HTMLElement div = factory.createHTMLElement("div");
        HTMLElement span = factory.createHTMLElement("span");
        HTMLElement form = factory.createHTMLElement("form");
        div.appendChild(span);
        div.appendChild(form);
        div.appendChild(span);
        System.out.println(div.getBody());
    }
}
