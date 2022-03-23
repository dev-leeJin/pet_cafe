package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;

public class PetLostInsertService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PetLostDAO dao = PetLostDAO.getInstance();
		
        String lostName = request.getParameter("lost_name");
        String lostZone = request.getParameter("lost_zone");
        String lostsize = request.getParameter("lost_size");
	    int lostSize = Integer.parseInt(lostsize);
	    String lostphone = request.getParameter("lost_phone");
	    int lostPhone = Integer.parseInt(lostphone);
	    String lostdate = request.getParameter("lost_date");
	    int lostDate = Integer.parseInt(lostdate);

        dao.insertPetLost(lostName, lostZone, lostSize, lostPhone, lostDate);	
	}
}
