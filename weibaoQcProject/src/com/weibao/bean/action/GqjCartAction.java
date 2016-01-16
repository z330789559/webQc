package com.weibao.bean.action;

import javax.servlet.http.HttpSession;

import com.weibao.bean.GqjCart;
import com.weibao.bean.GqjCartItem;
import com.weibao.dao.GongqijuDAO;
import com.weibao.entity.Gongqiju;
import com.weibao.user.action.UserBaseAction;
 

public class GqjCartAction extends UserBaseAction{
	
	long id=Integer.parseInt(request.getParameter("id"));
	GongqijuDAO gqjdao=new GongqijuDAO();
// add �����ǰ���servelet д��--- action��û�б���
	// ����item
	public String add(){
		try {
			Gongqiju gqj=gqjdao.findById(id);
			GqjCartItem item = new GqjCartItem();
			item.setGqj(gqj);
			item.setGqjty(1);
			 HttpSession session = request.getSession();
			 GqjCart cart=(GqjCart)session.getAttribute("GqjCart");
			 if(cart==null){
			   cart=new GqjCart();
			   session.setAttribute("cart", cart);
			   boolean flag=cart.add(item);
			   if(!flag){
				   request.setAttribute("buy_error" + id, "�������������");
				//   request.getRequestDispatcher("list.do").forward(request, response);
			   }
			 }
		} catch (Exception e) {
			// ���Ƿ�ѡ�У�ѡ���˾Ͳ���ѡ��--
			e.printStackTrace();
		}	
		return "sucess";
	}
 // ���
	public  String clear(){
		 HttpSession session = request.getSession();
		 GqjCart cart = (GqjCart)session.getAttribute("cart");
		 cart.clear();
		return "sucess";
		
	}
	// ɾ��item
	public  String delete(){
		
		long id = Long.parseLong(request.getParameter("id"));
		HttpSession session = request.getSession();
		 GqjCart cart = (GqjCart)session.getAttribute("cart");
		 cart.delete(id);
		 session.setAttribute("cart", cart);
		 
		 return "sucess";

		
	}
	// �ָ�����
	public String rollback(){
		 long id = Integer.parseInt(request.getParameter("id"));
		 try {
			Gongqiju gqj=gqjdao.findById(id);
			GqjCartItem item = new GqjCartItem();
			 item.setGqj(gqj);
			 item.setGqjty(1);
			 
			 HttpSession session = request.getSession();
			 GqjCart cart=(GqjCart)session.getAttribute("cart");
			 if(cart==null){
				 cart=new GqjCart();
				 session.setAttribute("cart", cart);
				
			 }
			 boolean flag = cart.add(item);
			 if(!flag){
				 request.setAttribute("buy_error" + id, "�������ѻָ���");
				 
			 }
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "sucess";
		 
	}
}
