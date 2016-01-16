package com.weibao.user.action;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.weibao.dao.DengluUserDAO;
import com.weibao.entity.DengluUser;
import com.weibao.test.action.BaseAction;

public class UserSaveAction extends UserBaseAction {

	private DengluUser u;
   //  private String imagecode;
     
     public DengluUser getU() {
		return u;
	}

	public void setU(DengluUser u) {
		this.u = u;
	}

	private boolean yes;
     
	public String saveUser() throws Exception {
		List<DengluUser>  users = udao.findByusername(u.getUserName());
		if(!users.isEmpty()){

		       ActionContext.getContext().getValueStack().set("registerro", "用户名重复");  
		    
			return "fail";
		}
	//	String code=(String)session.get("IMAGE_CODE");
		System.out.println("Saveaction进来了----");
		
	//	if(imagecode!=null&&imagecode.equals(code)){
	
	//		yes=true;
			udao.save(u);
    System.out.println("U:"+u);
	//	}else{
	//		yes=false;
	//		return "fail";
	//	}

		return "sucess";
	}

}
