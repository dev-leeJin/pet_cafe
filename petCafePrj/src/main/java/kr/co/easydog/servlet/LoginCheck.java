package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import kr.co.easydog.*;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/loginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		
		UserDAO userdao = UserDAO.getInstance();
		UserVO uservo = userdao.getUserData(id);

		if(id.equals(uservo.getUser_id())) {
			if(pw.equals(uservo.getPw())) {
				String name = uservo.getName();
				session.setAttribute("session_id", id);
				session.setAttribute("session_pw", pw);
				session.setAttribute("session_name", name);

				response.sendRedirect("http://loaclhost:8181/petCafePrj/users/login_welcome.jsp");
			}
		}
		response.sendRedirect("http://loaclhost:8181/petCafePrj/users/login_form.jsp");
		
		
	}

}
