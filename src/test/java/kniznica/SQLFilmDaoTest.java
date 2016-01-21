/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rastislav
 */
public class SQLFilmDaoTest {

    private final SQLFilmDao sqlFilm = new SQLFilmDao();

    @BeforeClass
    public static void setUp() {
        System.setProperty("junit", "true");
    }

    @Test
    public void insertTest() throws ParseException, MalformedURLException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Film pridanyFilm = new Film();
        pridanyFilm.setNazov("Skusobny");
        pridanyFilm.setDlzka(10);
        pridanyFilm.setHodnotenie(5);
        pridanyFilm.setId(sqlFilm.idecko(pridanyFilm.getNazov()));
        pridanyFilm.setObsah("tasggs");
        Date datum = sdf.parse(1999 + "-" + 12 + "-" + 12);
        pridanyFilm.setPremiera(datum);
        URL recenzia = new URL("https://sk.wikipedia.org/");
        pridanyFilm.setRecenzia(recenzia);
        URL trailer = new URL("https://sk.wikipedia.org/");
        pridanyFilm.setTrailer(trailer);
        sqlFilm.pridat(pridanyFilm);
        assertNotNull(pridanyFilm.getId());
        Film kontrolnyFilm = sqlFilm.podlaID(pridanyFilm.getId());
        assertNotNull(kontrolnyFilm);

    }

    @Test
    public void deleteTest() throws ParseException, MalformedURLException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Film pridanyFilm = new Film();
        pridanyFilm.setNazov("Skusobny");
        pridanyFilm.setDlzka(10);
        pridanyFilm.setHodnotenie(5);
        pridanyFilm.setId(sqlFilm.idecko(pridanyFilm.getNazov()));
        pridanyFilm.setObsah("tasggs");
        Date datum = sdf.parse(1999 + "-" + 12 + "-" + 12);
        pridanyFilm.setPremiera(datum);
        URL recenzia = new URL("https://sk.wikipedia.org/");
        pridanyFilm.setRecenzia(recenzia);
        URL trailer = new URL("https://sk.wikipedia.org/");
        pridanyFilm.setTrailer(trailer);
        sqlFilm.pridat(pridanyFilm);
        assertNotNull(pridanyFilm.getId());
        sqlFilm.odstranit(pridanyFilm);

    }

    @Test
    public void findAllTest() {
        List<Film> filmy = sqlFilm.dajVsetkych();
        assertNotNull(filmy);
    }

}
