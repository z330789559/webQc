package com.weibao.entity;

import java.io.File;
import java.io.Serializable;

public class ChaKanFile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8011256555865157248L;
	private long file_id;
	private long user_id;
	private String theme;
	private String descript;
	private  String beizhu;
	private String fileName;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public long getFile_id() {
		return file_id;
	}
	public void setFile_id(long fileId) {
		file_id = fileId;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long userId) {
		user_id = userId;
	}
	
	

}
