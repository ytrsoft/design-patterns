package com.ytrsoft.iterator;

public class ListIterator<T> implements Iterator<T> {

    private final NodeList<T> list;

    public ListIterator(NodeList<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list.size() != 0;
    }

    @Override
    public T next() {
        return list.remove(0);
    }
}
