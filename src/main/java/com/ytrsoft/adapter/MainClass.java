package com.ytrsoft.adapter;

/**
 * 适配器模式
 */
public class MainClass {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();
        XMLParser xmlParser = new XMLParser();
        xmlParser.parse();
        JSONParseAdapter adapter = new JSONParseAdapter(jsonParser);
        adapter.parse();
    }
}
