
 /**  
 * Project Name:sportcommunity  
 * File Name:Planbean.java  
 * Package Name:com.gdut.haoguimi.bean  
 * Date:2018-3-15上午11:23:00  
 * Copyright (c) 2018, 广东德生科技股份有限公司  All Rights Reserved.  
 *  
*/  

/**  
 * Project Name:sportcommunity  
 * File Name:Planbean.java  
 * Package Name:com.gdut.haoguimi.bean  
 * Date:2018-3-15上午11:23:00  
 * Copyright (c) 2018, 广东德生科技股份有限公司  All Rights Reserved.  
 *  
 */
   
  
package com.gdut.haoguimi.bean;  
/**  
 * @Title:      
 * @author: JJJJ 
 * @Date:   2018-3-15 上午11:23:00
 */

/**  
 * @Title:  
 * @author JJJJ  
 * @date: 2018-3-15 上午11:23:00 
 */

public class Planbean
{
    private String belonged_id;
    private String content;
    private Integer status;
    private String plan_sport;
    private String create_time;
    private String plan_from_time;
    private String plan_to_time;
    private String plan_id;
    private String plan_title;
    public String getPlan_title()
    {
        return plan_title;
    }
    public void setPlan_title(String plan_title)
    {
    
        this.plan_title = plan_title;
    }
    public String getPlan_id()
    {
        return plan_id;
    }
    public void setPlan_id(String plan_id)
    {
    
        this.plan_id = plan_id;
    }
    public String getBelonged_id()
    {
        return belonged_id;
    }
    public void setBelonged_id(String belonged_id)
    {
    
        this.belonged_id = belonged_id;
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
    
        this.content = content;
    }
    public Integer getStatus()
    {
        return status;
    }
    public void setStatus(Integer status)
    {
    
        this.status = status;
    }
    public String getPlan_sport()
    {
        return plan_sport;
    }
    public void setPlan_sport(String plan_sport)
    {
    
        this.plan_sport = plan_sport;
    }
    public String getCreate_time()
    {
        return create_time;
    }
    public void setCreate_time(String create_time)
    {
    
        this.create_time = create_time;
    }
    public String getPlan_from_time()
    {
        return plan_from_time;
    }
    public void setPlan_from_time(String plan_from_time)
    {
    
        this.plan_from_time = plan_from_time;
    }
    public String getPlan_to_time()
    {
        return plan_to_time;
    }
    public void setPlan_to_time(String plan_to_time)
    {
    
        this.plan_to_time = plan_to_time;
    }
    @Override
    public String toString()
    {
        return "Planbean [belonged_id=" + belonged_id + ", content=" + content + ", status=" + status + ", plan_sport=" + plan_sport + ", create_time=" + create_time + ", plan_from_time=" + plan_from_time + ", plan_to_time=" + plan_to_time + ", plan_id=" + plan_id
                + ", plan_title=" + plan_title + "]";
    }
    
    
}
  
