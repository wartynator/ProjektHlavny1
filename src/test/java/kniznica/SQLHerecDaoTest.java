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
public class SQLHerecDaoTest {

    private final SQLHerecDao sqlHerec = new SQLHerecDao();
    private final SQLFilmDao sqlFilm = new SQLFilmDao();

    @BeforeClass
    public static void setUp() {
        System.setProperty("junit", "true");
    }

    @Test
    public void pridatTest() throws MalformedURLException {
        Herec pridanyHerec = new Herec();
        pridanyHerec.setId(1);
        pridanyHerec.setMeno("Troy McLoor");
        URL recenzia = new URL("https://sk.wikipedia.org/");
        pridanyHerec.setWiki(recenzia);
        sqlHerec.pridat(pridanyHerec);
        assertNotNull(pridanyHerec.getId());
        Herec kontrolny = sqlHerec.podlaID(pridanyHerec.getId());
        assertNotNull(kontrolny);

    }

    @Test
    public void vymazTest() throws MalformedURLException {
        Herec pridanyHerec = new Herec();
        pridanyHerec.setId(1);
        pridanyHerec.setMeno("Troy McLoor");
        URL recenzia = new URL("https://sk.wikipedia.org/");
        pridanyHerec.setWiki(recenzia);
        sqlHerec.pridat(pridanyHerec);
        assertNotNull(pridanyHerec.getId());
        sqlHerec.odstranit(pridanyHerec);

    }

    @Test
    public void findAllTest() {
        List<Herec> herci = sqlHerec.dajVsetkych();
        assertNotNull(herci);
    }

}
