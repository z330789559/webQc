package com.weibao.UpLoad;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.faces.application.Application;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.weibao.entity.ChaKanFile;

public class DownAndShow extends BaseAction  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  List<ChaKanFile> chaKanFiles;
	private String fileName;
	private String realName;
    public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getFileRealName() {
		return fileRealName;
	}

	public void setFileRealName(String fileRealName) {
		this.fileRealName = fileRealName;
	}

	private String mimeType; 
    private String inputName;
    private String fileRealName;
    public String getInputName() {
		return "downloadFile";
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public String getMimeType() {  
        return mimeType;  
    }  
  
public String getFileName() throws Exception {
	String localfileName=new String(this.fileName.getBytes(), "ISO-8859-1");
		return localfileName;
	}
	public void setFileName() {
		// �õ��������ص��ļ���
		String fname = ServletActionContext.getRequest().getParameter("name");
		
		try
		{
		/*
		 * ��fname��������UTF-8����,ע��:ʵ�ʽ���UTF-8����ʱ��ʹ�ñ��ر��룬����ΪGBK��
		 * ����ʹ��request.setCharacterEncoding������Ч.
		 * ֻ�н�����getDownloadFile()��������������Ŀ¼����ȷ�ҵ�������ļ�
		 */
		fname = new String(fname.getBytes("ISO-8859-1"), "UTF-8");
	       
		} catch (Exception e)
		{
		e.printStackTrace();
		}
		
		this.fileName = fname;
		
	}
public List<ChaKanFile> getChaKanFiles() {
		return chaKanFiles;
	}
	public void setChaKanFiles(List<ChaKanFile> chaKanFiles) {
		this.chaKanFiles = chaKanFiles;
	}
	public String execute() throws Exception {
		System.out.println("jinru");
		this.setFileName();
		mimeType = appliction.getMimeType(fileName);  

		return "success";
		
	}
	
public String downLoad() throws Exception {
	
		   chaKanFiles= cfd.findAll();
		   
		return "success";
		
	}

public InputStream getDownloadFile() throws Exception {
	
	  System.out.println(this.getFileName());
	  File file = new File(this.getFileName());
	  this.fileRealName=file.getName();
	  InputStream is = new FileInputStream(file);
	 
	  return is; 
	  

	
}

}
