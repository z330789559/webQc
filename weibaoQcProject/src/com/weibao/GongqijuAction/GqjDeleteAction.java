package com.weibao.GongqijuAction;

import com.weibao.dao.GongqijuDAO;
import com.weibao.user.action.UserBaseAction;

public class GqjDeleteAction extends UserBaseAction{
	
	private long id;

	GongqijuDAO gqjdao=new GongqijuDAO();
	 public  String deleteRow() {
		 
		 gqjdao.delet(id);
		 
		 System.out.println("������gqj��---");
		 // ��Ӧ��ID�ϴ����󣬲�ִ��action-----
		return "sucess";
		 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	 
	 
}
