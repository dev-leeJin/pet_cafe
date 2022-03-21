package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;
import kr.co.easydog.UserDAO;
import kr.co.easydog.UserVO;

/**
 * Servlet implementation class PetJoin
 */
@WebServlet("/petJoinCheck")
public class PetJoinCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetJoinCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String uid = request.getParameter("id");
		String pkind = request.getParameter("kind");
		String pname = request.getParameter("name");
		int page = Integer.parseInt(request.getParameter("age"));
		boolean pgender = Boolean.parseBoolean(request.getParameter("gender"));
		
		PetDAO petdao = PetDAO.getInstance();
		petdao.insertPet(uid, pkind, pname, page, pgender);
		
		response.sendRedirect("http://localhost:8181/petCafePrj/petWelcome");
	}

}
