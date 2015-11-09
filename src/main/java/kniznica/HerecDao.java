
package kniznica;

import java.util.List;

public interface HerecDao {
     public void pridat(Herec herec);

    public void odstranit(Herec herec); 

    public List<Herec> dajVsetkych();
}
