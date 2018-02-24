package com.gdut.haoguimi.service;

import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.dao.ShareDao;

public class ShareContentService {
public ReturnTemplate doSelectContent(Sharebean sharebean){
	ReturnTemplate returnTemplate=new ReturnTemplate();
	ShareDao dao=new ShareDao();
	try {
	if(sharebean.getBoard().equals("basketball"))
	{
		if(dao.doUpdateBasketballVisitCount(sharebean))
		{
		returnTemplate.setResult(true);
		returnTemplate.setList(dao.doSelectBasketballContent(sharebean));
		}
		else{
			returnTemplate.setResult(false);
			returnTemplate.setErrmsg("访问失败！");
		}
		return returnTemplate;
	}
	else if (sharebean.getBoard().equals("football")) {
		if(dao.doUpdateFootballVisitCount(sharebean)){
		returnTemplate.setResult(true);
		returnTemplate.setList(dao.doSelectFootballContent(sharebean));
		}
		else{
			returnTemplate.setResult(false);
			returnTemplate.setErrmsg("访问失败！");
		}
		return returnTemplate;
	}
	else if (sharebean.getBoard().equals("badminton")) {
		if(dao.doUpdateBadmintonVisitCount(sharebean)){
		returnTemplate.setResult(true);
		returnTemplate.setList(dao.doSelectBadmintonContent(sharebean));
		}
		else{
			returnTemplate.setResult(false);
			returnTemplate.setErrmsg("访问失败！");
		}
		return returnTemplate;
	}
	else if (sharebean.getBoard().equals("gym")) {
		if(dao.doUpdateGymVisitCount(sharebean)){
		returnTemplate.setResult(true);
		returnTemplate.setList(dao.doSelectGymContent(sharebean));
		}
		else{
			returnTemplate.setResult(false);
			returnTemplate.setErrmsg("访问失败！");
		}
		return returnTemplate;
	}
	else if (sharebean.getBoard().equals("running")) {
		if(dao.doUpdateRunningVisitCount(sharebean)){
		returnTemplate.setResult(true);
		returnTemplate.setList(dao.doSelectRunningContent(sharebean));
		}
		else{
			returnTemplate.setResult(false);
			returnTemplate.setErrmsg("访问失败！");
		}
		return returnTemplate;
	}
	else if (sharebean.getBoard().equals("swimming")) {
		if(dao.doUpdateSwimmingVisitCount(sharebean)){
		returnTemplate.setResult(true);
		returnTemplate.setList(dao.doSelectSwimmingContent(sharebean));
		}
		else{
			returnTemplate.setResult(false);
			returnTemplate.setErrmsg("访问失败！");
		}
		return returnTemplate;
	}
} catch (Exception e) {
	e.printStackTrace();
	}
	returnTemplate.setResult(false);
	returnTemplate.setErrmsg("未知错误！");
	return returnTemplate;
}
}
