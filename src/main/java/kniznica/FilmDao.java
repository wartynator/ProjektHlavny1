package kniznica;

import java.util.List;

public interface FilmDao {

    public void pridat(Film film);

    public void odstranit(Film film);

    public List<Film> dajVsetkych();

    public int idecko(String meno);

    public List<Film> dajVsetkychZaner(String zaner);

    public List<Film> dajTop10();

    public List<Film> dajNajnov10();

    public List<Film> dajFilmyZanre(String zaner);

    public Film podlaID(int id);

    public List<Film> dajVsetkychZID(String id);
}
