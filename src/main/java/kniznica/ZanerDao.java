
package kniznica;

import java.util.List;


public interface ZanerDao {
 public void pridat(Zaner zaner);

    public void odstranit(Zaner zaner);


    public List<Zaner> dajVsetkych();    

    public List<Zaner> dajVsetkychZID(String id);
    public Zaner podlaID(int id);
}
