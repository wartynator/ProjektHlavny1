/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniznica;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Rastislav
 */
public class SQLKombinovaneTabulky {
   
    private JdbcTemplate jdbcTemplate;
  
    public SQLKombinovaneTabulky(){
    MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/databaza_filmov");
        dataSource.setUser("root");
        dataSource.setPassword("WaR753321");
        
        jdbcTemplate = new JdbcTemplate(dataSource);}
}
