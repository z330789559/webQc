package com.weibao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	/**
	 * 链接数据库建立链接----
	 * @throws Exception 
	 */
	
	public  static Connection openConnection() throws Exception{
		 
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection	conn=
				  DriverManager.getConnection
				       ("jdbc:oracle:thin:@localhost:1521:XE","system","123456");
			return conn;

	}
	public  static void closeConnection(Connection conn){
		if(conn!=null){
			 try {
				conn.close();
			} catch (Exception e) {
				 e.printStackTrace();
		 		  
	          }
		}
	
	}
	
	
	public static void main(String[] args) throws Exception {
		System.out.println(openConnection());

	}
	

}
