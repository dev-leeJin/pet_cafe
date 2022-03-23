package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;
public class ContestVoteService implements IContestService{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum = request.getParameter("cont_num");
		int bnum=Integer.parseInt(snum);
		ContestDAO dao = ContestDAO.getInstance();
		dao.votes(bnum);
		
	}

}
