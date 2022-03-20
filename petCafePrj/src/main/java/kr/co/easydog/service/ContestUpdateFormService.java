package kr.co.easydog.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;
import kr.co.easydog.ContestVO;

public class ContestUpdateFormService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum= request.getParameter("cont_num");
		int bnum=0;
		if(snum != null) {
			bnum = Integer.parseInt(snum);	
		}
		ContestDAO dao = ContestDAO.getInstance();
		ContestVO contest = dao.getDetail(bnum);
		request.setAttribute("contest", contest);
		
	}

}
