package com.codegym.shopyy.controller;

import com.codegym.shopyy.model.Size;
import com.codegym.shopyy.repository.ISizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/size")
public class SizeController {
    @Autowired
    private ISizeRepository repo;

    @GetMapping({"",  "/"})
    public String showProductsList(Model model) {
        List<Size> sizes = repo.findAll(Sort.by(Sort.Direction.DESC,"id"));
        model.addAttribute("sizes", sizes);
        return "sizes/index";
    }
}
