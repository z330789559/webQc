package com.weibao.GongqijuAction;

import com.weibao.entity.Gongqiju;

public class LookOneAction  extends GqjBaseAction{
	
	private long id;
	private Gongqiju gqj;
	
	public String execute() throws Exception {
		gqj=gqjdao.findById(id);
		 System.out.println("h哈哈"+gqj);
		 
		 // 对应的id 上传错误了---
		return super.execute();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Gongqiju getGqj() {
		return gqj;
	}

	public void setGqj(Gongqiju gqj) {
		this.gqj = gqj;
	}


}
