package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.AdoptDAO;

public class AdoptDeleteService implements IAdoptService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int anum = Integer.parseInt(request.getParameter("adopt_num"));
		
		String uId = request.getParameter("user_id");
		
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		
		if(sId.equals(uId)) {
			AdoptDAO adoptdao = AdoptDAO.getInstance();
			adoptdao.deleteAdopt(anum);
		}
	}
}
