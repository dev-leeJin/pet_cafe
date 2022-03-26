package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;

public class ContestInsertService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContestDAO dao = ContestDAO.getInstance();
		request.setCharacterEncoding("utf-8");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String uid=request.getParameter("uid");
		
		String snum = request.getParameter("pnum");
		int pnum = Integer.parseInt(snum);
		
		String bnum=request.getParameter("pvote");
		int pvotes=Integer.parseInt(bnum);
		
		dao.ContestInsert(uid, title, content, pnum, pvotes);
		
	}

}
