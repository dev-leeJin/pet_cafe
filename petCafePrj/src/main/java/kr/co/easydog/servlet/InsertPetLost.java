package kr.co.easydog.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

/**
 * Servlet implementation class InsertPetLost
 */
@WebServlet("/insertpetlost")
public class InsertPetLost extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InsertPetLost() {
    	 super();
    } 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        request.setCharacterEncoding("utf-8");

	    PetLostDAO dao = PetLostDAO.getInstance();
			
        String lostName = request.getParameter("lost_name");
        String lostZone = request.getParameter("lost_zone");
        String lostsize = request.getParameter("lost_size");
	    int lostSize = Integer.parseInt(lostsize);
	    String lostphone = request.getParameter("lost_phone");
	    int lostPhone = Integer.parseInt(lostphone);

        dao.insertPetLost(lostName, lostZone, lostSize, lostPhone);
    
        response.sendRedirect("http://localhost:8181/petCafePrj/petlostlist");
	}
}


