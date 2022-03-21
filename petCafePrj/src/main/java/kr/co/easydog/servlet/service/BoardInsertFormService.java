package kr.co.easydog.servlet.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BoardInsertFormService implements IContestService{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sId =(String)session.getAttribute("session_id");
		request.setAttribute("sId", sId);
		
	}
	
}
