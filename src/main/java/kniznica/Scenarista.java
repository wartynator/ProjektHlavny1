/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import java.net.URL;

/**
 *
 * @author Rastislav
 */
public class Scenarista {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String meno;
    private URL wiki;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public URL getWiki() {
        return wiki;
    }

    public void setWiki(URL wiki) {
        this.wiki = wiki;
    }

    public String toString() {
        return this.meno;
    }
}
