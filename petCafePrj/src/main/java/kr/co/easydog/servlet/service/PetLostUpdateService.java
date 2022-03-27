package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;

public class PetLostUpdateService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
		
		String lostName = request.getParameter("lost_name");
        String lostZone = request.getParameter("lost_zone");
        String lostSize = request.getParameter("lost_size");
	    String lostphone = request.getParameter("lost_phone");
	    int lostPhone = Integer.parseInt(lostphone);
		String lostnum = request.getParameter("lost_num");
		int lostNum = Integer.parseInt(lostnum);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    String lostdate = request.getParameter("lost_date");
	    Date lostDate = new Date(sdf.parse(lostdate).getTime());
	    
		PetLostDAO dao = PetLostDAO.getInstance();
		dao.updatePetLost(lostName, lostZone, lostSize, lostPhone, lostDate, lostNum);
	}
}
