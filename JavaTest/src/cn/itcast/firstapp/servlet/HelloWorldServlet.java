package cn.itcast.firstapp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet{

	public void init(ServletConfig config){
		System.out.println("init method is called!");
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello, world");
	}
	public void destroy(){
		System.out.println("destroy method id called");
	}

}
