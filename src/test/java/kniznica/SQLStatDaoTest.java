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
public class SQLStatDaoTest {

    private final SQLFilmDao sqlFilm = new SQLFilmDao();
    private final SQLStatDao sqlStat = new SQLStatDao();

    @BeforeClass
    public static void setUp() {
        System.setProperty("junit", "true");
    }

    @Test
    public void pridatTest() throws MalformedURLException {
        Stat pridany = new Stat();
        pridany.setId(sqlFilm.idecko());
        pridany.setNazov("USA");
        sqlStat.pridat(pridany);
        assertNotNull(pridany.getId());
        Stat kontrolny = sqlStat.podlaID(pridany.getId());
        assertNotNull(kontrolny);

    }

    @Test
    public void vymazTest() throws MalformedURLException {
        Stat pridany = new Stat();
        pridany.setId(sqlFilm.idecko());
        pridany.setNazov("USA");
        sqlStat.pridat(pridany);
        assertNotNull(pridany.getId());
        sqlStat.odstranit(pridany);

    }

    @Test
    public void findAllTest() {
        List<Stat> staty = sqlStat.dajVsetkych();
        assertNotNull(staty);
    }
}
