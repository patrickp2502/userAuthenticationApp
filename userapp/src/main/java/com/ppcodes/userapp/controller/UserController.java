package com.ppcodes.userapp.controller;

import com.ppcodes.userapp.persistence.model.AppUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @GetMapping
    public AppUser getAppUser() {
        return null;
    }
}
