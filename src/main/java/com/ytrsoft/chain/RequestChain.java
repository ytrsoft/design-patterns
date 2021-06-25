package com.ytrsoft.chain;


public abstract class RequestChain {

    private RequestChain nextChain;

    public void withNext(RequestChain nextChain) {
        this.nextChain = nextChain;
    }

    public abstract boolean doAction(Request request);

    protected boolean next(Request request) {
        if (nextChain == null) {
            return true;
        }
        return nextChain.doAction(request);
    }

}
