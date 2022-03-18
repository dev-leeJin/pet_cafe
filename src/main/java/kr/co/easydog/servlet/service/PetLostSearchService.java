package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;

public class PetLostSearchService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String sDate = request.getParameter("sDate");
		
		String fDate = request.getParameter("fDate");
		
		String sd = request.getParameter("sd");
		String sgg = request.getParameter("sgg");
		
		
		PetLostDAO dao = PetLostDAO.getInstance();
		dao.searchPetLost(null, null, sd, sgg);
	}
}
