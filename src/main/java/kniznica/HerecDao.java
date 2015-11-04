
package kniznica;

import java.util.List;

public interface HerecDao {
     public void saveOrUpdate(Herec herec);

    public void delete(Herec herec);

    public Herec findById(Long id);
    
    public Herec findByName(String name);

    public List<Herec> findAll();
}
