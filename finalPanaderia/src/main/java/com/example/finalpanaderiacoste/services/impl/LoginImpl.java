package com.example.finalpanaderiacoste.services.impl;

import com.example.finalpanaderiacoste.exceptions.LoginException;
import com.example.finalpanaderiacoste.services.LoginService;

public class LoginImpl implements LoginService {

    private final String username = "JUAN";

    private final String passwordAdmin = "123";
    @Override
    public void login(String user, String password) throws LoginException {

        if( !(user.equals(username) && password.equals(passwordAdmin))) throw new LoginException("Credenciales invalidas");


    }
}
