package com.weibao.UpLoad;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.weibao.dao.ChaKanFileDAO;

public class BaseAction extends ActionSupport implements ServletContextAware,SessionAware,ServletRequestAware,ServletResponseAware{
	/**
	 * 
	 */
	public ChaKanFileDAO cfd=new ChaKanFileDAO();
	private static final long serialVersionUID = 1L;
	protected ServletContext appliction;
	protected Map<String,Object>session;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	public void setServletContext(ServletContext appliction) {
	    this.appliction=appliction;
	    
		
	}
	protected String getRealPath(String path){
		return appliction.getRealPath(path);
		
	}
	public ServletContext getAppliction() {
		return appliction;
	}
	public void setAppliction(ServletContext appliction) {
		this.appliction = appliction;
	}
	
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
		
	}
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}

}
