package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.net.http.HttpClient;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {




    @RequestMapping ("/")
    public String podLimsy () {
        return "homepage";
    }

  /*  @GetMapping ("/")
    public String podLimmsy () {
        return "/homepage";
    }*/
}
