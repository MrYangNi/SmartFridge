package com.jayce.common.websocket;

/**
 * Created by Jaycejia on 2017/4/4.
 */
public enum ToUserPushURI {
    FRIDGE_ACTION("/fridgeAction");


    private String uri;

    ToUserPushURI(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }
}
