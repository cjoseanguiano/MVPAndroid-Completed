package com.example.carlosanguiano.mvp_android;

/**
 * Created by Carlos Anguiano on 29/10/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);

}
