package com.example.controller;

import com.example.model.Acteur;
import com.example.service.ActeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ActeurController {

    @Autowired
    private ActeurService acteurService;

    @GetMapping("/acteurs")
    public String listeActeurs(Model model) {
        model.addAttribute("acteurs", acteurService.obtenirTousLesActeurs());
        return "listeActeurs";
    }

    @PostMapping("/ajouterActeur")
    public String ajouterActeur(Acteur acteur) {
        acteurService.ajouterActeur(acteur);
        return "redirect:/acteurs";
    }
}
