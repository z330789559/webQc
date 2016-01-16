package com.weibao.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class YgCart {
	
	public static YgCart getInstance(){
		Map<String, Object>session=ActionContext.getContext().getSession();
		YgCart cart=(YgCart)session.get("YgCart");
		if(cart==null){
		  cart=new YgCart();
		  session.put("cart", cart);
		}
			
		return cart;
		
	}
	
	List<YgCartItem>items=new ArrayList<YgCartItem>();
	
	public boolean add(YgCartItem item){
		for(int i=0; i<items.size();i++){
			YgCartItem curr=items.get(i);
			if(curr.getYgxx().getYg_id()==item.getYgxx().getYg_id()){
				return false;
				
			}
			
		}
		items.add(item);
		return true;
	}
   public List<YgCartItem>list(){
	   return items;
	   
   }
   public List<YgCartItem>delete(long yg_id){
	   for(int i=0;i<items.size();i++){
		   YgCartItem curr=items.get(i);
		   if(curr.getYgxx().getYg_id()==yg_id){
			   items.remove(i);
		   }
	   }
	   
	   
	return items;
	   
   }
   
   public void clear(){
	   items.clear();
	   
   }
   
   public int total(){
	   int total=0;
	   for(int i=0;i<items.size();i++){
		   YgCartItem curr=items.get(i);
		   total+=curr.getYgty();
	   }
	return total;
	   
   }
   public List<YgCartItem>rollback(long yg_id){
	   
	   for(int i=0;i<items.size();i++){
		   YgCartItem curr=items.remove(i);
		   if(curr.getYgxx().getYg_id()==yg_id){
			   items.add(curr);
   
		   }
	   }
	return null;
	   
   }
   
   public List<YgCartItem>look(long yg_id){
	   for(int i=0;i<items.size();i++){
		   YgCartItem curr=items.get(i);
		  if(curr.getYgxx().getYg_id()==yg_id){
			  items.get(i).getYgxx();
		  }
	   }
	   
	return null;
	   
   }

}
