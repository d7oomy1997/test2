package disPlatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		RequestDispatcher rd=null;
		if (username.equalsIgnoreCase("asdasd20101")&& password.equals("Aa1122334455")) {
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("login.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.println("<br/><center> <span style= 'color:red'>Invalid Credentials!!</span></center> ");
		}
	}
}
