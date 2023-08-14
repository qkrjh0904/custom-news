package com.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("title", "가짜 뉴스 생성기");
        return "main";
    }

    @GetMapping("/generate")
    public String generatePage(Model model) {
        model.addAttribute("title", "가짜 뉴스 생성기");
        return "main";
    }
}
