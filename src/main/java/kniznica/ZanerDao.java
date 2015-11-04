
package kniznica;

import java.util.List;


public interface ZanerDao {
 public void saveOrUpdate(Zaner zaner);

    public void delete(Zaner zaner);

    public Zaner findById(Long id);
    
    public Zaner findByName(String name);

    public List<Zaner> findAll();    
}
