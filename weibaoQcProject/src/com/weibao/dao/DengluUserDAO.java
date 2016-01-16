package com.weibao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.net.nt.ConnOption;

import sun.dc.pr.PRException;

import com.weibao.entity.DengluUser;
import com.weibao.util.DButil;

public class DengluUserDAO {
	
	private static String  ZENGJIA="insert into t_DlUser" +
	"(user_id,userName,telephone,ruzhiDate,userEmail,xueLi,userTeam,password,genarl)" +
	"values(user_id.nextval,?,?,?,?,?,?,?,?)";
	private static String CHAXUN="select * from t_DlUser";
	private static  String SHANCHU="delete from t_DlUser where user_id=?";
	private static String  GAI="update t_DlUser set userName=?,telephone=?," +
	"ruzhiDate=?userEmail=?,xueLi=?userTeam=?,password=?," +
	"genarl=?where user_id=?";
	private static String CHA="select * from t_DlUser where user_id=?";
	 private static String CHAXUNMING="select * from t_DlUser where userName=?";
	
	public List<DengluUser>findAll(){
		
		//CHAXUN="select * from t_DlUser";
		List<DengluUser>dlUser=new ArrayList<DengluUser>();
		Connection conn=null;
		 
			try {
				conn=DButil.openConnection();
				PreparedStatement prep=conn.prepareStatement(CHAXUN);
				
				ResultSet rst=prep.executeQuery();
				DengluUser user=null;
				while(rst.next()){
					user=new DengluUser();
					user.setUser_id(rst.getLong("user_id"));
					user.setUserName(rst.getString("userName"));
					user.setTelephone(rst.getString("telephone"));
					user.setRuzhiDate(rst.getString("ruzhiDate"));
					user.setUserEmail(rst.getString("userEmail"));
					user.setXueLi(rst.getString("xueLi"));
					user.setUserTeam(rst.getString("userTeam"));
					user.setPassword(rst.getString("password"));
					user.setGenarl(rst.getString("genarl"));
					
					dlUser.add(user);
					
				}
								
			} catch (Exception e) {
				
				e.printStackTrace();
	
		} 
	    DButil.closeConnection(conn);
		return dlUser;

	}
	 public void save(DengluUser user) throws SQLException{
		 /*
		  * ZENGJIA="insert into t_DlUser" +
	     "(user_id,userName,telephone,ruzhiDate,userEmail,xueLi,userTeam,password,genarl)" +
	     "values(user_id.nextval,?,?,?,?,?,?,?,?)";
		  * 
		  * */
		 
		 Connection conn=null;
		 try {
			     conn=DButil.openConnection();
			     PreparedStatement prep=conn.prepareStatement(ZENGJIA);
			     System.out.println("hello计入dao le --");
			     prep.setString(1, user.getUserName());
			     System.out.println("用户名字为----："+user.getUserName());
			     prep.setString(2, user.getTelephone());
			     prep.setString(3, user.getRuzhiDate());
			     prep.setString(4, user.getUserEmail());
			     prep.setString(5, user.getXueLi());
			     prep.setString(6, user.getUserTeam());
			     prep.setString(7, user.getPassword());
			     prep.setString(8, user.getGenarl());
			     prep.executeUpdate();
			System.out.println("进入dao了----");
		} catch (Exception e) {
			 conn.rollback();
			e.printStackTrace();
		}
		 DButil.closeConnection(conn);	 
		 
	 }
	 public void delete(long user_id){
		 
		 //SHANCHU="delete from t_DlUser where user_id=?";
		 Connection conn=null;
		 try {
			conn=DButil.openConnection();
			conn.setAutoCommit(false);
			PreparedStatement prep=conn.prepareStatement(SHANCHU);
			System.out.println("进入daolea ----");
			prep.setLong(1, user_id);
			System.out.println("user_id"+user_id);
			prep.executeUpdate();
			System.out.println("删除了:"+prep.executeUpdate());
			conn.commit();
			
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		 
		 DButil.closeConnection(conn);

	 }
	 
	 public DengluUser userUpdate(DengluUser user) throws SQLException{
		
		 /****
		  * 
		  * GAI="update t_DlUser set userName=?,telephone=?," +
			"ruzhiDate=?userEmail=?,xueLi=?userTeam=?,password=?," +
			"genarl=?where user_id=?";
		   
		  */
		 
		 Connection conn=null;
		 try {
			conn=DButil.openConnection();
			PreparedStatement prep=
				              conn.prepareStatement(GAI);
		    
		     prep.setString(1, user.getUserName());
		     prep.setString(2, user.getTelephone());
		     prep.setString(3, user.getRuzhiDate());
		     prep.setString(4, user.getUserEmail());
		     prep.setString(5, user.getXueLi());
		     prep.setString(6,user.getUserTeam());
		     prep.setString(7, user.getPassword());
		     prep.setString(8, user.getGenarl());
		     prep.setLong(9, user.getUser_id());
		     prep.executeUpdate(); 
			
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} 
		  DButil.closeConnection(conn);
		 return user;
		 
	 }
	 public DengluUser findById(long id){
		 //  CHA="select * from t_DlUser where user_id=?";
		 Connection conn=null;
		 
		 DengluUser user=null;
		 try {
			conn=DButil.openConnection();
			PreparedStatement prep=
				                  conn.prepareStatement(CHA);
			prep.setLong(1, id);
			ResultSet rst=prep.executeQuery();
			
			while(rst.next()){
				user=new DengluUser();
				user.setUserName(rst.getString("userName"));
				user.setTelephone(rst.getString("telephone"));
				user.setRuzhiDate(rst.getString("ruzhiDate"));
				user.setUserEmail(rst.getString("userEmail"));
				user.setXueLi(rst.getString("xueLi"));
				user.setUserTeam(rst.getString("userTeam"));
				user.setPassword(rst.getString("password"));
				user.setGenarl(rst.getString("genarl"));

			}
			
		} catch (Exception e) {
			// 查询后返回结果
			e.printStackTrace();
		}
		DButil.closeConnection(conn);
		return user; 
	 }
	 public void XuanZhong(Integer[] users) throws SQLException{
		 //CHA="select * from t_DlUser where user_id=?";
		 Connection conn=null;
		 try {
			 System.out.println("进入daole ----");
			conn=DButil.openConnection();
			conn.setAutoCommit(false);
			PreparedStatement prep=
				                 conn.prepareStatement(CHA);
			
			for(int user_id:users){
				prep.setLong(1, user_id);
				prep.addBatch();	
			}
			conn.commit();
			DButil.closeConnection(conn);
		} catch (Exception e) {
			 conn.rollback();
			e.printStackTrace();
		}
		 
	 }
	 public List<DengluUser>  findByusername(String userName) {
		 
		 Connection conn=null;
	    List<DengluUser> users=new ArrayList<DengluUser>();
		try {
			 conn=DButil.openConnection();
			PreparedStatement prep=conn.prepareStatement(CHAXUNMING);
			prep.setString(1, userName);
			 
			ResultSet rst=prep.executeQuery();
			
			
			while(rst.next()){
				 DengluUser user=new DengluUser();
		System.out.println("进了daole ----");
				user.setUser_id(rst.getLong("user_id"));
				user.setUserName(rst.getString("userName"));
				System.out.println("用户名为："+userName);
				user.setTelephone(rst.getString("telephone"));
				user.setRuzhiDate(rst.getString("ruzhiDate"));
				user.setUserEmail(rst.getString("userEmail"));
				user.setXueLi(rst.getString("xueLi"));
				user.setUserTeam(rst.getString("userTeam"));
				user.setPassword(rst.getString("password"));
				user.setGenarl(rst.getString("genarl"));
				users.add(user);
			}
		} catch (Exception e) {
		 
			e.printStackTrace();
		}
		 
		return users;
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
