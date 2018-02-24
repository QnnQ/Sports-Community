package com.gdut.haoguimi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.bean.Sharebean;
import com.gdut.haoguimi.service.ShareBoardContentService;
import com.gdut.haoguimi.service.ShareBoardService;
import com.gdut.haoguimi.tools.GetJsonStringFromRequest;

/**
 * Servlet implementation class ShareBoardServlet
 */
@WebServlet("/ShareBoardServlet")
public class ShareBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShareBoardServlet() {
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
		String action=request.getParameter("action");
		if(action.equals("checkpage"))
		{
			try {
				String jsonString=GetJsonStringFromRequest.getJsonString(request);
				JSONObject jsonObject=JSONObject.fromObject(jsonString);
				Sharebean sharebean=(Sharebean) JSONObject.toBean(jsonObject, Sharebean.class);
				ShareBoardService boardService=new ShareBoardService();
				ReturnTemplate returnTemplate=boardService.doCheckPage(sharebean);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		if(action.equals("pagecontent"))
		{
			try {
				String jsonString=GetJsonStringFromRequest.getJsonString(request);
				JSONObject jsonObject=JSONObject.fromObject(jsonString);
				Sharebean sharebean=(Sharebean) JSONObject.toBean(jsonObject, Sharebean.class);
				ShareBoardContentService boardContentService=new ShareBoardContentService();
				ReturnTemplate returnTemplate=boardContentService.doCheckPage(sharebean);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
