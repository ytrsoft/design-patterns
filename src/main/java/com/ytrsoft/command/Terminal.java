package com.ytrsoft.command;

import java.util.Stack;

public class Terminal {

    private Stack<Shell> history = new Stack<>();

    public void execute(Shell shell) {
        history.push(shell);
    }

    public Shell undo() {
        return history.pop();
    }

    public boolean isEmpty() {
        return this.history.isEmpty();
    }
}
