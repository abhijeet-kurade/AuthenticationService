package com.example.authentication;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/user")
public class UserController {

    private final UserAuthService userAuthService;


    @PostMapping(path = "create-account")
    public String createAccount(@RequestBody CreateAccountRequest request){
        System.out.println(request);
        userAuthService.createAccount(request);
        return "Something";
    }
}
