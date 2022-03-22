package kr.co.easydog.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.ContestDAO;
import kr.co.easydog.ContestVO;
import kr.co.easydog.PageDTO;

/**
 * Servlet implementation class ContestlistServlet
 */
@WebServlet("/contestlist")
public class ContestlistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContestlistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strpageNum = request.getParameter("pageNum");
		int pageNum = 1;
		
		
		try {
			if(strpageNum != null) {
				pageNum = Integer.parseInt(strpageNum);
			}
		} catch(Exception e) {

		}
		
		ContestDAO dao = ContestDAO.getInstance();
		List<ContestVO> contestList = dao.getAllContestList(pageNum);
		request.setAttribute("contestList", contestList);
		
		int boardCount = dao.getPageNum();
		
		PageDTO dto = new PageDTO(boardCount, pageNum);
		System.out.println(dto);
		request.setAttribute("dto", dto);
		
		RequestDispatcher dp = request.getRequestDispatcher("/contest/contestlist.jsp");
		dp.forward(request, response);
	}

}

