package com.weibao.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

 

import com.opensymphony.xwork2.ActionContext;

public class GqjCart {

	
	public static GqjCart getInstance(){
		Map<String, Object>session=ActionContext.getContext().getSession();
		GqjCart cart=(GqjCart)session.get("GqjCart");
		if(cart==null){
		  cart=new GqjCart();
		  session.put("cart", cart);
		}
		
		
		return cart;
		
	}
	
	List<GqjCartItem>items=new ArrayList<GqjCartItem>();
	
	public boolean add(GqjCartItem item){
		for(int i=0; i<items.size();i++){
			GqjCartItem curr=items.get(i);
			if(curr.getGqj().getId()==item.getGqj().getId()){
				return false;
				
			}
			
		}
		items.add(item);
		return true;
	}
   public List<GqjCartItem>list(){
	   return items;
	   
   }
   public List<GqjCartItem>delete(long id){
	   for(int i=0;i<items.size();i++){
		   GqjCartItem curr=items.get(i);
		   if(curr.getGqj().getId()==id){
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
		   GqjCartItem curr=items.get(i);
		   total+=curr.getGqjty();
	   }
	return total;
	   
   }
   public List<GqjCartItem>rollback(long id){
	   
	   for(int i=0;i<items.size();i++){
		   GqjCartItem curr=items.remove(i);
		   if(curr.getGqj().getId()==id){
			   items.add(curr);
   
		   }
	   }
	return null;
	   
   }
   
   public List<GqjCartItem>look(long id){
	   for(int i=0;i<items.size();i++){
		  GqjCartItem curr=items.get(i);
		  if(curr.getGqj().getId()==id){
			  items.get(i).getGqj();
		  }
	   }
	   
	return null;
	   
   }
   
   
   
   
   
   
}
