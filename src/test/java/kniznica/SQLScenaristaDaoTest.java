/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rastislav
 */
public class SQLScenaristaDaoTest {

    private final SQLScenaristaDao sqlScenarista = new SQLScenaristaDao();
    private final SQLFilmDao sqlFilm = new SQLFilmDao();

    @BeforeClass
    public static void setUp() {
        System.setProperty("junit", "true");
    }

    @Test
    public void pridatTest() throws MalformedURLException {
        Scenarista pridany = new Scenarista();
        pridany.setId(sqlFilm.idecko());
        pridany.setMeno("Troy McLoor");
        URL recenzia = new URL("https://sk.wikipedia.org/");
        pridany.setWiki(recenzia);
        sqlScenarista.pridat(pridany);
        Scenarista kontrolny = sqlScenarista.podlaID(pridany.getId());
        assertNotNull(kontrolny);

    }

    @Test
    public void vymazTest() throws MalformedURLException {
        Scenarista pridany = new Scenarista();
        pridany.setId(sqlFilm.idecko());
        pridany.setMeno("Troy McLoor");
        URL recenzia = new URL("https://sk.wikipedia.org/");
        pridany.setWiki(recenzia);
        sqlScenarista.pridat(pridany);
        assertNotNull(pridany.getId());
        sqlScenarista.odstranit(pridany);

    }

    @Test
    public void findAllTest() {
        List<Scenarista> scenaristi = sqlScenarista.dajVsetkych();
        assertNotNull(scenaristi);
    }
}
