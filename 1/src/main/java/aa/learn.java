package aa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class learn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public learn() {
        super();
    }

	
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1>Hello world, Service Method</h1>");
	}*/

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name=request.getParameter("fname");
		out.print("Hello world, doGetMethod");
		out.print("<br/>Hello"+name);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name=request.getParameter("fname");
		out.print("Hello world, doPostMethod");
		out.print("<br/>Hello"+name);
	}

}
