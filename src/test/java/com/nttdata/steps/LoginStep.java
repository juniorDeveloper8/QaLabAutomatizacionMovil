package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;

public class LoginStep {

    LoginScreen loginScreen;

    public void username(String username) {
        loginScreen.SingIn(username);
    }

    public void password(String clave) {
        loginScreen.sendPassword(clave);
    }

    public void Ingresar() {
        loginScreen.clickLogin();
    }

    public void navegation() {
        loginScreen.clickMenu();
        loginScreen.clickSubMenu();
    }
}
