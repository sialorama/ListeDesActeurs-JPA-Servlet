package org.demo.dao;

import org.demo.model.Film;
import java.util.List;

public interface AuteurDao {
    List<Film> getFilmsByActeur(int acteurId);
}
