package kr.co.easydog.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;

/**
 * Servlet implementation class ContestInsertServlet
 */
@WebServlet("/contestInsert")
public class ContestInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContestInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    //제가 어제말씀해주신거에서 2번으로 바꿧어요 디테일하게해보려고 ㅜ 근데 데이터가 안들어가요 음..
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContestDAO dao = ContestDAO.getInstance();
		request.setCharacterEncoding("utf-8");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String uid=request.getParameter("uid");
		String snum = request.getParameter("pnum");
		int pnum = Integer.parseInt(snum);
		String bnum=request.getParameter("pvote");
		int pvotes=Integer.parseInt(bnum);
		dao.ContestInsert(uid, title, content, pnum, pvotes);
		response.sendRedirect("/petCafePrj/contestlist");
	}
}
