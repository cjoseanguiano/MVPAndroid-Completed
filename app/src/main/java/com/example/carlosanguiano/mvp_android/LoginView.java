package com.example.carlosanguiano.mvp_android;

/**
 * Created by Carlos Anguiano on 29/10/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
