
package kniznica;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


class SqlliteFilmDao {
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final RowMapper<Film> filmRowMapper =new FilmRowMapper();
    public SqlliteFilmDao(){
    }
    public SqlliteFilmDao(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate=jdbcTemplate;
    this.namedParameterJdbcTemplate= new NamedParameterJdbcTemplate(jdbcTemplate());}
               
            }
