package com.tcc.transportcharge.services;

import com.tcc.transportcharge.entities.Register;

public interface LoginService {

    String login(String user, String password);

    String signIn(Register register);
}
