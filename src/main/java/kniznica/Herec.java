
package kniznica;

import java.net.URL;

class Herec {
    private Long id;
    private String meno;
    private URL wiki;//prepisat v databaze na text z varchar

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    
}
