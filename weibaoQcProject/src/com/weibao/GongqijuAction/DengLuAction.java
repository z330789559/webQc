package com.weibao.GongqijuAction;

import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpSession;

import com.weibao.dao.DengluUserDAO;
import com.weibao.entity.DengluUser;

import com.weibao.user.action.UserBaseAction;

public  class DengLuAction extends UserBaseAction {

	 private DengluUser u;
	   //  private String imagecode;
	     
	     public DengluUser getU() {
			return u;
		}

		public void setU(DengluUser u) {
			this.u = u;
		}

//	private boolean ok;
//	private DengluUserDAO udao = new DengluUserDAO();
	public String login() throws Exception {
		boolean ok =false;

		System.out.println("½øµ½µÇÂ¼action ÁË----");

  	  DengluUser curuser=new DengluUser();
		List<DengluUser>  users = udao.findByusername(u.getUserName());
      ListIterator<DengluUser> iterator = users.listIterator();
      
      while(iterator.hasNext()){
    	  DengluUser user=(DengluUser)iterator.next();
    		if (user.getUserName().equals(u.getUserName())
					&& user.getPassword().equals(u.getPassword())) {
    			curuser=user;
				ok = true;
			} 
      }
		
      if(ok){
    	  HttpSession session = request.getSession(true);
    	  session.setAttribute("user", curuser);
    		return "sucess"; 
      }else{
    	  return "shibai";
      }
	

	}



}
