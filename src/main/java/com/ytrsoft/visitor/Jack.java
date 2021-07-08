package com.ytrsoft.visitor;

public class Jack implements Employee {

    @Override
    public void accept(Leader leader) {
        leader.visit(this);
    }

    @Override
    public String getName() {
        return "Jack";
    }
}
