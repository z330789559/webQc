package com.weibao.GongqijuAction;

import com.weibao.entity.Gongqiju;

public class GqjUpdateAction extends GqjBaseAction{

	 
	
	private Gongqiju gqj;
    public String GqjUpdate() throws Exception {
    	System.out.println("������updateAction----");
    	
    	gqjdao.update(gqj);
    	
    	System.out.println("���³ɹ���----"+gqj);
    	 
    	return "sucess";
    }
	public Gongqiju getGqj() {
		return gqj;
	}
	public void setGqj(Gongqiju gqj) {
		this.gqj = gqj;
	} 	

}
