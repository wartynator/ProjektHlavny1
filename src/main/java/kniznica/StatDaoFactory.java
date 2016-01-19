package kniznica;

/**
 *
 * @author Matúš
 */
public enum StatDaoFactory {

    INSTANCE;

    public StatDao getStatDao() {
        return new SQLStatDao();
    }
}
