package com.gdut.haoguimi.service;

import java.sql.SQLException;

import com.gdut.haoguimi.bean.Loginbean;
import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.dao.LoginDao;

public class LoginService {
public ReturnTemplate doLogin(Loginbean loginbean,String string)
{
	LoginDao dao=new LoginDao();
	ReturnTemplate returnTemplate=new ReturnTemplate();
	returnTemplate.setErrmsg("登录失败");
	returnTemplate.setResult(false);
	if(dao.doCheck(loginbean, string))
	{
		try {
			if(dao.doCheckUsername(loginbean))
			{
				if(dao.doLogin(loginbean))
				{
					returnTemplate.setResult(true);
					returnTemplate.setErrmsg("登录成功！");
				}
				else {
					returnTemplate.setResult(false);
					returnTemplate.setErrmsg("密码错误！");
				}
			}
			else{
					returnTemplate.setResult(false);
					returnTemplate.setErrmsg("该账号不存在！");
				}
		    }
	    catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	else {
		returnTemplate.setErrmsg("验证码错误!");
		returnTemplate.setResult(false);
	}
	return returnTemplate;
}
}
