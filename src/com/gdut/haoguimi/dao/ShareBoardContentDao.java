package com.gdut.haoguimi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.tools.C3p0uti;

public class ShareBoardContentDao {
public List<Sharebean> doBasketballContent(Sharebean sharebean) throws SQLException, ClassNotFoundException{
	String sqlString="select *from sharebasketball order by createtime desc limit ?,10 ";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getNum1());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean bean2=null;
	while(resultSet.next())
	{
		bean2=new Sharebean();
		bean2.setBoard(resultSet.getString("board"));
		bean2.setTitle(resultSet.getString("title"));
		bean2.setContent(resultSet.getString("content"));
		bean2.setCreatetime(resultSet.getString("createtime"));
		bean2.setId(resultSet.getInt("id"));
		bean2.setVisitcount(resultSet.getString("visitcount"));
		bean.add(bean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doFootballContent(Sharebean sharebean) throws SQLException, ClassNotFoundException{
	String sqlString="select *from sharefootball order by createtime desc limit ?,10 ";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getNum1());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean bean2=null;
	while(resultSet.next())
	{
		bean2=new Sharebean();
		bean2.setBoard(resultSet.getString("board"));
		bean2.setTitle(resultSet.getString("title"));
		bean2.setContent(resultSet.getString("content"));
		bean2.setCreatetime(resultSet.getString("createtime"));
		bean2.setId(resultSet.getInt("id"));
		bean2.setVisitcount(resultSet.getString("visitcount"));
		bean.add(bean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doBadmintonContent(Sharebean sharebean) throws SQLException, ClassNotFoundException{
	String sqlString="select *from sharebadminton order by createtime desc limit ?,10 ";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getNum1());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean bean2=null;
	while(resultSet.next())
	{
		bean2=new Sharebean();
		bean2.setBoard(resultSet.getString("board"));
		bean2.setTitle(resultSet.getString("title"));
		bean2.setContent(resultSet.getString("content"));
		bean2.setCreatetime(resultSet.getString("createtime"));
		bean2.setId(resultSet.getInt("id"));
		bean2.setVisitcount(resultSet.getString("visitcount"));
		bean.add(bean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doGymContent(Sharebean sharebean) throws SQLException, ClassNotFoundException{
	String sqlString="select *from sharegym order by createtime desc limit ?,10 ";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getNum1());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean bean2=null;
	while(resultSet.next())
	{
		bean2=new Sharebean();
		bean2.setBoard(resultSet.getString("board"));
		bean2.setTitle(resultSet.getString("title"));
		bean2.setContent(resultSet.getString("content"));
		bean2.setCreatetime(resultSet.getString("createtime"));
		bean2.setId(resultSet.getInt("id"));
		bean2.setVisitcount(resultSet.getString("visitcount"));
		bean.add(bean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doRunningContent(Sharebean sharebean) throws SQLException, ClassNotFoundException{
	String sqlString="select *from sharerunning order by createtime desc limit ?,10 ";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getNum1());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean bean2=null;
	while(resultSet.next())
	{
		bean2=new Sharebean();
		bean2.setBoard(resultSet.getString("board"));
		bean2.setTitle(resultSet.getString("title"));
		bean2.setContent(resultSet.getString("content"));
		bean2.setCreatetime(resultSet.getString("createtime"));
		bean2.setId(resultSet.getInt("id"));
		bean2.setVisitcount(resultSet.getString("visitcount"));
		bean.add(bean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSwimmingContent(Sharebean sharebean) throws SQLException, ClassNotFoundException{
	String sqlString="select *from shareswimming order by createtime desc limit ?,10 ";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getNum1());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean bean2=null;
	while(resultSet.next())
	{
		bean2=new Sharebean();
		bean2.setBoard(resultSet.getString("board"));
		bean2.setTitle(resultSet.getString("title"));
		bean2.setContent(resultSet.getString("content"));
		bean2.setCreatetime(resultSet.getString("createtime"));
		bean2.setId(resultSet.getInt("id"));
		bean2.setVisitcount(resultSet.getString("visitcount"));
		bean.add(bean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
}
