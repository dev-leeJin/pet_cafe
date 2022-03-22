package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.AdoptDAO;

public class AdoptInsertService implements IAdoptService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AdoptDAO adoptdao = AdoptDAO.getInstance();
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("session_id");
		String uId = request.getParameter("user_id");
		String kind = request.getParameter("kind"); 
		String name = request.getParameter("name"); 
		int age = Integer.parseInt(request.getParameter("age")); 
		Boolean gender = Boolean.parseBoolean(request.getParameter("gender")); 
		String price = request.getParameter("price"); 
		String phone = request.getParameter("phone"); 
		if(id.equals(uId)) {
			adoptdao.insertAdopt(id, kind, name, age, gender, price, phone);
		}
	}
}
