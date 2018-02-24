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
import com.gdut.haoguimi.service.ShareCreateService;
import com.gdut.haoguimi.tools.GetJsonStringFromRequest;

/**
 * Servlet implementation class ShareCreateServlet
 */
@WebServlet("/ShareCreateServlet")
public class ShareCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShareCreateServlet() {
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
		String k= (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		if(action.equals("dopost"))
		{
			 try {
				String jsonString=GetJsonStringFromRequest.getJsonString(request);
				JSONObject jsonObject=JSONObject.fromObject(jsonString);
				Sharebean sharebean=(Sharebean) JSONObject.toBean(jsonObject, Sharebean.class);
				ShareCreateService service=new ShareCreateService();
				ReturnTemplate returnTemplate=service.doPost(sharebean, k);
				PrintWriter printWriter =response.getWriter();
				printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
