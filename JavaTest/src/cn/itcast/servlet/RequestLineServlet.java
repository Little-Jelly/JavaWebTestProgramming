package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestLineServlet extends HttpServlet {

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("getMethod: "+ req.getMethod()+ "<br />");
		out.println("getRequestURI: "+ req.getRequestURI() +"<br />");
		out.println("getQueryString: "+req.getQueryString()+"<br />");
		out.println("getProtocol: "+req.getProtocol()+"<br />");
		out.println("getContextPath: "+req.getContextPath()+"<br />");
		out.println("getPathInfo: "+req.getPathInfo()+"<br />");
		out.println("getPathTranslated: "+req.getPathTranslated()+"<br />");
		out.println("getServletPath: "+req.getServletPath()+"<br />");
		out.println("getRemoteAddr: "+req.getRemoteAddr()+"<br />");
		out.println("getRemoteHost: "+req.getRemoteHost()+"<br />");
		out.println("getRemotePort: "+req.getRemotePort()+"<br />");
		out.println("getLocalAddr: "+req.getLocalAddr()+"<br />");
		out.println("getLocalName: "+req.getLocalName()+"<br />");
		out.println("getLocalPort: "+req.getLocalPort()+"<br />");
		out.println("getServerName: "+req.getServerName()+"<br />");
		out.println("getServerPort: "+req.getServerPort()+"<br />");
		out.println("getScheme: "+req.getScheme()+"<br />");
		out.println("getRequestURL: "+req.getRequestURL()+"<br />");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
