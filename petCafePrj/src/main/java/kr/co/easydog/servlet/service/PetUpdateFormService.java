package kr.co.easydog.servlet.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;

public class PetUpdateFormService implements IPetService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		PetDAO petdao = PetDAO.getInstance();
		
		PetVO petData = petdao.getOnePet(Integer.parseInt(request.getParameter("pet_num")));
		
		request.setAttribute("petData", petData);
	}
}
