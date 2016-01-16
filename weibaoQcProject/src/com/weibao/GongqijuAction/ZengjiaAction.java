package com.weibao.GongqijuAction;

import com.weibao.entity.Gongqiju;


public class ZengjiaAction extends GqjBaseAction{
	
	private Gongqiju bj;
 
	public String execute() throws Exception {
		
		gqjdao.save(bj);
		
		System.out.println("¹¤Æ÷¾ßÃû×Ö£º"+bj);

		return "sucess" ;
		 
	 
	}

	public Gongqiju getBj() {
		return bj;
	}

	public void setBj(Gongqiju bj) {
		this.bj = bj;
	}
	
	
	

}
