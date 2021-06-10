package com.ytrsoft.builder;

public class Response {
    private Object data;
    private int statusCode;
    private String statusMessage;

    public Response(Object data, int statusCode, String statusMessage) {
        this.data = data;
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public static class ResponseBuilder {
        private Object data;
        private int statusCode;
        private String statusMessage;
        public ResponseBuilder data(Object data) {
            this.data = data;
            return this;
        }
        public ResponseBuilder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public ResponseBuilder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public Response build() {
            return new Response(data, statusCode, statusMessage);
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                ", statusCode=" + statusCode +
                ", statusMessage='" + statusMessage + '\'' +
                '}';
    }
}
