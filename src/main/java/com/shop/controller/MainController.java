package com.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
public class MainController {

    @GetMapping(value = "/")
    public String main() {
        return "main";
    }
}
