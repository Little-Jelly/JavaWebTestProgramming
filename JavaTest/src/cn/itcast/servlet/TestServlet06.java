package cn.itcast.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet06 extends HttpServlet {
	/*
	 * 用来读取资源文件itcast.properties的内容
	 */
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		PrintWriter out = resp.getWriter();
//		InputStream in = context.getResourceAsStream("/WebContent/WEB-INF/itcast.properties");
		InputStream in = context.getResourceAsStream("/WEB-INF/itcast.properties");
		Properties pros = new Properties();
		pros.load(in);
		out.println("Company=" + pros.getProperty("Company") + "<br />");
		out.println("Address=" + pros.getProperty("Address") + "<br />");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
