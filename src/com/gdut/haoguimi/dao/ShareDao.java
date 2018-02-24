package com.gdut.haoguimi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.tools.C3p0uti;


public class ShareDao {
public List<Sharebean> doSelectBasketball() throws SQLException, ClassNotFoundException{
	String sqlString="select id,title from sharebasketball order by visitcount desc limit 5";
	
		Connection connection=C3p0uti.getMySqlConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
		List<Sharebean> bean = new ArrayList<Sharebean>();
		ResultSet resultSet=preparedStatement.executeQuery();
		Sharebean sharebean=null;
		while(resultSet.next()){
			sharebean=new Sharebean();
			sharebean.setId(resultSet.getInt("id"));
			sharebean.setTitle(resultSet.getString("title"));
			bean.add(sharebean);
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
	return bean;
}
public List<Sharebean> doSelectFootball() throws SQLException, ClassNotFoundException{
	String sqlString="select id,title from sharefootball order by visitcount desc limit 5";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	List<Sharebean> bean=new ArrayList<Sharebean>();
	ResultSet resultSet=preparedStatement.executeQuery();
	Sharebean sharebean=null;
	while(resultSet.next()){
		sharebean=new Sharebean();
		sharebean.setId(resultSet.getInt("id"));
		sharebean.setTitle(resultSet.getString("title"));
		bean.add(sharebean);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectBadminton() throws SQLException, ClassNotFoundException{
	String sqlString="select id,title from sharebadminton order by visitcount desc limit 5";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	List<Sharebean> bean=new ArrayList<Sharebean>();
	ResultSet resultSet=preparedStatement.executeQuery();
	Sharebean sharebean=null;
	while(resultSet.next()){
		sharebean=new Sharebean();
		sharebean.setId(resultSet.getInt("id"));
		sharebean.setTitle(resultSet.getString("title"));
		bean.add(sharebean);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectGym() throws SQLException, ClassNotFoundException{
	String sqlString="select id,title from sharegym order by visitcount desc limit 5";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	List<Sharebean> bean=new ArrayList<Sharebean>();
	ResultSet resultSet=preparedStatement.executeQuery();
	Sharebean sharebean=null;
	while(resultSet.next()){
		sharebean=new Sharebean();
		sharebean.setId(resultSet.getInt("id"));
		sharebean.setTitle(resultSet.getString("title"));
		bean.add(sharebean);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectRunning() throws SQLException, ClassNotFoundException{
	String sqlString="select id,title from sharerunning order by visitcount desc limit 5";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	List<Sharebean> bean=new ArrayList<Sharebean>();
	ResultSet resultSet=preparedStatement.executeQuery();
	Sharebean sharebean=null;
	while(resultSet.next()){
		sharebean=new Sharebean();
		sharebean.setId(resultSet.getInt("id"));
		sharebean.setTitle(resultSet.getString("title"));
		bean.add(sharebean);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectSwimming() throws SQLException, ClassNotFoundException{
	String sqlString="select id,title from shareswimming order by visitcount desc limit 5";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	List<Sharebean> bean=new ArrayList<Sharebean>();
	ResultSet resultSet=preparedStatement.executeQuery();
	Sharebean sharebean=null;
	while(resultSet.next()){
		sharebean=new Sharebean();
		sharebean.setId(resultSet.getInt("id"));
		sharebean.setTitle(resultSet.getString("title"));
		bean.add(sharebean);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectBasketballContent(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	String sqlString="select title,content,createtime from sharebasketball where id = ?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getId());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean sharebean2=null;
	while(resultSet.next()){
		sharebean2=new Sharebean();
		sharebean2.setTitle(resultSet.getString("title"));
		sharebean2.setContent(resultSet.getString("content"));
		sharebean2.setCreatetime(resultSet.getString("createtime"));
		bean.add(sharebean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectFootballContent(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	String sqlString="select title,content,createtime from sharefootball where id = ?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getId());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean sharebean2=null;
	while(resultSet.next()){
		sharebean2=new Sharebean();
		sharebean2.setTitle(resultSet.getString("title"));
		sharebean2.setContent(resultSet.getString("content"));
		sharebean2.setCreatetime(resultSet.getString("createtime"));
		bean.add(sharebean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectBadmintonContent(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	String sqlString="select title,content,createtime from sharebadminton where id = ?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getId());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean sharebean2=null;
	while(resultSet.next()){
		sharebean2=new Sharebean();
		sharebean2.setTitle(resultSet.getString("title"));
		sharebean2.setContent(resultSet.getString("content"));
		sharebean2.setCreatetime(resultSet.getString("createtime"));
		bean.add(sharebean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectGymContent(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	String sqlString="select title,content,createtime from sharegym where id = ?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getId());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean sharebean2=null;
	while(resultSet.next()){
		sharebean2=new Sharebean();
		sharebean2.setTitle(resultSet.getString("title"));
		sharebean2.setContent(resultSet.getString("content"));
		sharebean2.setCreatetime(resultSet.getString("createtime"));
		bean.add(sharebean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectRunningContent(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	String sqlString="select title,content,createtime from sharerunning where id = ?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getId());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean sharebean2=null;
	while(resultSet.next()){
		sharebean2=new Sharebean();
		sharebean2.setTitle(resultSet.getString("title"));
		sharebean2.setContent(resultSet.getString("content"));
		sharebean2.setCreatetime(resultSet.getString("createtime"));
		bean.add(sharebean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public List<Sharebean> doSelectSwimmingContent(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	String sqlString="select title,content,createtime from shareswimming where id = ?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
	preparedStatement.setInt(1, sharebean.getId());
	ResultSet resultSet=preparedStatement.executeQuery();
	List<Sharebean> bean=new ArrayList<Sharebean>();
	Sharebean sharebean2=null;
	while(resultSet.next()){
		sharebean2=new Sharebean();
		sharebean2.setTitle(resultSet.getString("title"));
		sharebean2.setContent(resultSet.getString("content"));
		sharebean2.setCreatetime(resultSet.getString("createtime"));
		bean.add(sharebean2);
	}
	resultSet.close();
	preparedStatement.close();
	connection.close();
	return bean;
}
public boolean doUpdateBasketballVisitCount(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	boolean result=false;
	String sql="update sharebasketball set visitcount=visitcount+1 where id=?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setInt(1, sharebean.getId());
	int row=preparedStatement.executeUpdate();
	if(row>0)
	{
		result=true;
	}
	return result;
}
public boolean doUpdateFootballVisitCount(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	boolean result=false;
	String sql="update sharefootball set visitcount=visitcount+1 where id=?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setInt(1, sharebean.getId());
	int row=preparedStatement.executeUpdate();
	if(row>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doUpdateBadmintonVisitCount(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	boolean result=false;
	String sql="update sharebadminton set visitcount=visitcount+1 where id=?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setInt(1, sharebean.getId());
	int row=preparedStatement.executeUpdate();
	if(row>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doUpdateGymVisitCount(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	boolean result=false;
	String sql="update sharegym set visitcount=visitcount+1 where id=?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setInt(1, sharebean.getId());
	int row=preparedStatement.executeUpdate();
	if(row>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doUpdateRunningVisitCount(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	boolean result=false;
	String sql="update sharerunning set visitcount=visitcount+1 where id=?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setInt(1, sharebean.getId());
	int row=preparedStatement.executeUpdate();
	if(row>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
public boolean doUpdateSwimmingVisitCount(Sharebean sharebean)throws SQLException, ClassNotFoundException{
	boolean result=false;
	String sql="update shareswimming set visitcount=visitcount+1 where id=?";
	Connection connection=C3p0uti.getMySqlConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setInt(1, sharebean.getId());
	int row=preparedStatement.executeUpdate();
	if(row>0)
	{
		result=true;
	}
	preparedStatement.close();
	connection.close();
	return result;
}
}
