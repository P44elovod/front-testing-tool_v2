package com.p44elovod.fronttestingtool.controllers;

import com.p44elovod.fronttestingtool.models.Testing;
import com.p44elovod.fronttestingtool.services.TestingService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Log4j2
@Controller
public class indexController {

    private final TestingService testingService;

    public indexController(TestingService testingService) {
        this.testingService = testingService;
    }

    @RequestMapping({"", "/", "/index"})
    private String getIndex(Model model){

        model.addAttribute("testings", testingService.getTestingList());


        return "index";
    }

}
