package com.weibao.GongqijuAction;

public class XuanZhongAction extends GqjBaseAction{
	
	 
	
	private Integer[]gqjs;
	public String execute() throws Exception {
		
		System.out.println("������ѡ��dao��----");
		 
		gqjdao.XuanZhong(gqjs);
		System.out.println("ѡ����---");
		return "sucess";
	}
	public Integer[] getGqjs() {
		return gqjs;
	}
	public void setGqjs(Integer[] gqjs) {
		this.gqjs = gqjs;
	}

	 
	
}
