package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.UserDAO;

/**
 * Servlet implementation class MemberoutServlet
 */
@WebServlet("/memberout")
public class Memberout extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Memberout() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String unum = request.getParameter("unum");
        int uNum = Integer.parseInt(unum);

        UserDAO dao = UserDAO.getInstance();

        dao.deleteUser(unum);

        response.sendRedirect("join_form.jsp");
	}

}