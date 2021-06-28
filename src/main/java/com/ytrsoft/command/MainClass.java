package com.ytrsoft.command;

/**
 * 命令模式
 */
public class MainClass {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        terminal.execute(new LS());
        terminal.execute(new MKDIR());
        terminal.execute(new MV());
        while(!terminal.isEmpty()) {
            terminal.undo().apply();
        }
    }
}
