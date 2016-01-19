package kniznica;

import java.net.URL;

public class Herec {

    private int id;
    private String meno;
    private URL wiki;//prepisat v databaze na text z varchar

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
