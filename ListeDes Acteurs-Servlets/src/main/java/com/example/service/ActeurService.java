package com.example.service;

import com.example.dao.ActeurDao;
import com.example.model.Acteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActeurService {

    @Autowired
    private ActeurDao acteurDao;

    @Transactional
    public void ajouterActeur(Acteur acteur) {
        acteurDao.saveActeur(acteur);
    }

    @Transactional
    public List<Acteur> obtenirTousLesActeurs() {
        return acteurDao.getAllActeurs();
    }
}
