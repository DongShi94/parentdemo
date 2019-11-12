package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/select/{eid}")
    public User select(@PathVariable("eid") Integer eid){
        User user=userService.select(eid);
        System.out.println(user.toString());
        return user;
    }
}
