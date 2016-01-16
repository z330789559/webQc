package com.weibao.YgXxAction;


import com.weibao.entity.YuangongXinxi;


public class ZengjiaYgAction extends YgBaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 11111L;
	private YuangongXinxi yg;
 
	public String execute() throws Exception {
		
		ygdao.save(yg);
		
		System.out.println("Ô±¹¤ÐÕÃû£º"+yg);

		return "sucess" ;
		 
	 
	}

	public YuangongXinxi getYg() {
		return yg;
	}

	public void setYg(YuangongXinxi yg) {
		this.yg = yg;
	}

}
