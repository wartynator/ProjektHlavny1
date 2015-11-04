
package kniznica;

import java.util.List;

public interface StatDao {
     public void saveOrUpdate(Stat stat);

    public void delete(Stat stat);

    public Stat findById(Long id);
    
    public Stat findByName(String name);
    public List<Stat> findAll();
}
