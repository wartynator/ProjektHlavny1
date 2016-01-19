package kniznica;

/**
 *
 * @author Matúš
 */
public enum ZanerDaoFactory {

    INSTANCE;

    public ZanerDao getZanerDao() {
        return new SQLZanerDao();
    }
}
