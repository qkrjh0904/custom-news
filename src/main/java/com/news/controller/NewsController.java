package com.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @GetMapping("/")
    public String mainPage(Model model) {
        // 모델에 데이터를 추가해 Thymeleaf 템플릿으로 전달
        model.addAttribute("title", "가짜 뉴스 생성기");
        return "main"; // Thymeleaf 템플릿의 이름
    }
}
