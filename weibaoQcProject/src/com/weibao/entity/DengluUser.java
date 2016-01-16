package com.weibao.entity;

import java.io.Serializable;

public class DengluUser implements Serializable{
	
	private static final long  serialVersionUID=1L;
	
	/*
	 * 注册界面的用户信息
	 * 
	 * */
	
	
	 private long user_id;    // 登陆用户的id
	 private String userName;  //  登陆用户的姓名
	 private String telephone; //  登陆用户的电话
	 private String ruzhiDate;  //  登陆用户的入职日期
	 private String userEmail;  //  登陆用户的邮箱
	 private String xueLi;  //  登陆用户的学历
	 private String userTeam;  //  登陆用户的归属部门
	 
	 private String password;  //   登陆用户的设置密码
	 private String genarl;  // 登陆用户的性别
	 
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long userId) {
		user_id = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRuzhiDate() {
		return ruzhiDate;
	}
	public void setRuzhiDate(String ruzhiDate) {
		this.ruzhiDate = ruzhiDate;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getXueLi() {
		return xueLi;
	}
	public void setXueLi(String xueLi) {
		this.xueLi = xueLi;
	}
	public String getUserTeam() {
		return userTeam;
	}
	public void setUserTeam(String userTeam) {
		this.userTeam = userTeam;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGenarl() {
		return genarl;
	}
	public void setGenarl(String genarl) {
		this.genarl = genarl;
	}

}
