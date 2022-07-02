/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qurban.Qurban.controller;

import com.qurban.Qurban.domain.Qurban;
import com.qurban.Qurban.service.QurbanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Shabiq
 */
@Controller
public class QurbanController {
    @Autowired
    private QurbanService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Qurban> listtasks = service.listAll();
        model.addAttribute("listqurban", listtasks);
        System.out.print("Get / ");	
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("qurban", new Qurban());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveQurban(@ModelAttribute("qurban") Qurban std) {
        service.save(std);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String showEditQurbanPage(Model model, @PathVariable(name = "id") int id) {
        Qurban std = service.get(id);
        model.addAttribute("qurban", std);
        return "edit";
    }
    @RequestMapping("/delete/{id}")
    public String deleteQurban(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
