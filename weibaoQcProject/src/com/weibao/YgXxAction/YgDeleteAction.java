package com.weibao.YgXxAction;

import com.weibao.dao.GongqijuDAO;
import com.weibao.dao.YuangongXinxiDAO;
import com.weibao.user.action.UserBaseAction;

public class YgDeleteAction extends YgBaseAction{
	
	private long yg_id;

	YuangongXinxiDAO ygdao=new YuangongXinxiDAO();
	 public  String deleteRow() {
		 
		 ygdao.delete(yg_id);
		 
		 System.out.println("进入了gqj了---");
		 // 对应的ID上传错误，不执行action-----
		return "sucess";
		 
	}
	public long getYg_id() {
		return yg_id;
	}
	public void setYg_id(long ygId) {
		yg_id = ygId;
	}

	 
	 
}
