package com.weibao.YgXxAction;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.weibao.dao.YuangongXinxiDAO;
import com.weibao.user.action.UserBaseAction;

public abstract class YgBaseAction  extends UserBaseAction {
	/**
	 * UserBaseAction.java
	 */
	private static final long serialVersionUID = 1L;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map<String,Object>session;
	protected ServletContext application;
	
	YuangongXinxiDAO ygdao=new YuangongXinxiDAO();
	 
	public String execute() throws Exception {
		
		 System.out.println("进入了baseAction了---");
		 
		return "sucess";
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ServletContext getApplication() {
		return application;
	}

	public void setApplication(ServletContext application) {
		this.application = application;
	}

	public YuangongXinxiDAO getYgdao() {
		return ygdao;
	}

	public void setYgdao(YuangongXinxiDAO ygdao) {
		this.ygdao = ygdao;
	}

	
	
}
