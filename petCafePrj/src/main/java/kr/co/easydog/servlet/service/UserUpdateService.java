package kr.co.easydog.servlet.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.UserDAO;
import kr.co.easydog.UserVO;

public class UserUpdateService implements IUesrService{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		String id = (String)session.getAttribute("session_id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		UserDAO userDao = UserDAO.getInstance();
		
		userDao.userUpdate(id, pw, name, email);
		
	}
}
