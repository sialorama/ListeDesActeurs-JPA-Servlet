package org.demo.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Création de la session factory à partir du fichier hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Gestion des exceptions lors de la création de la session factory
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static boolean testConnection() {
        try {
            // Tentative d'ouverture d'une session Hibernate
            Session session = sessionFactory.openSession();
            session.close();
            return true; // La connexion a réussi
        } catch (Exception e) {
            e.printStackTrace(); // Affichez l'erreur pour le débogage
            return false; // La connexion a échoué
        }
    }
}
