package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;



/**
 * Servlet implementation class ContestUpdateServlet
 */
@WebServlet("/contestUpdate")
public class ContestUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContestUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String snum=request.getParameter("cont_num");
		int bnum = Integer.parseInt(snum);
		String title = request.getParameter("title");
		String content=request.getParameter("content");
		ContestDAO dao = ContestDAO.getInstance();
		dao.ContestUpdate(title, content, bnum);
		response.sendRedirect("http://localhost:8181/petCafePrj/contestdetail?cont_num="+bnum);
	}

}
