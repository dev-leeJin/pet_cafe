package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.BoardDAO;

public class BoardUpdateService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum = request.getParameter("board_num");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		int bnum = Integer.parseInt(snum);
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.getBoardUpdate(title, content, bnum);
		
	}

}
