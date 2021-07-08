package com.ytrsoft.visitor;

public class John implements Leader {
    @Override
    public void visit(Employee emp) {
        System.out.println("John leader visit " + emp.getName() + " employee");
    }

}
