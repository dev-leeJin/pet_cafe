package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

public class PetLostSearchService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    String sdate = request.getParameter("sDate");
	    Date sDate = new Date(sdf.parse(sdate).getTime());

	    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	    String fdate = request.getParameter("fDate");
	    Date fDate = new Date(sdf2.parse(fdate).getTime());
		
		String sD = request.getParameter("sD");
		
		
		PetLostDAO dao = PetLostDAO.getInstance();
		dao.searchPetLost(sDate, fDate, sD);
		
		List<PetLostVO> petlostsearch = dao.searchPetLost(sDate, fDate, sD);
		
		request.setAttribute("petlostsearch", petlostsearch);
	}
}
