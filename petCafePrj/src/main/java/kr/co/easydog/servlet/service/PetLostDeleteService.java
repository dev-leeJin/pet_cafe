package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;

public class PetLostDeleteService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String lostnum = request.getParameter("lost_num");
		int lostNum = Integer.parseInt(lostnum);
		
		PetLostDAO dao = PetLostDAO.getInstance();

		dao.deletePetLost(lostNum);		
	}
}
