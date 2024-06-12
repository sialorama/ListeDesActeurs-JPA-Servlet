package org.demo.service;

import org.demo.dao.AuteurDao;
import org.demo.dao.AuteurDaoImpl;
import org.demo.model.Film;
import java.util.List;

public class ActeurService {
    private AuteurDao auteurDao;

    public ActeurService() {
        this.auteurDao = new AuteurDaoImpl();
    }

    public List<Film> getFilmsByActeur(int acteurId) {
        return auteurDao.getFilmsByActeur(acteurId);
    }
}
