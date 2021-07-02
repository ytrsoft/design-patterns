package com.ytrsoft.iterator;

/**
 * 迭代器模式
 */
public class MainClass {
    public static void main(String[] args) {
        NodeList<Character> nodes = new NodeList<>();
        nodes.add('A');
        nodes.add('B');
        nodes.add('C');
        nodes.add('D');
        Iterator<Character> iterator = nodes.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
