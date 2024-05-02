package com.project.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173", maxAge = 3600)
@RestController
@RequestMapping("/login")
public class AuthController {

    @RequestMapping(method = RequestMethod.POST)
    public String getCred(@RequestBody String userName, String password) {
        return userName;
    }
}
