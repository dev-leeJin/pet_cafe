package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.AdoptDAO;
import kr.co.easydog.AdoptVO;
import kr.co.easydog.PageDTO;
import kr.co.easydog.servlet.service.IAdoptService;

public class AdoptListService implements IAdoptService{

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
		
		AdoptDAO dao = AdoptDAO.getInstance();
		List<AdoptVO> adoptList = dao.getAllAdoptList(pageNum);
		request.setAttribute("adoptList", adoptList);
		
		int boardCount = dao.getPageNum();
		// 아래에 DTO 생성
		PageDTO dto = new PageDTO(boardCount, pageNum);
		System.out.println(dto);
		request.setAttribute("dto", dto);
		
		HttpSession session = request.getSession();
		String sId = (String)session.getAttribute("session_id");
		request.setAttribute("sId",sId);
	}
}
