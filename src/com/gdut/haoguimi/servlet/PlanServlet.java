package com.gdut.haoguimi.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gdut.haoguimi.dao.PlanDao;

/**
 * Servlet implementation class PlanServlet
 */
@WebServlet("/PlanServlet")
public class PlanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlanServlet() {
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
	    HttpSession session = request.getSession();
	    String selectedSport=request.getParameter("selectedsport");
	    String content=request.getParameter("content");
	    String title=request.getParameter("title");
	    String from_time=request.getParameter("from_time");
	    String to_time=request.getParameter("to_time");
	    String id = (String) session.getAttribute("user");
	    PlanDao dao = new PlanDao();
	    boolean result=false;
	    try
        {
            result=dao.insertplan(selectedSport, content,title, id, from_time, to_time);
            if(result){
                response.sendRedirect(request.getContextPath()+"/html/showplan.jsp");
            }
            else {
                response.sendRedirect(request.getContextPath()+"/html/addplan.jsp");
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();  
        }
        catch (SQLException e)
        {
              
            // TODO Auto-generated catch block  
            e.printStackTrace();  
            
        }
	}

}
