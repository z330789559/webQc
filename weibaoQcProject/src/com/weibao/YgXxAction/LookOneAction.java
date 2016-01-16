package com.weibao.YgXxAction;

import com.weibao.entity.Gongqiju;
import com.weibao.entity.YuangongXinxi;

public class LookOneAction  extends YgBaseAction{
	
	private long yg_id;
	private YuangongXinxi ygxx;
	
	public String execute() throws Exception {
		ygxx=ygdao.findById(yg_id);
		 System.out.println("h哈哈"+ygxx);
		 
		 // 对应的id 上传错误了---
		return super.execute();
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
