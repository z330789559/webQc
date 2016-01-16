package com.weibao.GongqijuAction;

import com.weibao.entity.Gongqiju;

public class GqjDtailAction extends GqjBaseAction{

	 
	  private long id;
	  private Gongqiju gqj;
 	
	
	public String updateDetail() throws Exception {
		
		
		
		gqj=gqjdao.findById(id);
	 
		return "sucess";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Gongqiju getGqj() {
		return gqj;
	}


	public void setGqj(Gongqiju gqj) {
		this.gqj = gqj;
	}
	
	
	
}
