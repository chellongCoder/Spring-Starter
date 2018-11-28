/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author pc
 */
@Controller
public class HomeController {
    
    @RequestMapping("/index.htm")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/home.htm")
    public String home() {
        return "home";
    }
    
}
