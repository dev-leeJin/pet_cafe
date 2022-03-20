package kr.co.easydog.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

/**
 * Servlet implementation class PetLostList
 */
@WebServlet("/petlostlist")
public class PetLostList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetLostList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PetLostDAO dao = PetLostDAO.getInstance();

		List<PetLostVO> petlostList = dao.getAllPetLostList();
		
		request.setAttribute("petlostList", petlostList);
				
		RequestDispatcher dp = request.getRequestDispatcher("/pet_lost/petlost_list.jsp");
		dp.forward(request, response);
	}
}
