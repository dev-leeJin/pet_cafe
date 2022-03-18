package kr.co.easydog.service;


import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.ContestDAO;
import kr.co.easydog.ContestVO;

public class ContestListService implements IContestService{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		ContestDAO dao = ContestDAO.getInstance();
		List<ContestVO> contestList = dao.getAllContestList();
		request.setAttribute("contestList", contestList);
		
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
		
	}
	
}
