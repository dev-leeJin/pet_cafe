package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;

/**
 * Servlet implementation class DeletePetLost
 */
@WebServlet("/deletepetlost")
public class DeletePetLost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePetLost() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lostnum = request.getParameter("lost_num");
		int lostNum = Integer.parseInt(lostnum);
		
		PetLostDAO dao = PetLostDAO.getInstance();

		dao.deletePetLost(lostNum);

		response.sendRedirect("http://localhost:8181/petCafePrj/petlostlist.do");
	}

}
