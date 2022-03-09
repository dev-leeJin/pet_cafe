package kr.co.easydog.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import kr.co.easydog.*;

/**
 * Servlet implementation class LoginUpdate
 */
@WebServlet("/userUpdate")
public class UserUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		String id = (String)session.getAttribute("session_id");
		if(id==null) {
			response.sendRedirect("http://localhost:8181/petCafePrj//users/login_form.jsp");
		}
		
		// DAO 연결
		UserDAO userDao = UserDAO.getInstance();
		// VO 연결 id를 가진 유저 데이터 받아오기 
		UserVO userData = userDao.getUserData(id);
		
		request.setAttribute("userdata", userData);
		
		RequestDispatcher dp = request.getRequestDispatcher(
				"/user/login_update.jsp");
		dp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
