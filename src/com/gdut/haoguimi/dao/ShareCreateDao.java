package com.gdut.haoguimi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.tools.C3p0uti;

public class ShareCreateDao {
public boolean doCheck(Sharebean sharebean,String k)
{
	boolean result=false;
	if(sharebean.getCheckcode().equals(k))
	{
		result=true;
	}
	return result;
}
public boolean doCreateBasketball(Sharebean sharebean)throws SQLException, ClassNotFoundException
{
	boolean result=false;
	String sql="insert into sharebasketball(title,content,createtime,board) value(?,?,?,?)";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setString(1, sharebean.getTitle());
	preparedStatement.setString(2, sharebean.getContent());
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	preparedStatement.setString(3, df.format(new Date()));
	preparedStatement.setString(4, sharebean.getBoard());
	int rows=preparedStatement.executeUpdate();
	if(rows>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doCreateFootball(Sharebean sharebean)throws SQLException, ClassNotFoundException
{
	boolean result=false;
	String sql="insert into sharefootball(title,content,createtime,board) value(?,?,?,?)";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setString(1, sharebean.getTitle());
	preparedStatement.setString(2, sharebean.getContent());
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	preparedStatement.setString(3, df.format(new Date()));
	preparedStatement.setString(4, sharebean.getBoard());
	int rows=preparedStatement.executeUpdate();
	if(rows>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doCreateBadminton(Sharebean sharebean)throws SQLException, ClassNotFoundException
{
	boolean result=false;
	String sql="insert into sharebadminton(title,content,createtime,board) value(?,?,?,?)";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setString(1, sharebean.getTitle());
	preparedStatement.setString(2, sharebean.getContent());
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	preparedStatement.setString(3, df.format(new Date()));
	preparedStatement.setString(4, sharebean.getBoard());
	int rows=preparedStatement.executeUpdate();
	if(rows>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doCreateGym(Sharebean sharebean)throws SQLException, ClassNotFoundException
{
	boolean result=false;
	String sql="insert into sharegym(title,content,createtime,board) value(?,?,?,?)";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setString(1, sharebean.getTitle());
	preparedStatement.setString(2, sharebean.getContent());
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	preparedStatement.setString(3, df.format(new Date()));
	preparedStatement.setString(4, sharebean.getBoard());
	int rows=preparedStatement.executeUpdate();
	if(rows>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doCreateRunning(Sharebean sharebean)throws SQLException, ClassNotFoundException
{
	boolean result=false;
	String sql="insert into sharerunning(title,content,createtime,board) value(?,?,?,?)";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setString(1, sharebean.getTitle());
	preparedStatement.setString(2, sharebean.getContent());
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	preparedStatement.setString(3, df.format(new Date()));
	preparedStatement.setString(4, sharebean.getBoard());
	int rows=preparedStatement.executeUpdate();
	if(rows>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doCreateSwimming(Sharebean sharebean)throws SQLException, ClassNotFoundException
{
	boolean result=false;
	String sql="insert into shareswimming(title,content,createtime,board) value(?,?,?,?)";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setString(1, sharebean.getTitle());
	preparedStatement.setString(2, sharebean.getContent());
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	preparedStatement.setString(3, df.format(new Date()));
	preparedStatement.setString(4, sharebean.getBoard());
	int rows=preparedStatement.executeUpdate();
	if(rows>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
}
