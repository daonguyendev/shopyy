package com.codegym.shopyy.controller;

import com.codegym.shopyy.model.Color;
import com.codegym.shopyy.repository.IColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/color")
public class ColorController {
    @Autowired
    private IColorRepository repo;

    @GetMapping({"",  "/"})
    public String showProductsList(Model model) {
        List<Color> colors = repo.findAll(Sort.by(Sort.Direction.DESC,"id"));
        model.addAttribute("colors", colors);
        return "colors/index";
    }
}
