package com.p44elovod.fronttestingtool.controllers;

import com.p44elovod.fronttestingtool.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"/users", "index/users"})
    public String getUsers(Model model){

        model.addAttribute("users", userService.getUserList());



        return "users";

    }
}
