package com.weibao.user.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.weibao.dao.DengluUserDAO;

public abstract class UserBaseAction extends ActionSupport implements ServletRequestAware,
ServletResponseAware,ServletContextAware{


protected HttpServletRequest request;
protected HttpServletResponse response;
protected ServletContext application;



 protected DengluUserDAO udao=new DengluUserDAO();

public String execute() throws Exception{
  
System.out.println("¹þ¹þ¹þ---À´ÁË--");


return "sucess";



}

public void setServletRequest(HttpServletRequest request) {
this.request=request;

}

public void setServletResponse(HttpServletResponse response) {
this.response=response;

}

public void setServletContext(ServletContext application) {
this.application=application;

}

}
