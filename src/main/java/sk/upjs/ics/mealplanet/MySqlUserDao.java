package sk.upjs.ics.mealplanet;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlUserDao implements UserDao {
    
    private JdbcTemplate jdbcTemplate;
    
    public MySqlUserDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/mealplanet");
        dataSource.setUser("receptar");
        dataSource.setPassword("receptar");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void addUser(User user) {
         String sql = "INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,null,user.getUzivatelskeMeno(), user.getHeslo(), user.getMeno(), user.getPriezvisko(),
                user.getAdresa(), user.getTelefonneCislo(), user.getEmail());
    }

    @Override
    public void deleteUser() {
        
    }

    @Override
    public List<User> getUser(String uzivatelskeMeno, String heslo) {
        String sql = "select * from user where uzivatelskeMeno = ? and heslo = ?";
        BeanPropertyRowMapper<User> mapper = BeanPropertyRowMapper.newInstance(User.class);
        List<User> pom = jdbcTemplate.query(sql, mapper,uzivatelskeMeno,heslo);
        return pom;        
    }
    
}
