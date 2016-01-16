package com.weibao.user.action;

import java.util.List;


import com.weibao.entity.DengluUser;


public class UserListAction extends UserBaseAction{
	
	
	private  List<DengluUser>userList;
	
	public  String execute() throws Exception{
		
		userList=udao.findAll();
		
		
		return "sucess";
		 
	}

	public List<DengluUser> getUserList() {
		return userList;
	}

	public void setUserList(List<DengluUser> userList) {
		this.userList = userList;
	}
	
	

}
