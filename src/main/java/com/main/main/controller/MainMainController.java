package com.main.main.controller;

import com.main.main.service.MainMainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainMainController {
    MainMainService mainMainService;
    @GetMapping("")
    public void mainView(){
        return ;
    }

    @GetMapping("list")
    public void mainList(){
        //mainMainService.
        return ;
    }

}
