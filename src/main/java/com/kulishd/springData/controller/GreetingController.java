package com.kulishd.springData.controller;

import java.io.IOException;

import com.lowagie.text.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model)
        throws DocumentException, IOException {
        model.addAttribute("name", name);
        return "greeting";
    }

}
