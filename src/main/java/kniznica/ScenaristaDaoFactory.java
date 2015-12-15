package kniznica;

/**
 *
 * @author Matúš
 */
public enum ScenaristaDaoFactory {
    INSTANCE;
    public ScenaristaDao getScenaristaDao(){
    return new SQLScenarista();
    }
}