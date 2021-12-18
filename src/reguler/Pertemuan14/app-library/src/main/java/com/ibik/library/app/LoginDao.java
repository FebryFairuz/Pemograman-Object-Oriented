package com.ibik.library.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	private String sqlLogin = "select* from user where NIK = ? and password = ?";
	public User checkLogin (User user) throws exception {
		if(user == null) {
			return null;
		}
		ConnectionDB conn = new ConnectionDB();
		Connection c = conn.connect();
		PreparedStatement pst = c.prepareStatement(sqlLogin);
		pst.setLong(1, user.getNIK());
		pst.setString(2, user.getPassword());
		ResultSet rs = pst.executeQuery();
		if(!rs.next()) {
			return null;
		}
		User l = new User();
		l.setID(rs.getInt("ID"));
		l.setNIK(rs.getLong("NIK"));
		l.setFullName(rs.getString("FullName"));
		l.setPlaceBirth(rs.getString("PlaceBirth"));
		l.setBirthDate(rs.getString("BirthDate"));
		l.setGender(rs.getString("Gender"));
		l.setAddress(rs.getString("Address"));
		l.setEmail(rs.getString("Email"));
		l.setPassword(rs.getString("Password"));
		
		c.close();
		return l;
	
	}
}

