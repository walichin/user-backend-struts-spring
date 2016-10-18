package com.walichin.dataaccess;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List;  

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveUser(UserData e) {
		String query = "insert into adm_user_mt (name, login, password) values('" + e.getName() + "','" + e.getLogin()
				+ "','" + e.getPassword() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateUser(UserData e) {
		String query = "update adm_user_mt set name='" + e.getName() + "',login='" + e.getLogin() + "',password='"
				+ e.getPassword() + "' where user_id='" + e.getUser_id() + "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteUser(UserData e) {
		String query = "delete from adm_user_mt where user_id='" + e.getUser_id() + "' ";
		return jdbcTemplate.update(query);
	}

	public List<UserData> getAllUsers() {
		
		return jdbcTemplate.query("select * from adm_user_mt", new ResultSetExtractor<List<UserData>>() {
			
			@Override
			public List<UserData> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<UserData> list = new ArrayList<UserData>();
				
				while (rs.next()) {
					
					UserData e = new UserData();
					e.setUser_id(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setLogin(rs.getString(3));
					e.setPassword(rs.getString(4));
					list.add(e);
				}
				return list;
			}
		});
	}

}
