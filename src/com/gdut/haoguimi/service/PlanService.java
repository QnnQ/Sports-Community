
 /**  
 * Project Name:sportcommunity  
 * File Name:PlanService.java  
 * Package Name:com.gdut.haoguimi.service  
 * Date:2018-3-15下午02:47:27  
 * Copyright (c) 2018, 广东德生科技股份有限公司  All Rights Reserved.  
 *  
*/  

/**  
 * Project Name:sportcommunity  
 * File Name:PlanService.java  
 * Package Name:com.gdut.haoguimi.service  
 * Date:2018-3-15下午02:47:27  
 * Copyright (c) 2018, 广东德生科技股份有限公司  All Rights Reserved.  
 *  
 */
   
  
package com.gdut.haoguimi.service;  

import java.sql.SQLException;

import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.dao.PlanDao;
/**  
 * @Title:      
 * @author: JJJJ 
 * @Date:   2018-3-15 下午02:47:27
 */

/**  
 * @Title:  
 * @author JJJJ  
 * @date: 2018-3-15 下午02:47:27 
 */

public class PlanService
{
    public ReturnTemplate all(String id) throws ClassNotFoundException, SQLException{
        ReturnTemplate returnTemplate = new ReturnTemplate();
        PlanDao dao = new PlanDao();
        returnTemplate.setList(dao.selectAllPlan(id));
        returnTemplate.setResult(true);
        return returnTemplate;
    }
    public ReturnTemplate detail(String plan_id) throws ClassNotFoundException,SQLException{
        ReturnTemplate returnTemplate = new ReturnTemplate();
        PlanDao dao = new PlanDao();
        returnTemplate.setList(dao.doSelectDetail(plan_id));
        returnTemplate.setResult(true);
        return returnTemplate;
    }
}
  
