package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.BoardDAO;

public class BoardDeleteService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum= request.getParameter("board_num");
		int bnum = Integer.parseInt(snum);
		String writer = request.getParameter("writer");
		HttpSession session = request.getSession();
		String sid = (String)session.getAttribute("session_id");
		if(sid.equals(writer)) {
		BoardDAO dao = BoardDAO.getInstance();
		dao.getBoardDelete(bnum);
		}
		
	}

}
