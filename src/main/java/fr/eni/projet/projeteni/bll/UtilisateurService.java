package fr.eni.projet.projeteni.bll;

import fr.eni.projet.projeteni.bo.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur getUtilisateur(String email);

    List<Utilisateur> getAllUtilisateur();

    int addUtilisateur(Utilisateur utilisateur);

    void updateUtilisateur(Utilisateur utilisateur);

    void deleteUtilisateur(Utilisateur utilisateur);
}
