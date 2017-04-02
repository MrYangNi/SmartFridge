package com.jayce.user.controller;

import com.jayce.user.pojo.User;
import com.jayce.user.service.def.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jaycejia on 2017/4/2.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User getUserDetail(@PathVariable("userId") Long userId) {
        return userService.getUserDetail(userId);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String registerUser(@RequestBody User user) {
        userService.addUser(user);
        return "添加用户成功";
    }
}
