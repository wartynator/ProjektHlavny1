
package kniznica;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class SQLStat implements StatDao {
    private JdbcTemplate jdbcTemplate;
    
    public SQLStat() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/databaza_filmov");
        dataSource.setUser("matus");
        dataSource.setPassword("Rastislav1");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    

    @Override
    public void pridat(Stat stat) {
        String sql = "INSERT INTO stat VALUES (?, ?)";
        jdbcTemplate.update(sql, stat.getId(), stat.getNazov());
    }

    @Override
    public List<Stat> dajVsetkych() {
        String sql = "SELECT * FROM stat";
        
        BeanPropertyRowMapper<Stat> mapper = BeanPropertyRowMapper.newInstance(Stat.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public void odstranit(Stat stat) {
        String sql = "DELETE FROM stat WHERE id = ?";
        jdbcTemplate.update(sql, stat.getId());
    }
    
}
