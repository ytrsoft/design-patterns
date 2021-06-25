package com.ytrsoft.chain;

public class HomeService extends  RequestChain {

    @Override
    public boolean doAction(Request request) {
        String token = (String) request.query("token");
        if (token == null) {
            System.out.println("请先登陆");
            return false;
        }
        return next(request);
    }
}
