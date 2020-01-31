package com.axin.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ricardo
 * @version 1.0
 * @date 2020-01-29 18:27:52
 */
@Controller
@RequestMapping("/axin")
public class MyController {
    
    @RequestMapping("/music")
    public String listen() {
        return "/musicDemo.html";
    }
    
}
