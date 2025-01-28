package fr.eni.projet.projeteni.controller;


import fr.eni.projet.projeteni.bll.ArticleVenduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleVenduController {


    private final ArticleVenduService articleVenduService;

    public ArticleVenduController(ArticleVenduService articleVenduService) {
        this.articleVenduService = articleVenduService;
    }

    @GetMapping("/view-articles")
    public String home(Model model) {
        var articles = articleVenduService.getAllArticleVendu();
        model.addAttribute("articles", articles);
        return "view-articles";
    }
}
