package org.demo.controller;

import org.demo.model.Film;
import org.demo.service.ActeurService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/films-par-acteur")
public class ActeurControleur extends HttpServlet {

    private ActeurService acteurService;

    @Override
    public void init() throws ServletException {
        super.init();
        acteurService = new ActeurService(); // Initialisation du service
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int acteurId = Integer.parseInt(request.getParameter("acteurId"));
        List<Film> films = acteurService.getFilmsByActeur(acteurId);
        request.setAttribute("films", films);
        request.getRequestDispatcher("/WEB-INF/views/films-par-acteur.jsp").forward(request, response);
    }
}
