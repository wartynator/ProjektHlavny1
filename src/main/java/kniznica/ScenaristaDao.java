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
public interface ScenaristaDao {
    public void pridat(Scenarista scenarista);

    public void odstranit(Scenarista scenarista);

    public List<Scenarista> dajVsetkych();
    public List<Scenarista> dajVsetkychZID(String id);
    public Scenarista podlaID(int id);
}