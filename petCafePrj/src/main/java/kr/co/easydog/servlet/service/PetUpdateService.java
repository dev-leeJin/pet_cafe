package kr.co.easydog.servlet.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetDAO;

public class PetUpdateService implements IPetService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		PetDAO petdao = PetDAO.getInstance();
		
		int pnum = Integer.parseInt(request.getParameter("pet_num"));
		String pkind = request.getParameter("kind");
		String pname = request.getParameter("name");
		int page = Integer.parseInt(request.getParameter("age"));
		boolean pgender = Boolean.parseBoolean(request.getParameter("gender"));
		
		petdao.petUpdate(pnum, pkind, pname, page, pgender);
	}
}
