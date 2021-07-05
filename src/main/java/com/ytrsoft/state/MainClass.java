package com.ytrsoft.state;

/**
 * 状态模式
 */
public class MainClass {
    public static void main(String[] args) {
       RunTimeContext context = new RunTimeContext();
       OnInit init = new OnInit();
       init.doAction(context);
       System.out.println(context.getState());
       OnDestroy destroy = new OnDestroy();
       destroy.doAction(context);
       System.out.println(context.getState());
    }
}
