package com.gdut.haoguimi.service;

import java.sql.SQLException;

import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.dao.ShareBoardDao;

public class ShareBoardService {
public ReturnTemplate doCheckPage(Sharebean sharebean) throws ClassNotFoundException, SQLException{
	String boardString=sharebean.getBoard();
	ShareBoardDao dao=new ShareBoardDao();
	ReturnTemplate returnTemplate=new ReturnTemplate();
	if(boardString.equals("basketball"))
	{
		returnTemplate=dao.doCheckBasketballPage();
		returnTemplate.setResult(true);
	}
	else if(boardString.equals("football"))
	{
		returnTemplate=dao.doCheckFootballPage();
		returnTemplate.setResult(true);
	}
	else if(boardString.equals("badminton")){
		returnTemplate=dao.doCheckBadmintonPage();
		returnTemplate.setResult(true);
	}
	else if(boardString.equals("gym"))
	{
		returnTemplate=dao.doCheckGymPage();
		returnTemplate.setResult(true);
	}
	else if(boardString.equals("running"))
	{
		returnTemplate=dao.doCheckRunningPage();
		returnTemplate.setResult(true);
	}
	else if(boardString.equals("swimming"))
	{
		returnTemplate=dao.doCheckSwimmingPage();
		returnTemplate.setResult(true);
	}
	else{
		returnTemplate.setErrmsg("未知错误");
		returnTemplate.setResult(false);
	}
	return returnTemplate;
}
}
