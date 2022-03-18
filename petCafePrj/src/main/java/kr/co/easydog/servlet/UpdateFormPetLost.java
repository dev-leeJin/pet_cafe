package kr.co.easydog.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

/**
 * Servlet implementation class UpdateFormPetLost
 */
@WebServlet("/updateformpetlost")
public class UpdateFormPetLost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFormPetLost() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String lostnum = request.getParameter("lost_num");
		int lostNum = Integer.parseInt(lostnum);

		PetLostDAO dao = PetLostDAO.getInstance();
		
		PetLostVO petlost = dao.detailPetLost(lostNum);
		
		// 정보가 제대로 들어왔는지 디버깅
		System.out.println(petlost);
		
		// 데이터 바인딩
		request.setAttribute("petlost", petlost);
		
		// 목적지로 포워딩
		RequestDispatcher dp = request.getRequestDispatcher("/pet_lost/petlost_updateForm.jsp");
		dp.forward(request, response);
	}

}