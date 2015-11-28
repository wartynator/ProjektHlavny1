/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import java.util.List;

/**
 *
 * @author Rastislav
 */
public interface ReziserDao {
    public void pridat(Reziser reziser);

    public void odstranit(Reziser reziser);

    public List<Reziser> dajVsetkych();
}
