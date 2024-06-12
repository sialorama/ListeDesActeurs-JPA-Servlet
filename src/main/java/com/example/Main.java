package org.demo;

import org.demo.utils.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        // Test de connexion
        if (HibernateUtil.testConnection()) {
            System.out.println("La connexion à la base de données a réussi !");
        } else {
            System.out.println("La connexion à la base de données a échoué !");
        }

    }
}
