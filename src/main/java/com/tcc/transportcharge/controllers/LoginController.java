package com.tcc.transportcharge.controllers;

import com.tcc.transportcharge.daos.AccountCredentialsRepository;
import com.tcc.transportcharge.entities.AccountCredentials;
import com.tcc.transportcharge.entities.Register;
import com.tcc.transportcharge.entities.UserData;
import com.tcc.transportcharge.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("user")
@CrossOrigin(origins = "*")
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
        return "blabla";
    }

    @PostMapping("/signin")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody UserData signIn(@RequestBody Register register){
        return loginService.signIn(register);
    }
}
