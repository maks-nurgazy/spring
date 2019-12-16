package com.love.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
    @RequestMapping("showForm")
    public String showFrom() {
        return "helloworld-form";
    }

    @RequestMapping("processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/getMessage")
    public String getMessage(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String message = "Welcome, "+ name;
        model.addAttribute("message",message);
        return "helloworld";
    }

    @RequestMapping("/secondMessage")
    public String secondMessage(@RequestParam("studentName")String name, Model model) {
        name = name.toUpperCase();
        String message = "Welcome, "+ name;
        model.addAttribute("message",message);
        return "helloworld";
    }

}
