package com.gdut.haoguimi.service;

import java.sql.SQLException;

import com.gdut.haoguimi.bean.Loginbean;
import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.dao.LoginDao;
import com.gdut.haoguimi.dao.RegisterDao;

public class RegisterService {
	public ReturnTemplate doRegister(Loginbean loginbean,String string)
	{
		RegisterDao dao=new RegisterDao();
		ReturnTemplate returnTemplate=new ReturnTemplate();
		returnTemplate.setErrmsg("注册失败");
		returnTemplate.setResult(false);
		if(dao.doCheck(loginbean, string))
		{
			try {
				if(dao.doCheckUsername(loginbean))
				{
					if(dao.doRegister(loginbean))
					{
						returnTemplate.setResult(true);
						returnTemplate.setErrmsg("注册成功！请登录");
					}
					else {
						returnTemplate.setResult(false);
						returnTemplate.setErrmsg("注册失败！");
					}
				}
				else{
						returnTemplate.setResult(false);
						returnTemplate.setErrmsg("该账号已存在！");
					}
			} catch (ClassNotFoundException e) {
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
