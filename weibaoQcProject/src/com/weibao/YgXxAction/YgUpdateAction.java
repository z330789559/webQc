package com.weibao.YgXxAction;

import com.weibao.entity.Gongqiju;
import com.weibao.entity.YuangongXinxi;

public class YgUpdateAction extends YgBaseAction{

	 
	
	private YuangongXinxi ygxx;
    public String YgUpdate() throws Exception {
    	System.out.println("������updateAction----");
    	
    	ygdao.update(ygxx);
    	
    	System.out.println("���³ɹ���----"+ygxx);
    	 
    	return "sucess";
    }
	public YuangongXinxi getYgxx() {
		return ygxx;
	}
	public void setYgxx(YuangongXinxi ygxx) {
		this.ygxx = ygxx;
	}
	 

}
