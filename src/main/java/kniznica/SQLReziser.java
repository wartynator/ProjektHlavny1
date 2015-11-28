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
public class SQLReziser implements ReziserDao{
     private JdbcTemplate jdbcTemplate;
    
    public SQLReziser() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/databaza_filmov");
        dataSource.setUser("root");
        dataSource.setPassword("Rastislav1");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    

    @Override
    public void pridat(Reziser reziser) {
        String sql = "INSERT INTO reziser VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,reziser.getId(),  reziser.getMeno(),reziser.getWiki().toString());
    }
    
    @Override
    public List<Reziser> dajVsetkych() {
        String sql = "SELECT * FROM reziser";
        BeanPropertyRowMapper<Reziser> mapper = BeanPropertyRowMapper.newInstance(Reziser.class);
        return jdbcTemplate.query(sql, mapper);
    }
    
    @Override
    public void odstranit(Reziser reziser) {
        String sql = "DELETE FROM reziser WHERE id = ?";
        jdbcTemplate.update(sql, reziser.getId());
    }
}
