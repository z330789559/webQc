package com.weibao.entity;
import java.io.Serializable;

public class Gongqiju implements Serializable{
	
	
	/*
	 * 
	 * 
	 * վ�ڹ����ߵ�������Ϣ��
	 * 
	 * */
	
	
	private static final long  serialVersionUID=2L;
	
	private long id;// �Զ����ɵ�id.nextval ���кţ�
	private String station;  // վ��
	private String toolName;// ����������
	private String toolStyleNo;// �������ͺ�
	private String toolCardDate;// �����ߵĺϸ�֤����
	private String lendDate;// �������ͼ�����
	private String comeDate;// �����߽�վ����
	private String toolPerson;//�����߽�����
	private String toolStyle;// ������Ŀǰ״̬
	private String toolShima;// �������Ƿ�У����
	private String tooldesc;// ����������
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
