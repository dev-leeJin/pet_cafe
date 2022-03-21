package kr.co.easydog.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;

/**
 * Servlet implementation class PetUpdate
 */
@WebServlet("/petUpdate")
public class PetUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PetDAO petdao = PetDAO.getInstance();
		
		PetVO petData = petdao.getOnePet(Integer.parseInt(request.getParameter("pet_num")));
		
		request.setAttribute("petData", petData);
		
		RequestDispatcher dp = request.getRequestDispatcher("/pet/pet_update.jsp");
		dp.forward(request, response);
		
	}

}
