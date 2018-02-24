package com.gdut.haoguimi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.tools.C3p0uti;

public class ShareBoardDao {
public ReturnTemplate doCheckBasketballPage() throws SQLException,ClassNotFoundException
{
	ReturnTemplate returnTemplate=new ReturnTemplate();
	String sql="select count(*) from sharebasketball";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next())
	{
		int rows=resultSet.getInt(1);
		rows=(rows+9)/10;
		returnTemplate.setRows(rows);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return returnTemplate;
}
public ReturnTemplate doCheckFootballPage() throws SQLException,ClassNotFoundException
{
	ReturnTemplate returnTemplate=new ReturnTemplate();
	String sql="select count(*) from sharefootball";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next())
	{
		int rows=resultSet.getInt(1);
		rows=(rows+9)/10;
		returnTemplate.setRows(rows);
		}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return returnTemplate;
}
public ReturnTemplate doCheckBadmintonPage() throws SQLException,ClassNotFoundException
{
	ReturnTemplate returnTemplate=new ReturnTemplate();
	String sql="select count(*) from sharebadminton";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next())
	{
		int rows=resultSet.getInt(1);
		rows=(rows+9)/10;
		returnTemplate.setRows(rows);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return returnTemplate;
}
public ReturnTemplate doCheckGymPage() throws SQLException,ClassNotFoundException
{
	ReturnTemplate returnTemplate=new ReturnTemplate();
	String sql="select count(*) from sharegym";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next())
	{
		int rows=resultSet.getInt(1);
		rows=(rows+9)/10;
		returnTemplate.setRows(rows);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return returnTemplate;
}
public ReturnTemplate doCheckRunningPage() throws SQLException,ClassNotFoundException
{
	ReturnTemplate returnTemplate=new ReturnTemplate();
	String sql="select count(*) from sharerunning";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next())
	{
		int rows=resultSet.getInt(1);
		rows=(rows+9)/10;
		returnTemplate.setRows(rows);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return returnTemplate;
}
public ReturnTemplate doCheckSwimmingPage() throws SQLException,ClassNotFoundException
{
	ReturnTemplate returnTemplate=new ReturnTemplate();
	String sql="select count(*) from shareswimming";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next())
	{
		int rows=resultSet.getInt(1);
		rows=(rows+9)/10;
		returnTemplate.setRows(rows);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return returnTemplate;
}
}
