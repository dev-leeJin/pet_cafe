package kr.co.easydog.servlet.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetDAO;

public class PetUpdateService implements IPetService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		PetDAO petdao = PetDAO.getInstance();
		
		String uid = request.getParameter("user_id");
		String pkind = request.getParameter("pet_kind");
		String pname = request.getParameter("pet_name");
		int page = Integer.parseInt(request.getParameter("pet_age"));
		Boolean pgender = Boolean.parseBoolean(request.getParameter("pet_gender"));
		
		petdao.petUpdate(uid, pkind, pname, page, pgender);
	}
}
