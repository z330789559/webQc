package com.weibao.YgXxAction;

;

public class AddYgAction extends YgBaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 10000L;

	public String execute() throws Exception {
		
		System.out.println("����YgDao��--"+ygdao);
		 
		return "sucess";
	}
	 
}
