package com.weibao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.weibao.entity.ChaKanFile;
import com.weibao.entity.DengluUser;
import com.weibao.util.DButil;

public class ChaKanFileDAO {
	
	
	private static String  ZENGJIA="insert into t_file" +
	"(file_id,user_id,fileName,theme,descript,beizhu)" +
	"values(file_id.nextval,?,?,?,?,?)";
	private static String CHAXUN="select * from t_file";
	private static String CHA="select * from t_file where user_id=?";
	
public List<ChaKanFile>findAll(){
		
		//CHAXUN=select * from t_file"
		List<ChaKanFile>files=new ArrayList<ChaKanFile>();
		Connection conn=null;
		 
			try {
				conn=DButil.openConnection();
				PreparedStatement prep=conn.prepareStatement(CHAXUN);
				
				ResultSet rst=prep.executeQuery();
		
				while(rst.next()){
					ChaKanFile file=new ChaKanFile();
					file.setFile_id(rst.getLong("file_id"));
					file.setUser_id(rst.getLong("user_id"));
					file.setFileName(rst.getString("fileName"));
					file.setTheme(rst.getString("theme"));
					file.setDescript(rst.getString("descript"));
					file.setBeizhu(rst.getString("beizhu"));
					
					files.add(file);
					
				}
								
			} catch (Exception e) {
				
				e.printStackTrace();
	
		} 
	    DButil.closeConnection(conn);
		return files;

	}
	
public void save(ChaKanFile file) throws SQLException{
	 /*
	  * ZENGJIA="insert into t_file" +
	"(file_id,user_id,file,theme,desc,beizhu)" +
	"values(file_id.nextval,?,?,?,?,?)";
	  * 
	  * */
	 
	 Connection conn=null;
	 try {
		     conn=DButil.openConnection();
		     PreparedStatement prep=conn.prepareStatement(ZENGJIA);
		     System.out.println("hello计入dao le --");
		     prep.setLong(1,file.getUser_id());
		     prep.setString(2,  file.getFileName());
		     prep.setString(3, file.getTheme());
		     prep.setString(4, file.getDescript());
		     prep.setString(5, file.getBeizhu());
		     
		     prep.executeUpdate();
		System.out.println("进入dao了----");
	} catch (Exception e) {
		 conn.rollback();
		e.printStackTrace();
	}
	 DButil.closeConnection(conn);	 
	 
   }


public ChaKanFile findById(long user_id){
	 //  CHA="select * from t_file where user_id=?";
	 Connection conn=null;
	 
	 ChaKanFile file=null;
	 try {
		conn=DButil.openConnection();
		PreparedStatement prep=
			                  conn.prepareStatement(CHA);
		prep.setLong(1, user_id);
		ResultSet rst=prep.executeQuery();
		
		while(rst.next()){
			file=new ChaKanFile();
			file.setUser_id(user_id);
			file.setFileName(rst.getString("fileName"));
		     file.setTheme(rst.getString("theme"));
		      file.setDescript(rst.getString("descript"));
		      file.setBeizhu(rst.getString("beizhu"));

		}
		
	
	 }catch (Exception e) {
			// 查询后返回结果
			e.printStackTrace();
		}
		DButil.closeConnection(conn);
		return file; 
   }
}
