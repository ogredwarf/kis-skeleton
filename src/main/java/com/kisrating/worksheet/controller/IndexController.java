package com.kisrating.worksheet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {

    @GetMapping({"/", "index"})
    public String index(Model model){

        return "index";
    }

    @GetMapping("index3")
    public String index3(Model model){
        return "index3";
    }

}
