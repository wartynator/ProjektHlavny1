
package kniznica;

import java.util.List;


public interface FilmDao {
   public void pridat(Film film);

    public void odstranit(Film film);

    public List<Film> dajVsetkych();
}
