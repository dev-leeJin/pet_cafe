package kr.co.easydog.servlet.service;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.ContestDAO;
import kr.co.easydog.ContestVO;
import kr.co.easydog.PageDTO;
import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;

public class ContestListService implements IContestService{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String strpageNum = request.getParameter("pageNum");
		int pageNum = 1;
		
		try {
			if(strpageNum != null) {
				pageNum = Integer.parseInt(strpageNum);
			}
		} catch(Exception e) {

		}
		
		ContestDAO dao = ContestDAO.getInstance();
		List<ContestVO> contestList = dao.getAllContestList(pageNum);
		request.setAttribute("contestList", contestList);
		
		int boardCount = dao.getPageNum();
		
		PageDTO dto = new PageDTO(boardCount, pageNum);
		request.setAttribute("dto", dto);
		
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
		
		PetDAO dao2 = PetDAO.getInstance();
		PetVO petData2 = dao2.getOnePet2(sId);
		
		request.setAttribute("petData2", petData2);
	}
	
}
