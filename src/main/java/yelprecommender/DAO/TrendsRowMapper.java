package yelprecommender.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import yelprecommender.model.Trends;

public class TrendsRowMapper implements RowMapper<Trends>{

	//@Override -- To use this change Java Compiler compliance to 1.6 
	public Trends mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		// TODO Auto-generated method stub			
		Trends trends = new Trends();
		trends.setCity(resultSet.getString(1));
		trends.setZip(resultSet.getString(2));
		trends.setTrendingCategory(resultSet.getString(3));
		trends.setTrendingBusiness(resultSet.getString(4));
		return trends;	
	}

}
