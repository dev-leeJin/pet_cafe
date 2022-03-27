package kr.co.easydog.servlet.service;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.ContestDAO;
import kr.co.easydog.ContestVO;
<<<<<<< HEAD
=======
import kr.co.easydog.PageDTO;
import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde

public class ContestListService implements IContestService{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
<<<<<<< HEAD
		ContestDAO dao = ContestDAO.getInstance();
		List<ContestVO> contestList = dao.getAllContestList();
		request.setAttribute("contestList", contestList);
		
=======
		
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
		
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
		
<<<<<<< HEAD
=======
		PetDAO dao2 = PetDAO.getInstance();
		PetVO petData2 = dao2.getOnePet2(sId);
		
		request.setAttribute("petData2", petData2);
>>>>>>> 55dab14bae69972985c2a89c760df6c2694bcdde
	}
	
}
