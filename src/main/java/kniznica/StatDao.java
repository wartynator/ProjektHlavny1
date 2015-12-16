
package kniznica;

import java.util.List;

public interface StatDao {
     public void pridat(Stat stat);

    public void odstranit(Stat stat);

    public List<Stat> dajVsetkych();
    public List<Stat> dajVsetkychZID(String id);
     public Stat podlaID(int id);
}
