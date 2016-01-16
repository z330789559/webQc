package com.weibao.user.action;

import com.weibao.entity.DengluUser;

public class UserDetailAction extends UserBaseAction{
	
	
	
	private long userId;
	
	private DengluUser u;
	public String execute() throws Exception {
		
		
		u=udao.findById(userId);
	 
		return super.execute();
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public DengluUser getU() {
		return u;
	}
	public void setU(DengluUser u) {
		this.u = u;
	}
	
	
	
	

}
