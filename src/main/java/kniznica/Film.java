/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import java.net.URL;
import java.sql.Time;
import java.util.Date;

public class Film {

    private int Id;
    private int hodnotenie;
    private String nazov;
    private int dlzka;
    private Date premiera;
    private String obsah;
    private URL trailer;
    private URL recenzia;

    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public int getHodnotenie() {
        return hodnotenie;
    }

    public void setHodnotenie(int hodnotenie) {
        this.hodnotenie = hodnotenie;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getDlzka() {
        return dlzka;
    }

    public void setDlzka(int dlzka) {
        this.dlzka = dlzka;
    }

    public Date getPremiera() {
        return premiera;
    }

    public void setPremiera(Date premiera) {
        this.premiera = premiera;
    }

    public String getObsah() {
        return obsah;
    }

    public void setObsah(String obsah) {
        this.obsah = obsah;
    }

    public URL getTrailer() {
        return trailer;
    }

    public void setTrailer(URL trailer) {
        this.trailer = trailer;
    }

    public URL getRecenzia() {
        return recenzia;
    }

    public void setRecenzia(URL recenzia) {
        this.recenzia = recenzia;
    }

    public String toString() {
        return this.nazov;
    }

}
