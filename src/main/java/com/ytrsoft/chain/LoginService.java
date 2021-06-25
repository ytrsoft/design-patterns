package com.ytrsoft.chain;

public class LoginService extends  RequestChain {
    @Override
    public boolean doAction(Request request) {
        String token = (String) request.query("token");
        if (token != null) {
            System.out.println("请不要重复登陆");
            return false;
        }
        return next(request);
    }
}
