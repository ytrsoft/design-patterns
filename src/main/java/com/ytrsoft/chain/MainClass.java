package com.ytrsoft.chain;

/**
 * 责任链模式
 */
public class MainClass {
    public static void main(String[] args) {
        Request request = new Request();
        LoginService loginService = new LoginService();
        HomeService homeService = new HomeService();
        loginService.withNext(homeService);
        loginService.doAction(request);
        request.set("token", "xxxx-xxxx-xxxx-xxxx");
        loginService.doAction(request);
    }
}
