
package kniznica;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SQLZaner implements ZanerDao {
    private JdbcTemplate jdbcTemplate;
    
    public SQLZaner() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/databaza_filmov");
        dataSource.setUser("matus");
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
        String sql = "SELECT * FROM zaner";
        
        BeanPropertyRowMapper<Zaner> mapper = BeanPropertyRowMapper.newInstance(Zaner.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public void odstranit(Zaner zaner) {
        String sql = "DELETE FROM zaner WHERE id = ?";
        jdbcTemplate.update(sql, zaner.getId());
    }
    
}

