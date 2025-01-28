package fr.eni.projet.projeteni.controller;



import fr.eni.projet.projeteni.bll.UtilisateurService;
import fr.eni.projet.projeteni.bo.Utilisateur;


import fr.eni.projet.projeteni.bll.ArticleVenduService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;




@Controller
public class EncheresController {


    private final ArticleVenduService articleVenduService;

    public EncheresController(ArticleVenduService articleVenduService) {
        this.articleVenduService = articleVenduService;
    }

    @GetMapping("/encheres")
    public String home(Model model) {
        var articles = articleVenduService.getAllArticleVendu();
        model.addAttribute("articles", articles);
        return "view-encheres";
    }
}
