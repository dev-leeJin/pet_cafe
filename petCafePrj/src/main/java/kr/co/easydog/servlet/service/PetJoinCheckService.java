package kr.co.easydog.servlet.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetDAO;

public class PetJoinCheckService implements IPetService {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String uid = request.getParameter("id");
		String pkind = request.getParameter("kind");
		String pname = request.getParameter("name");
		int page = Integer.parseInt(request.getParameter("age"));
		boolean pgender = Boolean.parseBoolean(request.getParameter("gender"));
		
		
		
		PetDAO petdao = PetDAO.getInstance();
		petdao.insertPet(uid, pkind, pname, page, pgender);
	}
}
