package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.UserDAO;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join")
public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Join() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 기본적으로, SELECT구문을 제외한 쿼리문 호출은 POST방식으로만 접근할 수 있도록 한다.
		
		UserDAO dao = UserDAO.getInstance();
        
	    String Id = request.getParameter("uid");
	    String Pw = request.getParameter("upw");
	    String Name = request.getParameter("uname");
        String Email = request.getParameter("uemail");
        String Admin = request.getParameter("uadmin");
		
        dao.insertUser(Id, Pw, Name, Email, Admin);
       
	    response.sendRedirect("login_form.jsp");

	}

}
