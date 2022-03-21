package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.AdoptDAO;
import kr.co.easydog.AdoptVO;
import kr.co.easydog.servlet.service.IAdoptService;

public class AdoptDetailService implements IAdoptService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdoptDAO dao = AdoptDAO.getInstance();
		
		String snum = request.getParameter("adopt_num");
		int cnum = Integer.parseInt(snum);
		
		AdoptVO adoptData = dao.getDetail(cnum);
		request.setAttribute("adoptData", adoptData);
		
	}
}
