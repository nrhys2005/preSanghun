package com.main.main.controller;

import com.main.main.service.MainMainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainMainController {

    @GetMapping("")
    public void mainView(){
        return ;
    }
}
