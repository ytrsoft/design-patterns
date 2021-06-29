package com.ytrsoft.iterator;

import java.util.LinkedList;
import java.util.List;

public class NodeList<T> {

    private final List<T> list = new LinkedList<>();

    public boolean add(T t) {
        return list.add(t);
    }

    public T remove(int index) {
        return list.remove(index);
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    public Iterator<T> iterator() {
        return new ListIterator<>(this);
    }

}
