package com.tcc.transportcharge.services;

import com.tcc.transportcharge.entities.Register;
import com.tcc.transportcharge.entities.UserData;

public interface LoginService {

    UserData signIn(Register register);
}
