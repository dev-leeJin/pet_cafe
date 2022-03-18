package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

public class PetLostDetailService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lostnum = request.getParameter("lost_num");
		int lostNum = Integer.parseInt(lostnum);
		
		PetLostDAO dao = PetLostDAO.getInstance();
		
		// dao에서 해당 글번호에 대한 정보를 가져오고
		PetLostVO petlost = dao.detailPetLost(lostNum);
		
		// 정보가 제대로 들어왔는지 디버깅 하기
		System.out.println(petlost);
		
		// 데이터 바인딩
		request.setAttribute("petlost", petlost);
		
	}
}
