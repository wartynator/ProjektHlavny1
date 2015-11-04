
package kniznica;

import java.util.List;


public interface FilmDao {
   public void saveOrUpdate(Film film);

    public void delete(Film film);

    public Film findById(Long id);
    
    public Film findByName(String name);

    public List<Film> findAll();
}
