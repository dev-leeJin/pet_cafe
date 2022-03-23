package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.BoardDAO;
import kr.co.easydog.BoardVO;
import kr.co.easydog.PageDTO;

public class BoardListService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strpageNum = request.getParameter("pageNum");
		int pageNum = 1;
		
		try {
			if(strpageNum != null) {
				pageNum = Integer.parseInt(strpageNum);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardVO> boardList=dao.getAllBoardList(pageNum);
		request.setAttribute("boardList", boardList);
		
		int boardCount = dao.getPageNum();
		// 아래에 DTO 생성
		PageDTO dto = new PageDTO(boardCount, pageNum);
		System.out.println(boardCount);
		request.setAttribute("dto", dto);
		
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
	}

}
