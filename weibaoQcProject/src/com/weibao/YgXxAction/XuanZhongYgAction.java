package com.weibao.YgXxAction;

public class XuanZhongYgAction extends YgBaseAction {
	
	 
	
	private Integer[]ygs;
	public String execute() throws Exception {
		
		System.out.println("������ѡ��dao��----");
		 
		ygdao.XuanZhong(ygs);
		System.out.println("ѡ����---");
		return "sucess";
	}
	public Integer[] getYgs() {
		return ygs;
	}
	public void setYgs(Integer[] ygs) {
		this.ygs = ygs;
	}
	 

	 
	
}
