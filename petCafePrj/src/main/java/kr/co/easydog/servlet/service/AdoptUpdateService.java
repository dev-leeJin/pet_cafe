package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.AdoptDAO;

public class AdoptUpdateService implements IAdoptService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		int anum = Integer.parseInt(request.getParameter("adopt_num"));
		
		String kind = request.getParameter("kind");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		boolean gender= Boolean.parseBoolean(request.getParameter("gender"));
		String price = request.getParameter("price");
		String phone = request.getParameter("phone");
		
		AdoptDAO adoptdao = AdoptDAO.getInstance();
		adoptdao.updateAdopt(anum, kind, name, age, gender, price, phone);
		
	}
}
