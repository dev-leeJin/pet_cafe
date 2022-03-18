package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

public class PetLostListService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PetLostDAO dao = PetLostDAO.getInstance();

		List<PetLostVO> petlostList = dao.getAllPetLostList();
		
		request.setAttribute("petlostList", petlostList);		
	}
}
