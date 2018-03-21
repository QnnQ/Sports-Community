package com.gdut.haoguimi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.json.JSONObject;
import com.gdut.haoguimi.bean.Planbean;
import com.gdut.haoguimi.bean.ReturnTemplate;
import com.gdut.haoguimi.service.PlanService;
import com.gdut.haoguimi.tools.GetJsonStringFromRequest;
/**
 * Servlet implementation class MyPlanServlet
 */
@WebServlet("/MyPlanServlet")
public class MyPlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPlanServlet() {
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
	    HttpSession session=request.getSession();
	    String id = (String) session.getAttribute("user");
	    String actionString=request.getParameter("action");
	    if(actionString.equals("all")){
	        try
            {
	            PlanService service = new PlanService();
                ReturnTemplate returnTemplate=service.all(id);
                PrintWriter printWriter =response.getWriter();
                printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
	    }
	    else if(actionString.equals("detail")){
	        try
            {
	            String jsonString=GetJsonStringFromRequest.getJsonString(request);
                JSONObject jsonObject=JSONObject.fromObject(jsonString);
                Planbean planbean=(Planbean) JSONObject.toBean(jsonObject, Planbean.class);
                PlanService planService = new PlanService();
                ReturnTemplate returnTemplate = planService.detail(planbean.getPlan_id());
                PrintWriter printWriter =response.getWriter();
                printWriter.write((JSONObject.fromObject(returnTemplate)).toString());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
	    }
	}

}
