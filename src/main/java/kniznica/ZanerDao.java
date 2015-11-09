
package kniznica;

import java.util.List;


public interface ZanerDao {
 public void pridat(Zaner zaner);

    public void odstranit(Zaner zaner);


    public List<Zaner> dajVsetkych();    
}
