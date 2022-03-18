package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;

public class PetLostUpdateService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String lostName = request.getParameter("lost_name");
        String lostZone = request.getParameter("lost_zone");
        String lostsize = request.getParameter("lost_size");
	    int lostSize = Integer.parseInt(lostsize);
	    String lostphone = request.getParameter("lost_phone");
	    int lostPhone = Integer.parseInt(lostphone);
		String lostnum = request.getParameter("lost_num");
		int lostNum = Integer.parseInt(lostnum);
	    
		PetLostDAO dao = PetLostDAO.getInstance();
		dao.updatePetLost(lostName, lostZone, lostSize, lostPhone, lostNum);
	}
}
