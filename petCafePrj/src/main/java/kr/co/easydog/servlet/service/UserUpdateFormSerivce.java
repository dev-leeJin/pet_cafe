package kr.co.easydog.servlet.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.easydog.UserDAO;
import kr.co.easydog.UserVO;

public class UserUpdateFormSerivce implements IUesrService{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		String id = (String)session.getAttribute("session_id");
		
		UserDAO userDao = UserDAO.getInstance();
		
		UserVO userData = userDao.getUserData(id);
		
		request.setAttribute("userdata", userData);
	}
}
