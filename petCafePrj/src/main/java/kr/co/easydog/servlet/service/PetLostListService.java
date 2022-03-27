package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.PageDTO;
import kr.co.easydog.PetLostDAO;
import kr.co.easydog.PetLostVO;

public class PetLostListService implements IPetLostService{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strpageNum = request.getParameter("pageNum");
		int pageNum = 1;
		
		
		try {
			if(strpageNum != null) {
				pageNum = Integer.parseInt(strpageNum);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		PetLostDAO dao = PetLostDAO.getInstance();

		List<PetLostVO> petlostList = dao.getAllPetLostList(pageNum);
		
		int boardCount = dao.getPageNum();
		// 아래에 DTO 생성
		PageDTO dto = new PageDTO(boardCount, pageNum);
		System.out.println(dto);
		request.setAttribute("dto", dto);
		
		request.setAttribute("petlost", petlostList);		
	}
}
