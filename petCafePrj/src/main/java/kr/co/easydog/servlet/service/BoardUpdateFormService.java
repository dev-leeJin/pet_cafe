package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.BoardDAO;
import kr.co.easydog.BoardVO;

public class BoardUpdateFormService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum = request.getParameter("board_num");
		int bnum=0;
		if(snum!=null) {
			bnum = Integer.parseInt(snum);	
		}
		BoardDAO dao= BoardDAO.getInstance();
		BoardVO board=dao.getBoardDetail(bnum);
		request.setAttribute("board", board);
		
	}

}
