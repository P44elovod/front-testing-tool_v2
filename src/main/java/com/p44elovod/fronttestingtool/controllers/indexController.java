package com.p44elovod.fronttestingtool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"", "/", "/index"})
    private String getIndex(){


        return "index";
    }

}
