package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

public class PetLostUpdateFormService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String lostnum = request.getParameter("lost_num");
		int lostNum = Integer.parseInt(lostnum);

		PetLostDAO dao = PetLostDAO.getInstance();
		
		PetLostVO petlost = dao.detailPetLost(lostNum);
		
		// 정보가 제대로 들어왔는지 디버깅
		System.out.println(petlost);
		
		// 데이터 바인딩
		request.setAttribute("petlost", petlost);
	}
}
