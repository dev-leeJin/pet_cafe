package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.UserDAO;
import kr.co.easydog.UserVO;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/updateCheck")
public class UpdateCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		String id = (String)session.getAttribute("session_id");
		if(id==null) {

			response.sendRedirect("http://localhost:8181/petCafePrj/users/login_form.jsp");

		}
		
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		UserDAO userDao = UserDAO.getInstance();
		// VO 연결 id를 가진 유저 데이터 받아오기 
		userDao.userUpdate(id, pw, name, email);
		

		response.sendRedirect("http://localhost:8181/petCafePrj/users/login_welcome.jsp");

	}


}
