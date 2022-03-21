package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.BoardDAO;

public class BoardInsertService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getInstance();
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String writer=request.getParameter("writer");
		dao.insertBoard(title, content, writer);
		
	}

}
