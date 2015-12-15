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
public class SQLReziserTest {
    
   private final SQLReziser sqlReziser = new SQLReziser();    
    private final SQLFilm sqlFilm = new SQLFilm();
    @BeforeClass
    public static void setUp() {
        System.setProperty("junit", "true");
    }
    
    @Test
    public void pridatTest() throws MalformedURLException {
        Reziser pridany = new Reziser();
        pridany.setId(sqlFilm.idecko());
        pridany.setMeno("Troy McLoor");
        URL recenzia = new URL("https://sk.wikipedia.org/");
        pridany.setWiki(recenzia);
        sqlReziser.pridat(pridany);
        Reziser kontrolny = sqlReziser.podlaID(pridany.getId());
        assertNotNull(kontrolny);
        
    }
    
   
    @Test
    public void vymazTest() throws MalformedURLException {
       Reziser pridany = new Reziser();
        pridany.setId(sqlFilm.idecko());
        pridany.setMeno("Troy McLoor");
        URL recenzia = new URL("https://sk.wikipedia.org/");
        pridany.setWiki(recenzia);
        sqlReziser.pridat(pridany);
        assertNotNull(pridany.getId());
        sqlReziser.odstranit(pridany);
       
            }
    
    
    
    @Test
    public void findAllTest() {
        List<Reziser> reziseri = sqlReziser.dajVsetkych();
        assertNotNull(reziseri);
    }
}
