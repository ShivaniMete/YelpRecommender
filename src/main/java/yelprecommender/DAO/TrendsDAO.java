package yelprecommender.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;


import yelprecommender.model.Trends;

public class TrendsDAO {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}

	public Trends getTrend(String city, String zipCode){
		System.out.println("in getTrend DAO");
		String sql = "SELECT * FROM lasvegastrends WHERE city =? and zip =?";
		System.out.println("SELECT * FROM lasvegastrends WHERE city = '" +city + "' and zip = '" + zipCode + "'");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);	
		List<Trends> trend = jdbcTemplate.query(sql, new Object[] { city, zipCode }, new TrendsRowMapper());
		if(trend.size()!=0)
		{
			return trend.get(0);
		}
		else
			return null;
	}

}
