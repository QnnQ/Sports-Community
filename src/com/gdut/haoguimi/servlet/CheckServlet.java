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
import com.gdut.haoguimi.service.LoginService;
import com.gdut.haoguimi.service.RegisterService;
import com.gdut.haoguimi.tools.GetJsonStringFromRequest;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String k= (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		String action=request.getParameter("action");
		response.setContentType("text/html; charset=utf-8");
		if(action.equals("check"))
		{
			try {
				String jsonString=GetJsonStringFromRequest.getJsonString(request);
				JSONObject jsonObject =JSONObject.fromObject(jsonString);
				Loginbean loginbean=(Loginbean) JSONObject.toBean(jsonObject, Loginbean.class);
				LoginService loginService=new LoginService();
				ReturnTemplate returnTemplate=loginService.doLogin(loginbean,k);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(action.equals("register"))
		{
			try {
				String jsonString=GetJsonStringFromRequest.getJsonString(request);
				JSONObject jsonObject =JSONObject.fromObject(jsonString);
				Loginbean loginbean=(Loginbean) JSONObject.toBean(jsonObject, Loginbean.class);
				RegisterService registerService=new RegisterService();
				ReturnTemplate returnTemplate=registerService.doRegister(loginbean, k);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
