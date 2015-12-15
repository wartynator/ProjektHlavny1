/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        jdbcTemplate.update(sql, film.getId(), film.getHodnotenie(),film.getNazov(),film.getDlzka(),film.getPremiera(),film.getObsah(),film.getTrailer().toString(),film.getRecenzia().toString());
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
        jdbcTemplate.update(sql, film.getId());}
    
    public int idecko(){        
    String sql = "select max(id) from filmy";
    int i=jdbcTemplate.queryForInt(sql);
    return i+1;}

    
    public Film podlaID(int id){
        String sql = "SELECT * FROM filmy where id = "+id;
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        List<Film>filmy= jdbcTemplate.query(sql, mapper);
        Film vysledny = filmy.get(0);
        return vysledny;}
    
      @Override
    public List<Film> dajVsetkychZaner(String zaner) {
        String sql = "SELECT * FROM filmy WHERE zaner = " + zaner;
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);}
    
    public List<Film> dajVsetkychZID(String id) {
        String sql = "SELECT * FROM filmy where id = "+id;
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }
    
    public List<Film> dajTop10(){
        String sql = "SELECT * FROM filmy order by hodnotenie desc limit 10";
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }
    
    public List<Film> dajNajnov10(){
        String sql = "SELECT * FROM filmy order by id desc limit 10";
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }

}


