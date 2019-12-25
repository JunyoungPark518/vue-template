package com.vue.jypark.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexC {

    @Autowired IndexS service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("hello", service.hello());
        return "/index.html";
    }

}
