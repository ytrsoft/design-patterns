package com.ytrsoft.visitor;

public interface Employee {
    void accept(Leader leader);
    String getName();
}
