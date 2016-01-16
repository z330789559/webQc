
package com.weibao.bean.action;
import javax.servlet.http.HttpSession;
import com.weibao.bean.YgCart;
import com.weibao.bean.YgCartItem;
import com.weibao.dao.YuangongXinxiDAO;
import com.weibao.entity.YuangongXinxi;
import com.weibao.user.action.UserBaseAction;

public class YgCartAction extends UserBaseAction{

	
		
		long yg_id=Integer.parseInt(request.getParameter("yg_id"));
		YuangongXinxiDAO ygdao=new YuangongXinxiDAO();
	// add �����ǰ���servelet д��--- action��û�б���
		// ����item
		public String add(){
			try {
				YuangongXinxi ygxx=ygdao.findById(yg_id);
				YgCartItem item = new YgCartItem();
				item.setYgxx(ygxx);
				item.setYgty(1);
				 HttpSession session = request.getSession();
				 YgCart cart=(YgCart)session.getAttribute("YgCart");
				 if(cart==null){
				   cart=new YgCart();
				   session.setAttribute("cart", cart);
				   boolean flag=cart.add(item);
				   if(!flag){
					   request.setAttribute("buy_error" + yg_id, "�������������");
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
			 YgCart cart = (YgCart)session.getAttribute("cart");
			 cart.clear();
			return "sucess";
			
		}
		// ɾ��item
		public  String delete(){
			
			long id = Long.parseLong(request.getParameter("id"));
			HttpSession session = request.getSession();
			 YgCart cart = (YgCart)session.getAttribute("cart");
			 cart.delete(id);
			 session.setAttribute("cart", cart);
			 
			 return "sucess";

			
		}
		// �ָ�����
		public String rollback(){
			 long yg_id = Integer.parseInt(request.getParameter("yg_id"));
			 try {
				YuangongXinxi ygxx=ygdao.findById(yg_id);
				YgCartItem item = new YgCartItem();
				 item.setYgxx(ygxx);
				 item.setYgty(1);
				 
				 HttpSession session = request.getSession();
				 YgCart cart=(YgCart)session.getAttribute("cart");
				 if(cart==null){
					 cart=new YgCart();
					 session.setAttribute("cart", cart);
					
				 }
				 boolean flag = cart.add(item);
				 if(!flag){
					 request.setAttribute("buy_error" + yg_id, "�������ѻָ���");
					 
				 }
			 } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "sucess";
			 
		}
	}



