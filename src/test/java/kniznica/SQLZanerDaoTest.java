/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import java.net.MalformedURLException;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rastislav
 */
public class SQLZanerDaoTest {

    private final SQLZanerDao sqlZaner = new SQLZanerDao();
    private final SQLFilmDao sqlFilm = new SQLFilmDao();

    @BeforeClass
    public static void setUp() {
        System.setProperty("junit", "true");
    }

    @Test
    public void pridatTest() throws MalformedURLException {
        Zaner pridany = new Zaner();
        pridany.setId(1);
        pridany.setMeno("akcny");
        sqlZaner.pridat(pridany);
        assertNotNull(pridany.getId());
        Zaner kontrolny = sqlZaner.podlaID(pridany.getId());
        assertNotNull(kontrolny);

    }

    @Test
    public void vymazTest() throws MalformedURLException {
        Zaner pridany = new Zaner();
        pridany.setId(1);
        pridany.setMeno("akcny");
        sqlZaner.pridat(pridany);
        assertNotNull(pridany.getId());
        sqlZaner.odstranit(pridany);

    }

    @Test
    public void findAllTest() {
        List<Zaner> zanre = sqlZaner.dajVsetkych();
        assertNotNull(zanre);
    }
}
