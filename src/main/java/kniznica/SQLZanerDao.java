package kniznica;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SQLZanerDao implements ZanerDao {

    private JdbcTemplate jdbcTemplate;

    public SQLZanerDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/databaza_filmov");
        dataSource.setUser("root");
        dataSource.setPassword("Rastislav1");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void pridat(Zaner zaner) {
        String sql = "INSERT INTO zaner VALUES (?, ?)";
        jdbcTemplate.update(sql, zaner.getId(), zaner.getMeno());
    }

    @Override
    public List<Zaner> dajVsetkych() {
        String sql = "SELECT DISTINCT meno FROM zaner";

        BeanPropertyRowMapper<Zaner> mapper = BeanPropertyRowMapper.newInstance(Zaner.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public void odstranit(Zaner zaner) {
        String sql = "DELETE FROM zaner WHERE id = ?";
        jdbcTemplate.update(sql, zaner.getId());
    }

    @Override
    public List<Zaner> dajVsetkychZID(String id) {
        String sql = "SELECT * FROM zaner where id = " + id;
        BeanPropertyRowMapper<Zaner> mapper = BeanPropertyRowMapper.newInstance(Zaner.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public Zaner podlaID(int id) {
        String sql = "SELECT * FROM zaner where id = " + id;
        BeanPropertyRowMapper<Zaner> mapper = BeanPropertyRowMapper.newInstance(Zaner.class);
        List<Zaner> zanre = jdbcTemplate.query(sql, mapper);
        Zaner vysledny = zanre.get(0);
        return vysledny;
    }

    @Override
    public List<Zaner> dajPodlaPismen(String pismena) {
        String sql = "SELECT meno FROM zaner where nazov like '" + pismena + "%'order by nazov asc limit 10";
        BeanPropertyRowMapper<Zaner> mapper = BeanPropertyRowMapper.newInstance(Zaner.class);
        return jdbcTemplate.query(sql, mapper);
    }
}
