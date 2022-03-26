package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
