package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		if(isUserLoggedIn(request))
		{
			request.getRequestDispatcher("/homepage.jsp").include(request, response);
			System.out.println("1");
			
		}
		
		else
		{
			request.getRequestDispatcher("/login.jsp").include(request, response);
			System.out.println("2");
		}
		
		response.setContentType("text/html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
	}
	private boolean isUserLoggedIn(HttpServletRequest request)
	{
		HttpSession session = request.getSession(true); 
		String login = (String)session.getAttribute("login");
		
		if(login == null)
		{
			return false;
		}
		return true;
	}

}
