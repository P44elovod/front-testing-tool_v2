package com.p44elovod.fronttestingtool.controllers;

import com.p44elovod.fronttestingtool.models.Testing;
import com.p44elovod.fronttestingtool.services.TestingService;
import com.p44elovod.fronttestingtool.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Log4j2
@Controller
public class indexController {

    private final TestingService testingService;
    private final UserService userService;

    public indexController(TestingService testingService, UserService userService) {
        this.testingService = testingService;
        this.userService = userService;
    }

    @RequestMapping({"", "/", "/index"})
    private String getIndex(Model model){

        model.addAttribute("testings", testingService.getTestingList());
        model.addAttribute("users",userService.getUserList());


        return "index";
    }

}
