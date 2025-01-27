package fr.eni.projet.projeteni.dal;

import fr.eni.projet.projeteni.bo.Utilisateur;

import java.util.List;

public interface UtilisateurDao {
    List<Utilisateur> read();

    Utilisateur read(String email);

    int create(Utilisateur utilisateur);

    void update(Utilisateur utilisateur);

    void delete(Utilisateur utilisateur);
}
