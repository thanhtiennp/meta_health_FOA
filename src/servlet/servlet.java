package servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ThongTin;
import dao.ThongTinDAO;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		ArrayList<ThongTin> array = new ArrayList<ThongTin>();
//		ThongTinDAO ji07 = new ThongTinDAO();
//		array=ji07.getThongTin();
//		
//	request.setAttribute("thongtin",array);
	ThongTinDAO ttd= new ThongTinDAO(); 
	 ArrayList<ThongTin> arrayList =ttd.getThongTin(1,20);
		/*
		 * ArrayList<String> arrayList = new ArrayList<String>();
		 * arrayList.add("tien1");
		 */
	 
	 		//ArrayList<String> arrayListtest = new ArrayList<String>();
	 		//arrayListtest.add("tien1");
	 		
		  request.setAttribute("thongtin", arrayList);	
		 
		  request.getParameter("page");

		  
		 // request.setAttribute("test", arrayListtest);
		  
		  request.getRequestDispatcher("/WEB-INF/jsp/user/ji07.jsp").forward(request,
		  response);
		 
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ThongTinDAO ttd= new ThongTinDAO(); 
		String page = request.getParameter("page");
		int pageInteger = Integer.parseInt(page);
		int frist = (pageInteger*10)+(pageInteger -2)*10+1;
		int end = pageInteger*20;
		ArrayList<ThongTin> arrayList =ttd.getThongTin(frist,end);
			
		 		
			  request.setAttribute("thongtin", arrayList);	
			 
			//  request.getParameter("page");

			  
			
			  request.getRequestDispatcher("/WEB-INF/jsp/user/ji07.jsp").forward(request,
			  response);
			 
			//response.getWriter().append("Served at: ").append(request.getContextPath());

	}

}
