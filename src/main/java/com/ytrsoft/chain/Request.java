package com.ytrsoft.chain;

import java.util.HashMap;
import java.util.Map;

public class Request {

    private final Map<String, Object> params = new HashMap<>();

    public Object query(String key) {
        return params.get(key);
    }

    public void delete(String key) {
        params.remove(key);
    }

    public void set(String key, Object val) {
        params.put(key, val);
    }
}
