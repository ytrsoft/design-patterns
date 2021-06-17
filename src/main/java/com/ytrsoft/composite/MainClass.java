package com.ytrsoft.composite;

/**
 * 组合模式
 */
public class MainClass {
    public static void main(String[] args) {
        File root = new File("root");

        File left = new File("left");
        File right = new File("right");

        File java = new File("java");
        File php = new File("php");

        File python = new File("python");
        File dart = new File("dart");

        left.add(java);
        left.add(php);

        right.add(python);
        right.add(dart);

        root.add(left);
        root.add(right);

        root.display();
    }
}
