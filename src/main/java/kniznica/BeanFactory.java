
package kniznica;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
import kniznica.FilmDao;
import kniznica.HerecDao;
import kniznica.StatDao;
import kniznica.ZanerDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.sqlite.SQLiteDataSource;
import sk.upjs.ics.paz1c.mp3library.SqliteMigration;

public enum BeanFactory {
       INSTANCE;

    private FilmDao filmDao;
    private HerecDao herecDao;
    private StatDao statDao;
    private ZanerDao zanerDao;
    private JdbcTemplate jdbcTemplate;
    
    public FilmDao filmDao() {
        if (this.filmDao == null) {
            this.filmDao=new SqlliteFilmDao(jdbcTemplate());
            
        }
        return this.filmDao;
    } 
    private DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        
        if ("true".equals(System.getProperty("junit"))) {
            dataSource.setUrl("jdbc:sqlite:projektHlavny-test.db");
        } else {
            dataSource.setUrl("jdbc:sqlite:projektHlavny.db");
        }

        return dataSource;
    }
    public JdbcTemplate jdbcTemplate() {
        if (this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(dataSource());
            initDatabase();
        }
        return this.jdbcTemplate;
    }
    private void initDatabase() {
        try {
            new SqliteMigration(jdbcTemplate).migrate();
        } catch (SQLException ex) {
            System.err.println("Nepodarilo sa nacitat databazu");
        }

    }
    private Properties getProperties() throws IOException {
        InputStream config = BeanFactory.class.getResourceAsStream("config.properties");
        Properties properties = new Properties();
        properties.load(config);

        return properties;}
}
