package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;

/**
 * Servlet implementation class ContestDeleteServlet
 */
@WebServlet("/contestdelete")
public class ContestDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContestDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContestDAO dao = ContestDAO.getInstance();
		String snum=request.getParameter("cont_num");
		int bnum=Integer.parseInt(snum);
		dao.ContestDelete(bnum);
		response.sendRedirect("http://localhost:8181/petCafePrj/contestlist");
		
	}

}
