package com.example.carlosanguiano.mvp_android;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Carlos Anguiano on 29/10/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }

}
