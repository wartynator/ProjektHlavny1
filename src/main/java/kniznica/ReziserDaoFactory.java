package kniznica;

/**
 *
 * @author Matúš
 */
public enum ReziserDaoFactory {

    INSTANCE;

    public ReziserDao getReziserDao() {
        return new SQLReziserDao();
    }
}
