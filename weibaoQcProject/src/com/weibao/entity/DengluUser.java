package com.weibao.entity;

import java.io.Serializable;

public class DengluUser implements Serializable{
	
	private static final long  serialVersionUID=1L;
	
	/*
	 * ע�������û���Ϣ
	 * 
	 * */
	
	
	 private long user_id;    // ��½�û���id
	 private String userName;  //  ��½�û�������
	 private String telephone; //  ��½�û��ĵ绰
	 private String ruzhiDate;  //  ��½�û�����ְ����
	 private String userEmail;  //  ��½�û�������
	 private String xueLi;  //  ��½�û���ѧ��
	 private String userTeam;  //  ��½�û��Ĺ�������
	 
	 private String password;  //   ��½�û�����������
	 private String genarl;  // ��½�û����Ա�
	 
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
