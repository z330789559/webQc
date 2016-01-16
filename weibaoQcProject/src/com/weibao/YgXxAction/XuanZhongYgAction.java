package com.weibao.YgXxAction;

public class XuanZhongYgAction extends YgBaseAction {
	
	 
	
	private Integer[]ygs;
	public String execute() throws Exception {
		
		System.out.println("进入了选中dao了----");
		 
		ygdao.XuanZhong(ygs);
		System.out.println("选中了---");
		return "sucess";
	}
	public Integer[] getYgs() {
		return ygs;
	}
	public void setYgs(Integer[] ygs) {
		this.ygs = ygs;
	}
	 

	 
	
}
