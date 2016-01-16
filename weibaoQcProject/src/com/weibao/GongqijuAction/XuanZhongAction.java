package com.weibao.GongqijuAction;

public class XuanZhongAction extends GqjBaseAction{
	
	 
	
	private Integer[]gqjs;
	public String execute() throws Exception {
		
		System.out.println("进入了选中dao了----");
		 
		gqjdao.XuanZhong(gqjs);
		System.out.println("选中了---");
		return "sucess";
	}
	public Integer[] getGqjs() {
		return gqjs;
	}
	public void setGqjs(Integer[] gqjs) {
		this.gqjs = gqjs;
	}

	 
	
}
