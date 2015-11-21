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
        dataSource.setUrl("jdbc:mysql://localhost/film");
        dataSource.setUser("film");
        dataSource.setPassword("film");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    

    @Override
    public void pridat(Film film) {
        String sql = "INSERT INTO film VALUES (?,?, ?, ?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, film.getId(), film.getHodtenie(),film.getNazov(),film.getHerci(),film.getZaner(),film.getDlzka(),film.getPremiera(),film.getStat(),film.getObsah(),film.getTrailer(),film.getRecenzie());
    }

    @Override
    public List<Film> dajVsetkych() {
        String sql = "SELECT * FROM film";
        
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public void odstranit(Film film) {
        String sql = "DELETE FROM film WHERE id = ?";
        jdbcTemplate.update(sql, film.getId());
    }

    public List<Film> dajZanre(String meno) {
        String sql = "SELECT * FROM film WHERE zaner =" + meno;
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }
    
}


