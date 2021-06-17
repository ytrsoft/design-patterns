package com.ytrsoft.composite;

import java.util.ArrayList;
import java.util.List;

public class File {
    private String name;
    private List<File> children;
    public File() {}
    public File(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getChildren() {
        return children;
    }

    public void setChildren(List<File> children) {
        this.children = children;
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    public void add(File file) {
        children.add(file);
    }

    public void display() {
        display(this, 0);
    }

    private void display(File file, int depth) {
        for (int i = 0; i < depth ; i++) {
            System.out.print("......");
        }
        System.out.println(file.getName());
        if (!hasChildren()) {
            return;
        }
        List<File> childList = file.getChildren();
        for (int i = 0; i < childList.size() ; i++) {
            display(childList.get(i), depth + 1);
        }
    }
}
