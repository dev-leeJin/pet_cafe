package kr.co.easydog.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;
import kr.co.easydog.ContestVO;

/**
 * Servlet implementation class ContestUpdateForm
 */
@WebServlet("/contestUpdateform")
public class ContestUpdateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContestUpdateForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snum= request.getParameter("cont_num");
		int bnum = Integer.parseInt(snum);
		ContestDAO dao = ContestDAO.getInstance();
		ContestVO contest = dao.getDetail(bnum);
		request.setAttribute("contest", contest);
		RequestDispatcher dp = request.getRequestDispatcher("/contest/contestupdate.jsp");
		dp.forward(request, response);
	}
}
