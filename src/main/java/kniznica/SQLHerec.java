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

public class SQLHerec implements HerecDao {
    private JdbcTemplate jdbcTemplate;
    
    public SQLHerec() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/databaza_filmov");
        dataSource.setUser("root");
        dataSource.setPassword("Rastislav1");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    

    @Override
    public void pridat(Herec herec) {
        String sql = "INSERT INTO herec VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,herec.getId(),  herec.getMeno(),herec.getWiki().toString());
    }

    @Override
    public List<Herec> dajVsetkych() {
        String sql = "SELECT * FROM herec";
        BeanPropertyRowMapper<Herec> mapper = BeanPropertyRowMapper.newInstance(Herec.class);
        return jdbcTemplate.query(sql, mapper);
    }
    
    @Override
    public void odstranit(Herec herec) {
        String sql = "DELETE FROM herec WHERE id = ?";
        jdbcTemplate.update(sql, herec.getId());
    }
    
   public Herec podlaID(int id){
        String sql = "SELECT * FROM herec where id = "+id;
        BeanPropertyRowMapper<Herec> mapper = BeanPropertyRowMapper.newInstance(Herec.class);
        List<Herec>herci= jdbcTemplate.query(sql, mapper);
        Herec vysledny = herci.get(0);
        return vysledny;}
   
    public List<Herec> dajVsetkychZID(String id) {
        String sql = "SELECT * FROM herec where id = "+id;
        BeanPropertyRowMapper<Herec> mapper = BeanPropertyRowMapper.newInstance(Herec.class);
        return jdbcTemplate.query(sql, mapper);
    }
    
}
