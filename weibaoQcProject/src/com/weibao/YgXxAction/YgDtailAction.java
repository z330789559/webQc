package com.weibao.YgXxAction;

import com.weibao.dao.YuangongXinxiDAO;
import com.weibao.entity.Gongqiju;
import com.weibao.entity.YuangongXinxi;

public class YgDtailAction extends YgBaseAction{

	 
	  private long yg_id;
	  private YuangongXinxi ygxx;
 	
	
	public String updateDetail() throws Exception {
		
		
		
		ygxx=ygdao.findById(yg_id);
	 
		return "sucess";
	}


	public long getYg_id() {
		return yg_id;
	}


	public void setYg_id(long ygId) {
		yg_id = ygId;
	}


	public YuangongXinxi getYgxx() {
		return ygxx;
	}


	public void setYgxx(YuangongXinxi ygxx) {
		this.ygxx = ygxx;
	}

	
}
