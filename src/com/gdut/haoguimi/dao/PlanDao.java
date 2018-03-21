
 /**  
 * Project Name:sportcommunity  
 * File Name:PlanDao.java  
 * Package Name:com.gdut.haoguimi.dao  
 * Date:2018-3-14下午05:15:20  
 * Copyright (c) 2018, 广东德生科技股份有限公司  All Rights Reserved.  
 *  
*/  

/**  
 * Project Name:sportcommunity  
 * File Name:PlanDao.java  
 * Package Name:com.gdut.haoguimi.dao  
 * Date:2018-3-14下午05:15:20  
 * Copyright (c) 2018, 广东德生科技股份有限公司  All Rights Reserved.  
 *  
 */
   
  
package com.gdut.haoguimi.dao;  

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gdut.haoguimi.bean.Planbean;
import com.gdut.haoguimi.tools.C3p0uti;
/**  
 * @Title:      
 * @author: JJJJ 
 * @Date:   2018-3-14 下午05:15:20
 */

/**  
 * @Title:  
 * @author JJJJ  
 * @date: 2018-3-14 下午05:15:20 
 */

public class PlanDao
{
    public boolean insertplan(String sport,String content,String title,String id,String from_time,String to_time) throws SQLException,ClassNotFoundException{
            
            boolean result=false;
            String sql="insert into plan(belonged_id,content,plan_title,plan_sport,plan_from_time,plan_to_time) values(?,?,?,?,?,?)";
            Connection connection =C3p0uti.getMySqlConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, content);
            preparedStatement.setString(3, title);
            preparedStatement.setString(4, sport);
            preparedStatement.setString(5, from_time);
            preparedStatement.setString(6, to_time);
            int rows=preparedStatement.executeUpdate();
            if(rows>0)
            {
                result=true;
            }
            preparedStatement.close();
            connection.close();
            return result;
    }
    
    public List<Planbean> selectAllPlan(String id) throws SQLException,ClassNotFoundException{
            List<Planbean> bean = new ArrayList<Planbean>();
            String sqlString="select plan_id,plan_title,plan_sport from plan where belonged_id = ? ORDER BY create_time DESC";
            Connection connection=C3p0uti.getMySqlConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
            preparedStatement.setString(1, id);
            ResultSet resultSet=preparedStatement.executeQuery();
            Planbean bean2=null;
            while(resultSet.next())
            {
                bean2=new Planbean();
                bean2.setPlan_sport(resultSet.getString("plan_sport"));
                bean2.setPlan_title(resultSet.getString("plan_title"));
                bean2.setPlan_id(resultSet.getString("plan_id"));
                bean.add(bean2);
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
            return bean;
        }
    public List<Planbean> doSelectDetail(String plan_id) throws SQLException,ClassNotFoundException{
        List<Planbean> bean = new ArrayList<Planbean>();
        String sqlString="select plan_title,content,plan_sport,create_time,plan_from_time,plan_to_time from plan where plan_id = ?";
        Connection connection=C3p0uti.getMySqlConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sqlString);
        preparedStatement.setString(1, plan_id);
        ResultSet resultSet=preparedStatement.executeQuery();
        Planbean bean2=null;
        while(resultSet.next())
        {
            bean2=new Planbean();
            bean2.setPlan_title(resultSet.getString("plan_title"));
            bean2.setContent(resultSet.getString("content"));
            bean2.setPlan_sport(resultSet.getString("plan_sport"));
            bean2.setCreate_time(resultSet.getString("create_time"));
            bean2.setPlan_from_time(resultSet.getString("plan_from_time"));
            bean2.setPlan_to_time(resultSet.getString("plan_to_time"));
            bean.add(bean2);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
        return bean;
    }
}
  
