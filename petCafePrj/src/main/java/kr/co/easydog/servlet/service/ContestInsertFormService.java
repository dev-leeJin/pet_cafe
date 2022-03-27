package kr.co.easydog.servlet.service;

import java.io.IOException;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

<<<<<<< HEAD
public class BoardInsertFormService implements IContestService{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sId =(String)session.getAttribute("session_id");
		request.setAttribute("sId", sId);
		
	}
	
}
=======
import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;

public class ContestInsertFormService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
			
		
		
		String snum=request.getParameter("pet_num");
		int pnum=Integer.parseInt(snum);
		
		PetDAO dao2 = PetDAO.getInstance();
		PetVO petData = dao2.getOnePet(pnum);
		request.setAttribute("petData", petData);
		
		}
		
	}
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde
