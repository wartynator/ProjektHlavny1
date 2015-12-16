/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Rastislav
 */
public class SQLScenarista implements ScenaristaDao{
     private JdbcTemplate jdbcTemplate;
    
    public SQLScenarista() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/databaza_filmov");
        dataSource.setUser("root");
        dataSource.setPassword("WaR753321");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    

    @Override
    public void pridat(Scenarista scenarista) {
        String sql = "INSERT INTO scenarista VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,scenarista.getId(),  scenarista.getMeno(),scenarista.getWiki().toString());
    }
    
    @Override
    public List<Scenarista> dajVsetkych() {
        String sql = "SELECT * FROM scenarista";
        BeanPropertyRowMapper<Scenarista> mapper = BeanPropertyRowMapper.newInstance(Scenarista.class);
        return jdbcTemplate.query(sql, mapper);
    }
    
    @Override
    public void odstranit(Scenarista scenarista) {
        String sql = "DELETE FROM scenarista WHERE id = ?";
        jdbcTemplate.update(sql, scenarista.getId());
    }
    @Override
     public List<Scenarista> dajVsetkychZID(String id) {
        String sql = "SELECT * FROM scenarista WHERE id = "+id;
        BeanPropertyRowMapper<Scenarista> mapper = BeanPropertyRowMapper.newInstance(Scenarista.class);
        return jdbcTemplate.query(sql, mapper);
    }
 @Override
     public Scenarista podlaID(int id){
        String sql = "SELECT * FROM scenarista where id = "+id;
        BeanPropertyRowMapper<Scenarista> mapper = BeanPropertyRowMapper.newInstance(Scenarista.class);
        List<Scenarista>herci= jdbcTemplate.query(sql, mapper);
        Scenarista vysledny = herci.get(0);
        return vysledny;}
}
