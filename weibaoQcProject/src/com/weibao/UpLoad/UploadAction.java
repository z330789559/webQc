package com.weibao.UpLoad;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.SessionAware;

import com.weibao.entity.ChaKanFile;
import com.weibao.entity.DengluUser;

public class UploadAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 实现文件上传功能

	private File some;
	private String someFileName;
	private String subject;
	private String descript;

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	private String mark;

	public String execute() throws Exception {
		ChaKanFile ckf = new ChaKanFile();
		System.out.println(some);
		System.out.println(someFileName);

		HttpSession session = request.getSession(true);
		Object user = session.getAttribute("user");
		if (null == user) {
			return "login";
		}
		DengluUser u = (DengluUser) user;
		// String path=getRealPath("d://upload");
		Date date = new Date();
		File fileDir = new File("d://upload//" + date.getYear()
				+ date.getMonth() + date.getDate());
		fileDir.mkdir();
		File dest = new File(fileDir, someFileName);
		dest.createNewFile();
		BufferedInputStream is = new BufferedInputStream(new FileInputStream(
				some));
		BufferedOutputStream os = new BufferedOutputStream(
				new FileOutputStream(dest));

		int b = -1;
		while ((b = is.read()) != -1) {
			os.write(b);
		}

		is.close();
		os.close();
		ckf.setFileName(dest.getAbsolutePath());
		ckf.setBeizhu(mark);
		ckf.setDescript(descript);
		ckf.setUser_id(u.getUser_id());
		ckf.setTheme(subject);
		cfd.save(ckf);
		return "success";
	}

	public File getSome() {
		return some;
	}

	public void setSome(File some) {
		this.some = some;
	}

	public String getSomeFileName() {
		return someFileName;
	}

	public void setSomeFileName(String someFileName) {
		this.someFileName = someFileName;
	}

}
