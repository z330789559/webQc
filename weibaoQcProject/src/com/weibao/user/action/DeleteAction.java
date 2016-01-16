package com.weibao.user.action;

public class DeleteAction extends UserBaseAction{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long user_id;
	   
	public String execute() throws Exception {
		
		System.out.println("进入到了删除Action----");
		
		udao.delete(user_id);
		System.out.println("users:"+user_id);
		 
		return "sucess";
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long userId) {
		user_id = userId;
	}

	 
	
	

}
