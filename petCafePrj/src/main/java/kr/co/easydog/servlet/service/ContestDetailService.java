package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;
import kr.co.easydog.ContestVO;

public class ContestDetailService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum=request.getParameter("cont_num");
		ContestDAO dao = ContestDAO.getInstance();
		int cnum=Integer.parseInt(snum);
		dao.upHit(cnum);
		ContestVO contest = dao.getDetail(cnum);
		request.setAttribute("contest", contest);
		
		
	}

}
