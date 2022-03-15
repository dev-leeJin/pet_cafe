package kr.co.easydog.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.servlet.service.IPetService;
import kr.co.easydog.servlet.service.IUesrService;
import kr.co.easydog.servlet.service.LogoutService;
import kr.co.easydog.servlet.service.PetJoinCheckService;
import kr.co.easydog.servlet.service.PetWelcomeService;
import kr.co.easydog.servlet.service.UserUpdateFormSerivce;
import kr.co.easydog.servlet.service.UserUpdateService;

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
		// TODO Auto-generated method stub
		doRequest(request, response);
	}
	
	private void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("urf-8");
		
		String uri = request.getRequestURI();
		
		String ui = null;
		
		IUesrService uv = null;
		IPetService pv = null;
		
		if(uri.equals("/petCafePrj/logout.do")) {
			uv = new LogoutService();
			uv.execute(request, response);
			ui = "/users/login_form.jsp";
		} else if (uri.equals("/petCafePrj/userUpdate.do")) {
			uv = new UserUpdateFormSerivce();
			uv.execute(request, response);
			ui = "/user/login_update.jsp";
		} else if (uri.equals("/petCafePrj/updateCheck.do")) {
			uv = new UserUpdateService();
			uv.execute(request, response);
			ui = "/users/login_welcome.jsp";
		} else if(uri.equals("/petCafePrj/petjoin.do")) {
			ui = "/pet/pet_join.jsp";
		} else if(uri.equals("/petCafePrj/petJoinCheck.do")) {
			pv = new PetJoinCheckService();
			pv.execute(request, response);
			ui = "/petCafePrj/petWelcome.do";
		} else if(uri.equals("/petCafePrj/petWelcome.do")) {
			pv = new PetWelcomeService();
			pv.execute(request, response);
			ui = "/petCafePrj/petWelcome.jsp";
		} else {
			ui = "/";
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(ui);
		dp.forward(request, response);
	}

}
