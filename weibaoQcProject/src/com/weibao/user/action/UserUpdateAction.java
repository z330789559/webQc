package com.weibao.user.action;

import com.weibao.entity.DengluUser;

public class UserUpdateAction extends UserBaseAction{

	
	   private DengluUser u;
	
	public String execute() throws Exception {
		
		  
		udao.userUpdate(u);
		
		
		return super.execute();
	}

	public DengluUser getU() {
		return u;
	}

	public void setU(DengluUser u) {
		this.u = u;
	}

	
}
