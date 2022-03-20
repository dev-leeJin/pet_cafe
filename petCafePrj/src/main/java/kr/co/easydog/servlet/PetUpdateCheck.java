package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetDAO;

/**
 * Servlet implementation class PetUpdateCheck
 */
@WebServlet("/petUpdateCheck")
public class PetUpdateCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetUpdateCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PetDAO petdao = PetDAO.getInstance();
		
		int uid = Integer.parseInt(request.getParameter("user_id"));
		String pkind = request.getParameter("pet_kind");
		String pname = request.getParameter("pet_name");
		int page = Integer.parseInt(request.getParameter("pet_age"));
		Boolean pgender = Boolean.parseBoolean(request.getParameter("pet_gender"));
		
		petdao.petUpdate(uid, pkind, pname, page, pgender);

		response.sendRedirect("http://localhost:8181/petCafePrj/petWelcome");
	}

}
