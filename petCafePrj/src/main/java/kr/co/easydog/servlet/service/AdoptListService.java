package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.AdoptDAO;
import kr.co.easydog.AdoptVO;
import kr.co.easydog.servlet.service.IAdoptService;

public class AdoptListService implements IAdoptService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdoptDAO dao = AdoptDAO.getInstance();
		List<AdoptVO> adoptList = dao.getAllAdoptList();
		request.setAttribute("adoptList", adoptList);
		
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
	}
}
