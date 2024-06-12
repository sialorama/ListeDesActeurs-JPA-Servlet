package com.example.dao;

import com.example.model.Acteur;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActeurDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveActeur(Acteur acteur) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(acteur);
        tx.commit();
        session.close();
    }

    public List<Acteur> getAllActeurs() {
        Session session = sessionFactory.openSession();
        List<Acteur> acteurs = session.createQuery("from Acteur", Acteur.class).list();
        session.close();
        return acteurs;
    }
}
