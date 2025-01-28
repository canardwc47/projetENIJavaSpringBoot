package fr.eni.projet.projeteni.controller;



import fr.eni.projet.projeteni.bll.ArticleVenduService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
