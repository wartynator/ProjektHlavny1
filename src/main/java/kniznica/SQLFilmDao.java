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

public class SQLFilmDao implements FilmDao {

    private JdbcTemplate jdbcTemplate;

    public SQLFilmDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/databaza_filmov");
        dataSource.setUser("root");
        dataSource.setPassword("Rastislav1");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void pridat(Film film) {
        String sql = "INSERT INTO filmy VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, null, film.getHodnotenie(), film.getNazov(), film.getDlzka(), film.getPremiera(), film.getObsah(), film.getTrailer().toString(), film.getRecenzia().toString());
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

    @Override
    public int idecko(String meno) {
        String sql = "select id from filmy where nazov like " + "'" + meno + "'";
        int i = jdbcTemplate.queryForInt(sql);
        return i;
    }

    @Override
    public Film podlaID(int id) {
        String sql = "SELECT * FROM filmy where id = " + id;
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        List<Film> filmy = jdbcTemplate.query(sql, mapper);
        Film vysledny = filmy.get(0);
        return vysledny;
    }

    @Override
    public List<Film> dajVsetkychZaner(String zaner) {
        String sql = "SELECT * FROM filmy WHERE zaner = " + zaner;
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public List<Film> dajVsetkychZID(String id) {
        String sql = "SELECT * FROM filmy where id = " + id;
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public List<Film> dajTop10() {
        String sql = "SELECT * FROM filmy order by hodnotenie desc limit 10";
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);

        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public List<Film> dajNajnov10() {
        String sql = "SELECT * FROM filmy order by id desc limit 10";
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public List<Film> dajPodlaPismen(String pismena) {
        String sql = "SELECT nazov FROM filmy where nazov like '" + pismena + "%'order by nazov asc limit 10";
        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public List<Film> dajFilmyZanre(String zaner) {
        String sql = "select f1.* from filmy f1 join zaner z1 on f1.id = z1.id where z1.meno like " + "'" + zaner + "'";

        BeanPropertyRowMapper<Film> mapper = BeanPropertyRowMapper.newInstance(Film.class);
        return jdbcTemplate.query(sql, mapper);
    }

}
