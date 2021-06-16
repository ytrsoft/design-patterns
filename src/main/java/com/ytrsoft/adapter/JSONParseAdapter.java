package com.ytrsoft.adapter;

public class JSONParseAdapter extends XMLParser {

    private JSONParser jsonParser;

    public JSONParseAdapter(JSONParser jsonParser) {
        this.jsonParser = jsonParser;
    }

    @Override
    public void parse() {
        jsonParser.parse();
    }
}
