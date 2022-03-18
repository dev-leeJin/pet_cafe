package kr.co.easydog.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import kr.co.easydog.servlet.service.IPetService;
import kr.co.easydog.servlet.service.IUesrService;
import kr.co.easydog.servlet.service.LogoutService;
import kr.co.easydog.servlet.service.PetDeleteService;
import kr.co.easydog.servlet.service.PetJoinCheckService;
import kr.co.easydog.servlet.service.PetUpdateFormService;
import kr.co.easydog.servlet.service.PetUpdateService;
import kr.co.easydog.servlet.service.PetWelcomeService;
import kr.co.easydog.servlet.service.UserUpdateFormSerivce;
import kr.co.easydog.servlet.service.UserUpdateService;
import kr.co.easydog.service.ContestDeleteService;
import kr.co.easydog.service.ContestDetailService;
import kr.co.easydog.service.ContestInsertFormService;
import kr.co.easydog.service.ContestUpdateFormService;
import kr.co.easydog.service.ContestUpdateService;
import kr.co.easydog.service.ContestInsertService;
import kr.co.easydog.service.ContestListService;
import kr.co.easydog.service.IContestService;
import kr.co.easydog.servlet.service.IPetLostService;
import kr.co.easydog.servlet.service.PetLostDeleteService;
import kr.co.easydog.servlet.service.PetLostDetailService;
import kr.co.easydog.servlet.service.PetLostInsertFormService;
import kr.co.easydog.servlet.service.PetLostInsertService;
import kr.co.easydog.servlet.service.PetLostListService;
import kr.co.easydog.servlet.service.PetLostSearchService;
import kr.co.easydog.servlet.service.PetLostUpdateFormService;
import kr.co.easydog.servlet.service.PetLostUpdateService;



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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	
	private void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		
		String ui = null;
				
		IPetLostService lv = null;
		IUesrService uv = null;
		IPetService pv = null;
		IContestService sv = null;
		
		if(uri.equals("/petCafePrj/logout.do")) {
			uv = new LogoutService();
			uv.execute(request, response);
			ui = "/users/login_form.jsp";
		} else if (uri.equals("/petCafePrj/userUpdate.do")) {
			uv = new UserUpdateFormSerivce();
			uv.execute(request, response);
			ui = "/user/login_update.jsp";
		} else if (uri.equals("/petCafePrj/updateCheck.do")) {
			uv = new UserUpdateService();
			uv.execute(request, response);
			ui = "/users/login_welcome.jsp";
		} else if(uri.equals("/petCafePrj/petjoin.do")) {
			ui = "/pet/pet_join.jsp";
		} else if(uri.equals("/petCafePrj/petJoinCheck.do")) {
			pv = new PetJoinCheckService();
			pv.execute(request, response);
			ui = "/petWelcome.do";
		} else if(uri.equals("/petCafePrj/petWelcome.do")) {
			pv = new PetWelcomeService();
			pv.execute(request, response);
			ui = "/pet/pet_welcome.jsp";
		} else if(uri.equals("/petCafePrj/petUpdate.do")) {
			pv = new PetUpdateFormService();
			pv.execute(request, response);
			ui = "/pet/pet_update.jsp";
		} else if(uri.equals("/petCafePrj/petUpdateCheck.do")) {
			pv = new PetUpdateService();
			pv.execute(request, response);
			ui = "/petWelcome.do";
		} else if(uri.equals("/petCafePrj/petDelete.do")) {
			pv = new PetDeleteService();
			pv.execute(request, response);
			ui = "/petWelcome.do";
		} else if(uri.equals("/petCafePrj/contestlist.do")) {
			sv=new ContestListService();
			sv.execute(request, response);
			ui = "/contest/contestlist.jsp";
		}else if(uri.equals("/petCafePrj/contestdetail.do")) {
			sv=new ContestDetailService();
			sv.execute(request, response);
			ui="/contest/contestdetail.jsp";
		}else if(uri.equals("/petCafePrj/contestInsertForm.do")) {
			sv=new ContestInsertFormService();
			sv.execute(request, response);
			ui="/contest/contestInsert.jsp";
		}else if(uri.equals("/petCafePrj/contestInsert.do")){
			sv=new ContestInsertService();
			sv.execute(request, response);
			ui="/petCafePrj/contestlist";
		}else if(uri.equals("/petCafePrj/contestdelete.do")) {
			sv=new ContestDeleteService();
			sv.execute(request, response);
			ui="/contestlist.do";
		}else if(uri.equals("/petCafePrj/contestUpdateform.do")) {
			sv=new ContestUpdateFormService();
			sv.execute(request, response);
			ui="/contest/contestupdate.jsp";
		}else if(uri.equals("/petCafePrj/contestUpdate.do")) {
			sv=new ContestUpdateService();
			sv.execute(request, response);
			ui="/contestdetail.do?cont_num="+request.getParameter("cont_num");
		}else if(uri.equals("/petCafePrj/petlostlist.do")) {
	    	lv = new PetLostListService();
	    	lv.excute(request, response);
	    	ui = "/pet_lost/petlost_list.jsp";
	    	
	    }else if(uri.equals("/petCafePrj/detailpetlost.do")) {
	    	lv = new PetLostDetailService();
	    	lv.excute(request, response);
	    	ui = "/pet_lost/petlost_detail.jsp";
	    
	    }else if(uri.equals("/petCafePrj/insertpetlostform.do")) {
	    	lv = new PetLostInsertFormService();
	    	lv.excute(request, response);
	    	ui = "/pet_lost/petlostForm.jsp";
	    
	    }else if(uri.equals("/petCafePrj/insertpetlost.do")) {
	    	lv = new PetLostInsertService();
	    	lv.excute(request, response);
	    	ui = "/petlostlist.do";
	    
	    }else if(uri.equals("/petCafePrj/deletepetlost.do")) {
	    	lv = new PetLostDeleteService();
	    	lv.excute(request, response);
	    	ui = "/petlostlist.do";
	    
	    }else if(uri.equals("/petCafePrj/updateformpetlost.do")) {
	    	lv = new PetLostUpdateFormService();
	    	lv.excute(request, response);
	    	ui = "/pet_lost/petlost_updateForm.jsp";
	    
	    }else if(uri.equals("/petCafePrj/updatepetlost.do")) {
	    	lv = new PetLostUpdateService();
	    	lv.excute(request, response);
	    	ui = "/petlostdetail.do?lost_num=" + request.getParameter("lost_num");
	    
	    }else if(uri.equals("/petCafePrj/searchpetlost.do")) {
	    	lv = new PetLostSearchService();
	    	lv.excute(request, response);
	    	ui = "";	    
	    }
		else{
			ui = "/";
		}
		
		RequestDispatcher dp = request.getRequestDispatcher(ui);
		dp.forward(request, response);
	}

}