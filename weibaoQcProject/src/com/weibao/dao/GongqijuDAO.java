package com.weibao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.weibao.entity.Gongqiju;
import com.weibao.util.DButil;

public class GongqijuDAO {
	
	private static String  ZENGJIA="insert into t_Gongqiju" +
			"(id,station,toolName,toolStyleNo,toolCardDate,lendDate,comeDate,toolPerson,toolStyle,toolShima,tooldesc)" +
			"values(id.nextval,?,?,?,?,?,?,?,?,?,?)";
	private static String CHAXUN="select * from t_Gongqiju";
	private static  String SHANCHU="delete from t_Gongqiju where id=?";
	private static String  GAI="update t_Gongqiju set station=?,toolName=?," +
			"toolStyleNo=?,toolCardDate=?,lendDate=?,comeDate=?,toolPerson=?," +
			"toolStyle=?,toolShima=?,tooldesc=?where id=?";
	private static String CHA="select * from t_Gongqiju where id=?";
	
	// 后加分页的功能：
	private static String Fenye="";
	
	
	 public List<Gongqiju> findAll() throws Exception{
		 /*
		  *  CHAXUN="select * from t_Gongqiju"
		  * */
		 Connection conn=DButil.openConnection();
		 List<Gongqiju>gongqiju=new ArrayList<Gongqiju>();
		 PreparedStatement prep=conn.prepareStatement(CHAXUN);
		 ResultSet rst=prep.executeQuery();
		 Gongqiju gqj=null;
		 while(rst.next()){
			 gqj=new Gongqiju();
			 gqj.setId(rst.getLong("id"));
			 gqj.setStation(rst.getString("station"));
			 gqj.setToolName(rst.getString("toolName"));
			 gqj.setToolStyleNo(rst.getString("toolStyleNo"));
			 gqj.setToolCardDate(rst.getString("toolCardDate"));
			 gqj.setLendDate(rst.getString("lendDate"));
			 gqj.setComeDate(rst.getString("comeDate"));
			 gqj.setToolPerson(rst.getString("toolPerson"));
			 gqj.setToolStyle(rst.getString("toolStyle"));
			 gqj.setToolShima(rst.getString("toolShima"));
			 gqj.setTooldesc(rst.getString("tooldesc"));
			 
			 gongqiju.add(gqj);		 
		 }
		 DButil.closeConnection(conn);
		return gongqiju;		 	 
	 }
	 public void save(Gongqiju gqj) throws Exception{
		 
		 /*
		  * ZENGJIA="insert into t_Gongqiju" +
			"(id,station,toolName,toolStyleNo,toolCardDate,lendDate,comeDate,toolPerson,toolStyle,toolShima,tooldesc)" +
			"values(id.nextval,?,?,?,?,?,?,?,?,?,?)";
		  * 
		  * */
		 Connection conn=DButil.openConnection();
		 PreparedStatement prep=conn.prepareStatement(ZENGJIA);
		 prep.setString(1, gqj.getStation());
		 System.out.println("station--:"+gqj.getStation());
		 prep.setString(2, gqj.getToolName());
		 prep.setString(3, gqj.getToolStyleNo());
		 prep.setString(4, gqj.getToolCardDate());
		 prep.setString(5, gqj.getLendDate());
		 prep.setString(6, gqj.getComeDate());
		 prep.setString(7, gqj.getToolPerson());
		 prep.setString(8, gqj.getToolStyle());
		 prep.setString(9, gqj.getToolShima());
		 prep.setString(10, gqj.getTooldesc());
		 System.out.println("描述："+gqj.getTooldesc());
		 
		 prep.executeUpdate();
	
		
		 DButil.closeConnection(conn);

	 }
	 public void delet(long id){
		 
		 //SHANCHU="delete from t_Gongqiju where id=?";
		 
		Connection conn=null;
		try {
			conn= DButil.openConnection();
			conn.setAutoCommit(false);
			System.out.println("你好进入daole===");
			PreparedStatement prep= conn.prepareStatement(SHANCHU);
		    prep.setLong(1, id);
			prep.executeUpdate();
			conn.commit();
			
		} catch (Exception e) {			 
				
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// 捕捉异常后退回
				e1.printStackTrace();
			} finally{
				DButil.closeConnection(conn);
			}
		}	 
	 }
	 public void update(Gongqiju gqj){
		 /*
		  * GAI="update t_Gongqiju set station=?,toolName=?," +
			"toolStyleNo=?toolCardDate=?,lendDate=?comeDate=?,toolPerson=?," +
			"toolStyle=?,toolShima=?,tooldesc=?where id=?";
		 
		  * */ 
		 Connection conn=null;
		 
		 try {
			 conn=DButil.openConnection();
			 PreparedStatement prep=conn.prepareStatement(GAI);
			prep.setString(1, gqj.getStation());
			prep.setString(2, gqj.getToolName());
			prep.setString(3, gqj.getToolStyleNo());
			prep.setString(4, gqj.getToolCardDate());
			prep.setString(5, gqj.getLendDate());
			prep.setString(6, gqj.getComeDate());
			prep.setString(7, gqj.getToolPerson());
			prep.setString(8, gqj.getToolStyle());
			prep.setString(9, gqj.getToolShima());
			prep.setString(10, gqj.getTooldesc());
			prep.setLong(11, gqj.getId());
			System.out.println("工器具的Id"+gqj.getId());
			prep.executeUpdate();
			System.out.println("工器具的更新值"+prep.executeUpdate());
			
			DButil.closeConnection(conn);
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		 
		 
	 }
	 public Gongqiju findById(long id) throws Exception{
		 // CHA="select * from t_Gongqiju where id=?";
		 
		 Gongqiju gqj=null;
		 Connection conn=DButil.openConnection();
		 
		 PreparedStatement prep=conn.prepareStatement(CHA);
		 prep.setLong(1, id);
		 ResultSet rst=prep.executeQuery();
		 while(rst.next()){
			gqj=new Gongqiju();
			gqj.setId(rst.getLong("id"));
			gqj.setStation(rst.getString("station"));
			gqj.setToolName(rst.getString("toolName"));
			gqj.setToolStyleNo(rst.getString("toolStyleNo"));
			gqj.setToolCardDate(rst.getString("toolCardDate"));
			gqj.setLendDate(rst.getString("lendDate"));
			gqj.setComeDate(rst.getString("comeDate"));
			gqj.setToolPerson(rst.getString("toolPerson"));
			gqj.setToolStyle(rst.getString("toolStyle"));
			gqj.setToolShima(rst.getString("toolShima"));
			gqj.setTooldesc(rst.getString("tooldesc"));
			
		 }
	
		 
		return gqj;
		 
	 }
	 
	 public void XuanZhong(Integer[]gqjs) throws SQLException{
		 
		 //SHANCHU="delete from t_Gongqiju where id=?";
		 
		 Connection  conn=null;
		 try {
			conn=DButil.openConnection();
			conn.setAutoCommit(false);
			PreparedStatement prep=conn.prepareStatement(SHANCHU);
			
			System.out.println("执行了啊--- 删除功能");
			for(long id:gqjs){
				prep.setLong(1, id);
				prep.addBatch();
				
			}
			prep.executeBatch();
			conn.commit();

			
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		}
		 
	 }
	public List<Gongqiju> findByList(List<Long> list) throws Exception {
		// TODO Auto-generated method stub
		 List<Gongqiju> gqjs=new ArrayList<Gongqiju>();
		 for(long id:list){
			 gqjs.add( this.findById(id));
		 }
		return gqjs;
	}
	 
	

}
