package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.ContestDAO;
import kr.co.easydog.ContestVO;
import kr.co.easydog.PetDAO;
import kr.co.easydog.PetVO;

public class ContestDetailService implements IContestService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum=request.getParameter("cont_num");
		ContestDAO dao = ContestDAO.getInstance();
		int cnum=Integer.parseInt(snum);
		dao.upHit(cnum);
		ContestVO contest = dao.getDetail(cnum);
		request.setAttribute("contest", contest);
		
		
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
		
		String pnum=request.getParameter("pet_num");
		int pNum=Integer.parseInt(pnum);
		PetDAO dao2 = PetDAO.getInstance();
		List<PetVO> pets = dao2.getPetsList2(pNum);
		request.setAttribute("pets", pets);
	}

}
