package fr.eni.projet.projeteni.bll;

import fr.eni.projet.projeteni.bo.Utilisateur;
import fr.eni.projet.projeteni.dal.UtilisateurDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    private UtilisateurDao utilisateurDao;

    public UtilisateurServiceImpl(UtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }

    @Override
    public Utilisateur getUtilisateur(String email) {
        return utilisateurDao.read(email);
    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurDao.read();
    }


    @Override
    public int addUtilisateur(Utilisateur utilisateur) {
        return utilisateurDao.create(utilisateur);
    }

    @Override
    public void updateUtilisateur(Utilisateur utilisateur) {
        utilisateurDao.update(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) {
        utilisateurDao.delete(utilisateur);
    }
}
