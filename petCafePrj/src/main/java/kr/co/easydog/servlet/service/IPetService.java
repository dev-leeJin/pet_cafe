package kr.co.easydog.servlet.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IPetService {
	
	void execute(HttpServletRequest request, HttpServletResponse response);

}
