package com.weibao.entity;
import java.io.Serializable;

public class Gongqiju implements Serializable{
	
	
	/*
	 * 
	 * 
	 * 站内工器具的配置信息；
	 * 
	 * */
	
	
	private static final long  serialVersionUID=2L;
	
	private long id;// 自动生成的id.nextval 序列号；
	private String station;  // 站名
	private String toolName;// 工器具名称
	private String toolStyleNo;// 工器具型号
	private String toolCardDate;// 工器具的合格证日期
	private String lendDate;// 工器具送检日期
	private String comeDate;// 工器具进站日期
	private String toolPerson;//工器具接收人
	private String toolStyle;// 工器具目前状态
	private String toolShima;// 工器具是否校验了
	private String tooldesc;// 工器具描述
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	public String getToolName() {
		return toolName;
	}
	public void setToolName(String toolName) {
		this.toolName = toolName;
	}
	public String getToolStyleNo() {
		return toolStyleNo;
	}
	public void setToolStyleNo(String toolStyleNo) {
		this.toolStyleNo = toolStyleNo;
	}
	public String getToolCardDate() {
		return toolCardDate;
	}
	public void setToolCardDate(String toolCardDate) {
		this.toolCardDate = toolCardDate;
	}
	public String getLendDate() {
		return lendDate;
	}
	public void setLendDate(String lendDate) {
		this.lendDate = lendDate;
	}
	public String getComeDate() {
		return comeDate;
	}
	public void setComeDate(String comeDate) {
		this.comeDate = comeDate;
	}
	public String getToolPerson() {
		return toolPerson;
	}
	public void setToolPerson(String toolPerson) {
		this.toolPerson = toolPerson;
	}
	public String getToolStyle() {
		return toolStyle;
	}
	public void setToolStyle(String toolStyle) {
		this.toolStyle = toolStyle;
	}
	public String getToolShima() {
		return toolShima;
	}
	public void setToolShima(String toolShima) {
		this.toolShima = toolShima;
	}
	public String getTooldesc() {
		return tooldesc;
	}
	public void setTooldesc(String tooldesc) {
		this.tooldesc = tooldesc;
	}
	 
		
	

}
