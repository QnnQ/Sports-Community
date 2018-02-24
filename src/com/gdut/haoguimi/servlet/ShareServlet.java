package com.gdut.haoguimi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.ezmorph.Morpher;
import net.sf.json.JSONObject;

import com.gdut.haoguimi.bean.Loginbean;
import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.dao.ShareDao;
import com.gdut.haoguimi.service.ShareContentService;
import com.gdut.haoguimi.tools.GetJsonStringFromRequest;

/**
 * Servlet implementation class ShareServlet
 */
@WebServlet("/ShareServlet")
public class ShareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShareServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionString=request.getParameter("action");
		if(actionString.equals("basketball"))
		{
			try {
				ShareDao dao=new ShareDao();
				ReturnTemplate returnTemplate=new ReturnTemplate();
				returnTemplate.setList(dao.doSelectBasketball());
				returnTemplate.setResult(true);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(actionString.equals("football"))
		{
			try {
				ShareDao dao=new ShareDao();
				ReturnTemplate returnTemplate=new ReturnTemplate();
				returnTemplate.setList(dao.doSelectFootball());
				returnTemplate.setResult(true);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(actionString.equals("badminton"))
		{
			try {
				ShareDao dao=new ShareDao();
				ReturnTemplate returnTemplate=new ReturnTemplate();
				returnTemplate.setList(dao.doSelectBadminton());
				returnTemplate.setResult(true);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(actionString.equals("gym"))
		{
			try {
				ShareDao dao=new ShareDao();
				ReturnTemplate returnTemplate=new ReturnTemplate();
				returnTemplate.setList(dao.doSelectGym());
				returnTemplate.setResult(true);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(actionString.equals("running"))
		{
			try {
				ShareDao dao=new ShareDao();
				ReturnTemplate returnTemplate=new ReturnTemplate();
				returnTemplate.setList(dao.doSelectRunning());
				returnTemplate.setResult(true);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(actionString.equals("swimming"))
		{
			try {
				ShareDao dao=new ShareDao();
				ReturnTemplate returnTemplate=new ReturnTemplate();
				returnTemplate.setList(dao.doSelectSwimming());
				returnTemplate.setResult(true);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(actionString.equals("content"))
		{
			try {
				String jsonString=GetJsonStringFromRequest.getJsonString(request);
				JSONObject jsonObject =JSONObject.fromObject(jsonString);
				Sharebean sharebean=(Sharebean) JSONObject.toBean(jsonObject, Sharebean.class);
				ShareContentService service=new ShareContentService();
				ReturnTemplate returnTemplate=service.doSelectContent(sharebean);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
