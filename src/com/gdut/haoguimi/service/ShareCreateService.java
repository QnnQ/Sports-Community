package com.gdut.haoguimi.service;

import java.sql.SQLException;

import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.dao.ShareCreateDao;

public class ShareCreateService {
public ReturnTemplate doPost(Sharebean sharebean,String k) throws ClassNotFoundException, SQLException{
	ShareCreateDao dao=new ShareCreateDao();
	ReturnTemplate returnTemplate =new ReturnTemplate();
	String boardString=sharebean.getBoard();
	if(dao.doCheck(sharebean, k))
	{
		if(boardString.equals("basketball"))
		{
			if(dao.doCreateBasketball(sharebean))
			{
			returnTemplate.setErrmsg("发布成功");
			returnTemplate.setResult(true);
			}
			else{
				returnTemplate.setResult(false);
				returnTemplate.setErrmsg("发布失败");
			}
		}
		else if(boardString.equals("football"))
		{
			if(dao.doCreateFootball(sharebean))
			{
			returnTemplate.setErrmsg("发布成功");
			returnTemplate.setResult(true);
			}
			else{
				returnTemplate.setResult(false);
				returnTemplate.setErrmsg("发布失败");
			}
			}
		else if(boardString.equals("badminton"))
		{
			if(dao.doCreateBadminton(sharebean))
			{
			returnTemplate.setErrmsg("发布成功");
			returnTemplate.setResult(true);
			}
			else {
				returnTemplate.setResult(false);
				returnTemplate.setErrmsg("发布失败");
			}
		}
		else if(boardString.equals("gym"))
		{
			if(dao.doCreateGym(sharebean))
			{
			returnTemplate.setErrmsg("发布成功");
			returnTemplate.setResult(true);
			}
			else{
				returnTemplate.setResult(false);
				returnTemplate.setErrmsg("发布失败");
			}
		}
		else if(boardString.equals("running"))
		{
			if(dao.doCreateRunning(sharebean))
			{
			returnTemplate.setErrmsg("发布成功");
			returnTemplate.setResult(true);
			}
			else {
				returnTemplate.setResult(false);
				returnTemplate.setErrmsg("发布失败");
			}
		}
		else if(boardString.equals("swimming"))
		{
			if(dao.doCreateSwimming(sharebean))
			{
			returnTemplate.setErrmsg("发布成功");
			returnTemplate.setResult(true);
			}
			else {
				returnTemplate.setResult(false);
				returnTemplate.setErrmsg("发布失败");
			}
			}
	}
	else{
		returnTemplate.setErrmsg("验证码错误！");
		returnTemplate.setResult(false);
	}
	return returnTemplate;
} 
}
