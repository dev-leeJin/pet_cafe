package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.BoardDAO;
import kr.co.easydog.BoardVO;

public class BoardDetailService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getInstance();
		String snum=request.getParameter("board_num");
		int bnum=Integer.parseInt(snum);
		BoardVO board = dao.getBoardDetail(bnum);
		dao.upHit(bnum);
		request.setAttribute("board", board);
		
	}

}
