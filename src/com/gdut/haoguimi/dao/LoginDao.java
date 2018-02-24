package com.gdut.haoguimi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gdut.haoguimi.bean.Loginbean;
import com.gdut.haoguimi.tools.C3p0uti;

public class LoginDao {
public boolean doLogin(Loginbean loginbean)throws SQLException, ClassNotFoundException{
	boolean result=false;
	String sql="select *from user where id= ? and password = ? ";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setString(1, loginbean.getId());
	preparedStatement.setString(2, loginbean.getPassword());
	ResultSet resultSet =preparedStatement.executeQuery();
	if(resultSet.next())
	{
		result=true;
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doCheck(Loginbean loginbean,String string)
{
	boolean result=false;
	if(loginbean.getCheckcode().equals(string))
	{
		result=true;
	}
	return result;
}
public boolean doCheckUsername(Loginbean loginbean)
{
	boolean result=false;
	String sql="select *from user where id = ?";
	try {
		Connection connection=C3p0uti.getMySqlConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, loginbean.getId());
		ResultSet resultSet =preparedStatement.executeQuery();
		if(resultSet.next())
		{
			result=true;
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return result;
}
}
