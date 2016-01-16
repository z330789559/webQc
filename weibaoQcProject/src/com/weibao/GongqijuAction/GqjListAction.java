package com.weibao.GongqijuAction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.weibao.entity.Gongqiju;

public class GqjListAction extends ZengjiaAction{
	
	 private  List<Gongqiju>gqjList;
	public String execute() throws Exception {
		
		gqjList=gqjdao.findAll();
	/*	for(int i=0;i<gqjList.size();i++){
			Gongqiju gqj=gqjList.get(i);
			
			Date date=new Date();
			String str=gqj.getToolCardDate();
			DateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
			Date s1=fmt.parse(str);
			long s2=s1.getTime();
			String date1=fmt.format(date);
			long d1=date.getTime();
			long c = s2 - d1;
			if ((date1.equals(str)) || (c < 172800000L)) {
				request.setAttribute("date_error" + gqj.getId(), "表计过期了");
			}
			 request.setAttribute("gqjList", gqjList);
		}
		
		request.getRequestDispatcher("biaoji_list.jsp").forward(request, response);*/
		return "sucess";
	}
	
	
	public List<Gongqiju> getGqjList() {
		return gqjList;
	}
	public void setGqjList(List<Gongqiju> gqjList) {
		this.gqjList = gqjList;
	}
	
	

}
