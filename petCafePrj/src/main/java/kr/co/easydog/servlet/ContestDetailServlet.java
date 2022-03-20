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
 * Servlet implementation class ContestDetailServlet
 */
@WebServlet("/contestdetail")
public class ContestDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContestDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContestDAO dao = ContestDAO.getInstance();
		String snum=request.getParameter("cont_num");
		int cnum=Integer.parseInt(snum);
		ContestVO contest = dao.getDetail(cnum);
		request.setAttribute("contest", contest);
		RequestDispatcher dp = request.getRequestDispatcher("/contest/contestdetail.jsp");
		dp.forward(request, response);
	}

}
