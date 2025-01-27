package fr.eni.projet.projeteni.bll;

import fr.eni.projet.projeteni.bo.Categorie;

import java.util.List;

public interface CategoriService {
    void addCategories(Categorie categori);

    void removeCategories(int id);

    List<Categorie> getCategories();
    Categorie getNoCategorie (int id);

    void update (Categorie categorie);

}
