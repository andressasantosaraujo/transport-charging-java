package com.tcc.transportcharge.controllers;

import com.tcc.transportcharge.daos.AccountCredentialsRepository;
import com.tcc.transportcharge.entities.AccountCredentials;
import com.tcc.transportcharge.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("user")
public class LoginController {

    private LoginService loginService;

    private AccountCredentialsRepository accountCredentialsRepository;

    @Autowired
    public LoginController(LoginService loginService,AccountCredentialsRepository accountCredentialsRepository){
        this.loginService = loginService;
        this.accountCredentialsRepository = accountCredentialsRepository;
    }

    @PostMapping("/blabla")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody String userLogin(@RequestBody String userLogin) {
        return userLogin;
    }

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody String test() {
        AccountCredentials accountCredentials = new AccountCredentials("admin","password");
        accountCredentialsRepository.save(accountCredentials);
        return "blabla";
    }
}
