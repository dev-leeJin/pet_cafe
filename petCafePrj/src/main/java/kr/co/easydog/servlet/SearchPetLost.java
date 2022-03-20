package kr.co.easydog.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

/**
 * Servlet implementation class SearchPetLost
 */
@WebServlet("/searchpetlost")
public class SearchPetLost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchPetLost() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
				
		String sDate = request.getParameter("sDate");
		
		String fDate = request.getParameter("fDate");
		
		String sd = request.getParameter("sd");
		String sgg = request.getParameter("sgg");
		
		
		PetLostDAO dao = PetLostDAO.getInstance();
		
		dao.searchPetLost(null, null, sd, sgg);
	}
}
