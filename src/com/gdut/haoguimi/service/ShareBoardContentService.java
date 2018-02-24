package com.gdut.haoguimi.service;

import java.sql.SQLException;

import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.dao.ShareBoardContentDao;

public class ShareBoardContentService {
	public ReturnTemplate doCheckPage(Sharebean sharebean) throws ClassNotFoundException, SQLException{
		String boardString=sharebean.getBoard();
		ReturnTemplate returnTemplate=new ReturnTemplate();
		ShareBoardContentDao dao=new ShareBoardContentDao();
		if(boardString.equals("basketball"))
		{
			returnTemplate.setList(dao.doBasketballContent(sharebean));
			returnTemplate.setResult(true);
		}
		else if(boardString.equals("football"))
		{
			returnTemplate.setList(dao.doFootballContent(sharebean));
			returnTemplate.setResult(true);
		}
		else if(boardString.equals("badminton")){
			returnTemplate.setList(dao.doBadmintonContent(sharebean));
			returnTemplate.setResult(true);
		}
		else if(boardString.equals("gym"))
		{
			returnTemplate.setList(dao.doGymContent(sharebean));
			returnTemplate.setResult(true);
		}
		else if(boardString.equals("running"))
		{
			returnTemplate.setList(dao.doRunningContent(sharebean));
			returnTemplate.setResult(true);
		}
		else if(boardString.equals("swimming"))
		{
			returnTemplate.setList(dao.doSwimmingContent(sharebean));
			returnTemplate.setResult(true);
		}
		else{
			returnTemplate.setErrmsg("未知错误");
			returnTemplate.setResult(false);
		}
		return returnTemplate;
	}
}
