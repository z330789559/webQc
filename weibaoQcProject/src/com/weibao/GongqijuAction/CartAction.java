package com.weibao.GongqijuAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.weibao.entity.Gongqiju;

public class CartAction extends GqjBaseAction{
	 private  List<Gongqiju>gqjList;
 public List<Gongqiju> getGqjList() {
		return gqjList;
	}
	public void setGqjList(List<Gongqiju> gqjList) {
		this.gqjList = gqjList;
	}
private Long id;
	public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
	public String addCart() throws Exception {
	  	  HttpSession session = request.getSession(true);
	  	  List<Long> list=new ArrayList<Long>();
	  	 Object ids = session.getAttribute("ids");
	  	 if(ids!=null){
	  		list=(List<Long>)ids;
	  		if(list.contains(this.id)){
	  			return "double";
	  		}else{
	  			list.add(this.id);
	  			 session.setAttribute("ids", list);
	  		}
	  	 }else{
	  		list.add(this.id);
 			 session.setAttribute("ids", list);
	  		 
	  	 }
	
    	
		return "sucess";
	}

	public String goOverperiod() throws Exception{
	  	  HttpSession session = request.getSession(true);
		 Object ids = session.getAttribute("ids");
	  	  List<Long> list=new ArrayList<Long>();
		 if(ids!=null){
		  		list=(List<Long>)ids;
		  	  	gqjList=gqjdao.findByList(list);
		        return "success";
		 }else{
			 return "fail";
		 }
 
	}
}
