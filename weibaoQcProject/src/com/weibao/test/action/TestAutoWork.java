package com.weibao.test.action;

import com.opensymphony.xwork2.ActionContext;
import com.weibao.paiban.AutoWork;
import com.weibao.user.action.UserBaseAction;

public class TestAutoWork extends UserBaseAction{
	
	private int num;
	private String station1;
	private String station2;
	private String station3;
	private String station4;
	private String station5;
	private String station6;
	private String station7;
	 
	private String sortResult;
	
	
	public String getSortResult() {
		return sortResult;
	}




	public void setSortResult(String sortResult) {
		this.sortResult = sortResult;
	}




	// 继承的baseAction
	public String execute() throws Exception {

		/*
		 * station 为可变量，故如何实现输入人数自动根据动态的station进行人员分配
		 * 
		 * */
		// 将package com.weibao.paiban.AutoWork 类进行封装
		// 调用之后再对autowork.jsp 进行投送，提交到autoWork.action
		
		 
		return super.execute();
	}
 public String sortWork(){
		String sortResult= 	AutoWork.sortWork(this.num);
	    ActionContext.getContext().getValueStack().set("sortResult", sortResult);
		return "success";  
 }



	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public String getStation1() {
		return station1;
	}




	public void setStation1(String station1) {
		this.station1 = station1;
	}




	public String getStation2() {
		return station2;
	}




	public void setStation2(String station2) {
		this.station2 = station2;
	}




	public String getStation3() {
		return station3;
	}




	public void setStation3(String station3) {
		this.station3 = station3;
	}




	public String getStation4() {
		return station4;
	}




	public void setStation4(String station4) {
		this.station4 = station4;
	}




	public String getStation5() {
		return station5;
	}




	public void setStation5(String station5) {
		this.station5 = station5;
	}




	public String getStation6() {
		return station6;
	}




	public void setStation6(String station6) {
		this.station6 = station6;
	}




	public String getStation7() {
		return station7;
	}




	public void setStation7(String station7) {
		this.station7 = station7;
	}

	
	
}
