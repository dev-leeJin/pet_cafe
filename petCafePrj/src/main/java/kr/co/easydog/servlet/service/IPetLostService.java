
package kr.co.easydog.servlet.service;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IPetLostService {
	void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException;
}

