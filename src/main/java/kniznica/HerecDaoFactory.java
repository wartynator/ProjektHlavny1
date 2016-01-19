/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

/**
 *
 * @author Matúš
 */
public enum HerecDaoFactory {

    INSTANCE;

    public HerecDao getHerecDao() {
        return new SQLHerecDao();
    }
}
