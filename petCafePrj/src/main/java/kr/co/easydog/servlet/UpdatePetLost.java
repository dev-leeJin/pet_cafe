package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;

/**
 * Servlet implementation class UpdatePetLost
 */
@WebServlet("/updatepetlost")
public class UpdatePetLost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String lostName = request.getParameter("lost_name");
        String lostZone = request.getParameter("lost_zone");
        String lostsize = request.getParameter("lost_size");
	    int lostSize = Integer.parseInt(lostsize);
	    String lostphone = request.getParameter("lost_phone");
	    int lostPhone = Integer.parseInt(lostphone);
		String lostnum = request.getParameter("lost_num");
		int lostNum = Integer.parseInt(lostnum);
	    
		PetLostDAO dao = PetLostDAO.getInstance();
		dao.updatePetLost(lostName, lostZone, lostSize, lostPhone, lostNum);
	
	    response.sendRedirect("http://localhost:8181/petCafePrj/petlostdetail?lost_num=" + lostNum);
	}
}