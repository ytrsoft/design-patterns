package com.ytrsoft.builder;

public class ResponseEntity {

    private Object data;
    private int statusCode;
    private String statusMessage;

    private ResponseEntity(Object data, int statusCode, String statusMessage) {
        this.data = data;
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public static class ResponseEntityBuilder {
        private Object data;
        private int statusCode;
        private String statusMessage;
        public ResponseEntityBuilder data(Object data) {
            this.data = data;
            return this;
        }
        public ResponseEntityBuilder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public ResponseEntityBuilder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public ResponseEntity build() {
            return new ResponseEntity(this.data, this.statusCode, this.statusMessage);
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
        return "ResponseEntity{" +
                "data=" + data +
                ", statusCode=" + statusCode +
                ", statusMessage='" + statusMessage + '\'' +
                '}';
    }
}
