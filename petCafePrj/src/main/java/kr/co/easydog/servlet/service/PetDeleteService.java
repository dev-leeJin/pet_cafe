package kr.co.easydog.servlet.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetDAO;

public class PetDeleteService implements IPetService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		PetDAO petdao = PetDAO.getInstance();
		petdao.deletePet((String)request.getParameter("pet_num"));
		
	}
}
