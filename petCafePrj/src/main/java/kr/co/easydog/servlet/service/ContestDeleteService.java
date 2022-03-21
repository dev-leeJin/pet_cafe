package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.ContestDAO;

public class ContestDeleteService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String snum=request.getParameter("cont_num");
		int bnum=Integer.parseInt(snum);
		String uId=request.getParameter("user_id");
		HttpSession session = request.getSession();
		String sId=(String)request.getAttribute("session_id");
		if(sId.equals(uId)) {
			ContestDAO dao = ContestDAO.getInstance();
			dao.ContestDelete(bnum);
		}
		
		
	}

}
