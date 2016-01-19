/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

/**
 *
 * @author Matúš
 */
public enum FilmDaoFactory {

    INSTANCE;

    public FilmDao getFilmDao() {

        return new SQLFilmDao();

    }
}
