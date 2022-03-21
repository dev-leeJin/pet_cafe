package kr.co.easydog.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;

/**
 * Servlet implementation class PetWelcome
 */
@WebServlet("/petWelcome")
public class PetWelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetWelcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		String uid = (String)session.getAttribute("session_id");
		
		PetDAO petdao = PetDAO.getInstance();
		
		List<PetVO> petList = petdao.getPetsList(uid);
		
		request.setAttribute("petList", petList);
		
		RequestDispatcher dp = request.getRequestDispatcher(
				"/pet/pet_welcome.jsp");
		dp.forward(request, response);
		
		
	}

}
