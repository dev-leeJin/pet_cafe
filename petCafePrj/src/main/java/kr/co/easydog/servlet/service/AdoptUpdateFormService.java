package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.AdoptDAO;
import kr.co.easydog.AdoptVO;

public class AdoptUpdateFormService implements IAdoptService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String snum = request.getParameter("adopt_num");
		int anum = 0;
		if(snum != null) {
			anum = Integer.parseInt(snum);	
		}
		
		AdoptDAO adoptdao = AdoptDAO.getInstance();
		AdoptVO adopt = adoptdao.getDetail(anum);
		request.setAttribute("adopt", adopt);
		
	}
}
