package kr.co.easydog.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import kr.co.easydog.service.ContestDeleteService;
import kr.co.easydog.service.ContestDetailService;
import kr.co.easydog.service.ContestInsertFormService;
import kr.co.easydog.service.ContestUpdateFormService;
import kr.co.easydog.service.ContestUpdateService;
import kr.co.easydog.service.ContestInsertService;
import kr.co.easydog.service.ContestListService;
import kr.co.easydog.service.IContestService;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	
	private void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		String uri =request.getRequestURI();
		String ui=null;
		IContestService sv = null;
		if(uri.equals("/petCafePrj/contestlist.do")) {
			sv=new ContestListService();
			sv.execute(request, response);
			ui = "/contest/contestlist.jsp";
		}else if(uri.equals("/petCafePrj/contestdetail.do")) {
			sv=new ContestDetailService();
			sv.execute(request, response);
			ui="/contest/contestdetail.jsp";
		}else if(uri.equals("/petCafePrj/contestInsertForm.do")) {
			sv=new ContestInsertFormService();
			sv.execute(request, response);
			ui="/contest/contestInsert.jsp";
		}else if(uri.equals("/petCafePrj/contestInsert.do")){
			sv=new ContestInsertService();
			sv.execute(request, response);
			ui="/petCafePrj/contestlist";
		}else if(uri.equals("/petCafePrj/contestdelete.do")) {
			sv=new ContestDeleteService();
			sv.execute(request, response);
			ui="/contestlist.do";
		}else if(uri.equals("/petCafePrj/contestUpdateform.do")) {
			sv=new ContestUpdateFormService();
			sv.execute(request, response);
			ui="/contest/contestupdate.jsp";
		}else if(uri.equals("/petCafePrj/contestUpdate.do")) {
			sv=new ContestUpdateService();
			sv.execute(request, response);
			ui="/contestdetail.do?"+request.getParameter("cont_num");
		}
		RequestDispatcher dp = request.getRequestDispatcher(ui);
		dp.forward(request, response);
	}
	
}
