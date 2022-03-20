package kr.co.easydog.servlet.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;

public class PetWelcomeService implements IPetService{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		String uid = (String)session.getAttribute("session_id");
		
		PetDAO petdao = PetDAO.getInstance();
		
		List<PetVO> petList = petdao.getPetsList(uid);
		
		request.setAttribute("petList", petList);
	}
}
