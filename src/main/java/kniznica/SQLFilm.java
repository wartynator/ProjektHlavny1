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

public class SQLFilm implements FilmDao {
    private JdbcTemplate jdbcTemplate;
    
    public SQLFilm() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/databaza_filmov");
        dataSource.setUser("root");
        dataSource.setPassword("Rastislav1");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    

    @Override
    public void pridat(Film film) {
        String sql = "INSERT INTO filmy VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, film.getId(), film.getHodtenie(),film.getNazov(),film.getDlzka(),film.getPremiera(),film.getObsah(),film.getTrailer().toString(),film.getRecenzie().toString());
    }

    @Override
    public List<Film> dajVsetkych() {
        String sql = "SELECT * FROM filmy";
        
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public void odstranit(Film film) {
        String sql = "DELETE FROM filmy WHERE id = ?";
        jdbcTemplate.update(sql, film.getId());
    }

    
    
}


