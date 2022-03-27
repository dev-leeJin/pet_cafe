<<<<<<< HEAD
package kr.co.easydog.servlet.service;

import java.io.IOException;

import java.text.ParseException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

public class PetLostSearchService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
		
		
		String lost_name = request.getParameter("lost_name");
		
		
		PetLostDAO dao = PetLostDAO.getInstance();
		dao.searchPetLost(lost_name);
		
		List<PetLostVO> petlostsearch = dao.searchPetLost(lost_name);
		
		request.setAttribute("petlostsearch", petlostsearch);
	}
}
=======
package kr.co.easydog.servlet.service;

import java.io.IOException;

import java.text.ParseException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

public class PetLostSearchService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
		
		
		String lost_name = request.getParameter("lost_name");
		
		
		PetLostDAO dao = PetLostDAO.getInstance();
		dao.searchPetLost(lost_name);
		
		List<PetLostVO> petlostsearch = dao.searchPetLost(lost_name);
		
		request.setAttribute("petlostsearch", petlostsearch);
	}
}
>>>>>>> djdh94
