package com.weibao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.weibao.entity.YuangongXinxi;
import com.weibao.util.DButil;

public class YuangongXinxiDAO {
	
	
	private static String  ZENGJIA="insert into t_ygXinxi" +
	"(yg_id,ygName,ygAge,ygGeneral,ygXueLi,ygSchool,ygTeam,ygMinZu,ygJiguan,ygAddress)" +
	"values(yg_id.nextval,?,?,?,?,?,?,?,?,?)";
    private static String CHAXUN="select * from t_ygXinxi";
    private static  String SHANCHU="delete from t_ygXinxi where yg_id=?";
    private static String  GAI="update t_ygXinxi set ygName=?,ygAge=?," +
	"ygGeneral=?,ygXueLi=?,ygSchool=?,ygTeam=?,ygMinZu=?," +
	"ygJiguan=?,ygAddress=?where yg_id=?";
    private static String CHA="select * from t_ygXinxi where yg_id=?";

    public List<YuangongXinxi>findAll() throws SQLException{
    	//  CHAXUN= "select * from t_ygXinxi"
    	
    	List<YuangongXinxi>YgXx=new ArrayList<YuangongXinxi>();
    	Connection conn=null;
    	
		try {
			conn = DButil.openConnection();
			PreparedStatement prep=conn.prepareStatement(CHAXUN);
			ResultSet rst=prep.executeQuery();
			YuangongXinxi yg=null;
			while(rst.next()){
				yg=new YuangongXinxi();
				yg.setYg_id(rst.getLong("yg_id"));
				yg.setYgName(rst.getString("ygName"));
				yg.setYgAge(rst.getString("ygAge"));
				yg.setYgGeneral(rst.getString("ygGeneral"));
				yg.setYgXueLi(rst.getString("ygXueLi"));
				yg.setYgSchool(rst.getString("ygSchool"));
				yg.setYgTeam(rst.getString("ygTeam"));
				yg.setYgMinZu(rst.getString("ygMinZu"));
				yg.setYgJiguan(rst.getString("ygJiguan"));
				yg.setYgAddress(rst.getString("ygAddress"));
				
				YgXx.add(yg);
				
			}
			
		} catch (Exception e) {
			 conn.rollback();
			e.printStackTrace();
		}
		DButil.closeConnection(conn);
		return YgXx;
    }
    
     public void save(YuangongXinxi yg){
    	 /**
    	  *  ZENGJIA="insert into t_ygXinxi" +
    		"(yg_id,ygName,ygAge,ygGeneral,ygXueLi,ygSchool,ygTeam,ygMinZu,ygJiguan,ygAddress)" +
    		"values(yg_id.nextval,?,?,?,?,?,?,?,?,?)";
    	  * **/
    	 
    	 Connection conn=null;
    	 try {
			conn=DButil.openConnection();
			PreparedStatement prep=conn.prepareStatement(ZENGJIA);
	 
		   prep.setString(1, yg.getYgName());
		   System.out.println("员工的姓名："+yg.getYgName());
		   prep.setString(2, yg.getYgAge());
		   System.out.println("员工的年龄："+yg.getYgAge());
		   prep.setString(3, yg.getYgGeneral());
		   System.out.println("员工的性别："+yg.getYgGeneral());
		   prep.setString(4, yg.getYgXueLi());
		   System.out.println("员工的学历："+yg.getYgXueLi());
		   prep.setString(5, yg.getYgSchool());
		   System.out.println("员工的学校："+yg.getYgSchool());
		   prep.setString(6, yg.getYgTeam());
		   System.out.println("员工的区域："+yg.getYgTeam());
		   prep.setString(7, yg.getYgMinZu());
		   System.out.println("员工的名族："+yg.getYgMinZu());
		   prep.setString(8, yg.getYgJiguan());
		   System.out.println("员工的籍贯："+yg.getYgJiguan());
		   prep.setString(9, yg.getYgAddress());
		   System.out.println("员工的地址----");
		   prep.executeUpdate();
		   System.out.println("更新了吗："+prep.executeUpdate());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 DButil.closeConnection(conn);
    	 
     }
     public void delete(long yg_id){
    	 //SHANCHU="delete from t_ygXinxi where yg_id=?";
    	 
    	 Connection conn=null;
    	 try {
			conn=DButil.openConnection();
			
			conn.setAutoCommit(false);
			PreparedStatement prep=conn.prepareStatement(SHANCHU);
			prep.setLong(1, yg_id);
			prep.executeUpdate();
			conn.commit();
			
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// 否则就返回界面
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

     }
     public void update(YuangongXinxi ygxx){
    	 /***
    	  *  GAI="update t_ygXinxi set ygName=?,ygAge=?," +
	          "ygGeneral=?ygXueLi=?,ygSchool=?ygTeam=?,ygMinZu=?," +
	           "ygJiguan=?,ygAddress=?where yg_id=?";
    	  * 
    	  * 
    	  * **/
    	 Connection conn=null;
    	 try {
			conn=DButil.openConnection();
			PreparedStatement prep=conn.prepareStatement(GAI);
			prep.setString(1, ygxx.getYgName());
			prep.setString(2, ygxx.getYgAge());
			prep.setString(3, ygxx.getYgGeneral());
			prep.setString(4, ygxx.getYgXueLi());
			prep.setString(5, ygxx.getYgSchool());
			prep.setString(6, ygxx.getYgTeam());
			prep.setString(7, ygxx.getYgMinZu());
			prep.setString(8, ygxx.getYgJiguan());
			prep.setString(9, ygxx.getYgAddress());
			prep.setLong(10, ygxx.getYg_id());
            prep.executeUpdate();
            System.out.println("更改了--"+prep.executeUpdate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
     }
     public YuangongXinxi findById(long id) throws Exception{
    	 
    	 //  CHA="select * from t_ygXinxi where yg_id=?";
    	 
    	 Connection conn=null;
    	 conn=DButil.openConnection();
    	 PreparedStatement prep= conn.prepareStatement(CHA);
    	 
    	 prep.setLong(1, id);
    	 ResultSet rst=  prep.executeQuery();
    	 
    	 YuangongXinxi ygxx=null;
    	 while(rst.next()){
    		 
    		 ygxx=new YuangongXinxi();
    		 
    		 ygxx.setYg_id(rst.getLong("yg_id"));
    		 ygxx.setYgName(rst.getString("ygName"));
    		 ygxx.setYgAge(rst.getString("ygAge"));
    		 ygxx.setYgGeneral(rst.getString("ygGeneral"));
    		 ygxx.setYgXueLi(rst.getString("ygXueLi"));
    		 ygxx.setYgSchool(rst.getString("ygSchool"));
    		 ygxx.setYgTeam(rst.getString("ygTeam"));
    		 ygxx.setYgMinZu(rst.getString("ygMinZu"));
    		 ygxx.setYgJiguan(rst.getString("ygJiguan"));
    		 ygxx.setYgAddress(rst.getString("ygAddress"));
    		 
    	 }
    	 
		return ygxx;
    	 
     }
     
     public  void XuanZhong(Integer[]ygxxs){
    	 
    	// SHANCHU="delete from t_ygXinxi where yg_id=?";
    	 
    	 Connection conn=null;
    	 try {
			conn=DButil.openConnection();
			conn.setAutoCommit(false);
			PreparedStatement prep=conn.prepareStatement(SHANCHU);
			for(long id:ygxxs){
				prep.setLong(1, id);
				prep.addBatch();	
			}
			prep.executeBatch();
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
    	 
     } 
     
    
}
