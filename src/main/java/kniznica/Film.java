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
    private int hodtenie;
    private Herec herec;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getHodtenie() {
        return hodtenie;
    }

    public void setHodtenie(int hodtenie) {
        this.hodtenie = hodtenie;
    }

    public Herec getHerec() {
        return herec;
    }

    public void setHerec(Herec herec) {
        this.herec = herec;
    }

    public Zaner getZaner() {
        return zaner;
    }

    public void setZaner(Zaner zaner) {
        this.zaner = zaner;
    }

    public Time getDlzka() {
        return dlzka;
    }

    public void setDlzka(Time dlzka) {
        this.dlzka = dlzka;
    }

    public Date getPremiera() {
        return premiera;
    }

    public void setPremiera(Date premiera) {
        this.premiera = premiera;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
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

    public URL getRecenzie() {
        return recenzie;
    }

    public void setRecenzie(URL recenzie) {
        this.recenzie = recenzie;
    }
    private Zaner zaner;
    private Time dlzka;
    private Date premiera;
    private Stat stat;
    private String obsah;
    private URL trailer;
    private URL recenzie;
    
}
