package com.company.taskspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public String greetingsInput(@RequestParam("inputText") String input){
        System.out.println("input: " + input);
        return "Greetings: " + input;
    }
    @RequestMapping(value = "/inputReverse", method = RequestMethod.GET)
    public String reverseInput(@RequestParam("inputText") String input){
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();
        System.out.println("reverse: " + reverse);
        return reverse;
    }
}
