package kr.co.easydog.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;

public class ContestUpdateService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String snum=request.getParameter("cont_num");
		int bnum = Integer.parseInt(snum);
		String title = request.getParameter("title");
		String content=request.getParameter("content");
		ContestDAO dao = ContestDAO.getInstance();
		dao.ContestUpdate(title, content, bnum);
		
	}

}
