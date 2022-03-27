package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

<<<<<<< HEAD
<<<<<<<< HEAD:petCafePrj/src/main/java/kr/co/easydog/servlet/service/BoardListService.java
import kr.co.easydog.BoardDAO;
import kr.co.easydog.BoardVO;
========
import kr.co.easydog.AdoptDAO;
import kr.co.easydog.AdoptVO;
import kr.co.easydog.PageDTO;
import kr.co.easydog.servlet.service.IAdoptService;
>>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde:petCafePrj/src/main/java/kr/co/easydog/servlet/service/AdoptListService.java
=======
import kr.co.easydog.BoardDAO;
import kr.co.easydog.BoardVO;
import kr.co.easydog.PageDTO;
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde

public class BoardListService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
<<<<<<<< HEAD:petCafePrj/src/main/java/kr/co/easydog/servlet/service/BoardListService.java
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardVO> boardList=dao.getAllBoardList();
		request.setAttribute("boardList", boardList);
========
=======
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde
		
		String strpageNum = request.getParameter("pageNum");
		int pageNum = 1;
		
		try {
			if(strpageNum != null) {
				pageNum = Integer.parseInt(strpageNum);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
<<<<<<< HEAD
		
		AdoptDAO dao = AdoptDAO.getInstance();
		List<AdoptVO> adoptList = dao.getAllAdoptList(pageNum);
		request.setAttribute("adoptList", adoptList);
>>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde:petCafePrj/src/main/java/kr/co/easydog/servlet/service/AdoptListService.java
=======
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardVO> boardList=dao.getAllBoardList(pageNum);
		request.setAttribute("boardList", boardList);
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde
		
		int boardCount = dao.getPageNum();
		// 아래에 DTO 생성
		PageDTO dto = new PageDTO(boardCount, pageNum);
		System.out.println(boardCount);
		request.setAttribute("dto", dto);
<<<<<<< HEAD

=======
		
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
	}

}
