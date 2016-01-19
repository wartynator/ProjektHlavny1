package kniznica;

public class Stat {

    private int id;
    private String nazov;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;

    }

    public String toString() {

        return this.nazov;
    }
}
