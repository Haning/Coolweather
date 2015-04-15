package com.coolweather.app.util;

/**
 * Created by han on 15/4/11.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
