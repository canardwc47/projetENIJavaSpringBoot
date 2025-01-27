//package fr.eni.projet.projeteni.dal;
//
//
//import fr.eni.projet.projeteni.bo.Retrait;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class DaoRetraitSQLImpl implements DaoRetrait {
//
//    static final String SELECT_ALL = "select * from retraits";
//    static final String SELECT_BY_ID = "select * from retraits where no_article=?";
//    static final String INSERT = "INSERT  INTO retraits ([no_article],[rue],[code_postal],[ville]) VALUES (:no_article,:rue, :code_postal, :ville)";
//    static final String DELETE = "DELETE FROM retraits where no_article=?";
//    static final String UPDATE = "UPDATE retraits set rue=?,code_postal=?, ville=? where no_article=?";
//
//    JdbcTemplate jdbcTemplate;
//    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    public DaoRetraitSQLImpl(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
//    }
//
//    @Override
//    public List<Retrait> read() {
//        return jdbcTemplate.query(SELECT_ALL, BeanPropertyRowMapper.newInstance(Retrait.class));
//    }
//
//    @Override
//    public Retrait read(int id) {
//        return jdbcTemplate.queryForObject(SELECT_BY_ID, BeanPropertyRowMapper.newInstance(Retrait.class), id);
//    }
//
////    @Override
////    public int create(Chat chat) {
////        return jdbcTemplate.update(INSERT, chat.getName(), chat.getColor());
////    }
//
//    @Override
//    public int create(Retrait retrait) {
//        var namedparameters = new MapSqlParameterSource();
//        namedparameters.addValue("rue", retrait.getRue());
//        namedparameters.addValue("code_postal", retrait.getCode_postal());
//        namedparameters.addValue("ville", retrait.getVille());
//        var keyHolder = new GeneratedKeyHolder();
//        namedParameterJdbcTemplate.update(INSERT, namedparameters, keyHolder);
//        return keyHolder.getKey().intValue();
//    }
//
//
//    @Override
//    public void update(Retrait retrait) {
//        jdbcTemplate.update(UPDATE, retrait.getRue(), retrait.getCode_postal(), retrait.getVille());
//    }
//
//    @Override
//    public void delete(Retrait retrait) {
//        delete(retrait.ge);
//    }
//
//    @Override
//    public void delete(int id) {
//        jdbcTemplate.update(DELETE, id);
//    }
//}
