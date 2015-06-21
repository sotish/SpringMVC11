package com.sat.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@EnableAutoConfiguration

public class Hello3 {

	@Value("${name}")

	public String name;

	@RequestMapping("/")

    public String helloWorld(Model model) {

        model.addAttribute("name", this.name);
        return ("index");

	}

}
