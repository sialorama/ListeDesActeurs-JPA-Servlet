package org.demo.dao;

import org.demo.model.Film;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.demo.util.HibernateUtil;
import java.util.List;

public class AuteurDaoImpl implements AuteurDao {

    @Override
    public List<Film> getFilmsByActeur(int acteurId) {
        List<Film> films = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT f FROM Film f JOIN f.acteurs a WHERE a.id = :acteurId";
            Query<Film> query = session.createQuery(hql, Film.class);
            query.setParameter("acteurId", acteurId);
            films = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace(); // Utilisez un framework de journalisation en production
        }
        return films;
    }
}
