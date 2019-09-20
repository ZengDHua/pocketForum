package com.pocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther Akie
 * @date 2019/9/20 17:32
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
