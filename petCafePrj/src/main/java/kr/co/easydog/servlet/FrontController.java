package kr.co.easydog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.easydog.servlet.service.PetLostService;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get방식 요청으로 요청이 들어오건
		doRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post방식 요청으로  요청이 들어오건 동일하게 doRequest에서 처리하도록 설정
		doRequest(request, response);
	}
	
	// doGet, doPost 어떤 형식으로 요청이 들어올지 모르기 때문에 
	// 공용 메서드를 하단에 하나 생성한다.
	private void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// post방식도 처리하게 할 수 있으므로 인코딩 설정
		request.setCharacterEncoding("utf-8");		
		// 프론트 컨트롤러는 여러 주소 요청을 처리하기 때문에 uri부터 받는다.
	    String uri = request.getRequestURI();
	    // 포워딩할 .jsp 파일의 경로를 미리 저장해둘 변수
	    String ui = null;
		// 다형성을 이용해 요청주소에 따른 처리해줄 서비스 
	    PetLostService sv = null;
	    System.out.println(uri);
	}
}