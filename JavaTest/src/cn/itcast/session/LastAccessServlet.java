package cn.itcast.session;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LastAccessServlet extends HttpServlet{

	// 使用cookie技术，返回用户最近一次访问的时间
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		String lastAccessTime = null;
		String flag = null;
		Cookie[] cookies = req.getCookies();
		for (int i = 0; cookies != null && i < cookies.length; i++ ){
			if("lastAccess".equals(cookies[i].getName())){
				lastAccessTime = cookies[i].getValue();
				flag = cookies[i].getValue();
				continue;
			}
		}
		if (lastAccessTime == null){
			resp.getWriter().println("你是首次访问本站");
		} else{
			resp.getWriter().println("您上次的访问时间是："
					+ lastAccessTime);
		}
		resp.getWriter().print(flag);
		
		String currentTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
		Cookie cookie = new Cookie("lastAccess", currentTime);
		Cookie cookie2 = new Cookie("flag", "helloworld");
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
