package com.tcc.transportcharge.services;

import com.tcc.transportcharge.daos.AccountCredentialsRepository;
import com.tcc.transportcharge.daos.UserDataRepository;
import com.tcc.transportcharge.entities.AccountCredentials;
import com.tcc.transportcharge.entities.Register;
import com.tcc.transportcharge.entities.UserData;
import com.tcc.transportcharge.exception.EmailAlreadyExistException;
import com.tcc.transportcharge.exception.UserAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private static String USER_ALREADY_EXIST = "User already exist";
    private static String EMAIL_ALREADY_EXIST = "Email already exist";

    private AccountCredentialsRepository accountCredentialsRepository;
    private UserDataRepository userDataRepository;

    @Autowired
    public LoginServiceImpl(AccountCredentialsRepository accountCredentialsRepository, UserDataRepository userDataRepository){
        this.accountCredentialsRepository = accountCredentialsRepository;
        this.userDataRepository = userDataRepository;
    }

    public UserData signIn(Register register){

        if(accountCredentialsRepository.findByName(register.getName()) != null){
            throw new UserAlreadyExistException(USER_ALREADY_EXIST);
        }

        if(userDataRepository.findByEmail(register.getEmail()) != null){
            throw new EmailAlreadyExistException(EMAIL_ALREADY_EXIST);
        }

        AccountCredentials accountCredentials = new AccountCredentials(register.getName(), register.getKey());
        UserData userData = new UserData(register.getContact(), register.getEmail(),register.getAddress(), register.getNumberAddress(), register.getCreditCardNumber(), register.getNumberCreditCCV(), accountCredentials);
        accountCredentialsRepository.save(accountCredentials);
        return userDataRepository.save(userData);
    }
}
