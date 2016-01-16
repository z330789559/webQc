package com.weibao.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.weibao.entity.Gongqiju;
import com.weibao.util.DButil;

public class TestPage {
	
	public static void main(String[] args) throws Exception {
		
	//	getPage(2,1);	 
		Scanner sc =new Scanner(System.in);
		int page=sc.nextInt();
		// 取到数据根据page 页码；
		getPage(2,page);
	}

	public static void getPage(int pageSize,int page) throws Exception{
		// totalpage 总得页数；
		int totalpage=0;
		int totalNum=getTotalNum() ;
		if(totalNum%pageSize==0){
			totalpage=totalNum/pageSize;
			
			
		}else{
			totalpage=totalNum/pageSize+1;
		}
		if(page>totalpage){
			page=totalpage;
			}
		if(page<=0){
			page=1;
		}
		
		int from=(page-1)*pageSize+1;
		int  to=from+pageSize;
		//t_Gongqiju
		String sql="select id,station,toolName,toolStyleNo,toolCardDate," +
				"lendDate,comeDate,toolPerson,toolStyle,toolShima,tooldesc,rn" +
				" from(select id,station,toolName,toolStyleNo,toolCardDate,lendDate," +
				"comeDate,toolPerson,toolStyle,toolShima,tooldesc,rownum rn from t_Gongqiju" +
				" where rownum<?)where rn>=?";
		
		Connection conn=null;
		PreparedStatement  pst=null;
		Gongqiju gqj=null;
		
		try {
			conn=DButil.openConnection();
			pst=conn.prepareStatement(sql);
	     	pst.setInt(1, to);
	    	pst.setInt(2, from);
	    	 
			ResultSet rst=pst.executeQuery();
			while(rst.next()){
			     gqj=new Gongqiju();
				gqj.setId(rst.getLong("id"));
				gqj.setStation(rst.getString("station"));
				gqj.setStation(rst.getString("toolName"));
				gqj.setStation(rst.getString("toolStyleNo"));
				gqj.setStation(rst.getString("toolCardDate"));
				gqj.setStation(rst.getString("lendDate"));
				gqj.setStation(rst.getString("comeDate"));
				gqj.setStation(rst.getString("toolPerson"));
				gqj.setStation(rst.getString("toolStyle"));
				gqj.setStation(rst.getString("toolShima"));
				gqj.setStation(rst.getString("tooldesc"));
                System.out.println(gqj.getComeDate());
			}
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}finally{
			DButil.closeConnection(conn);
			pst.close();
			 
		}

	}
// 获得数据表一共多少记录；	
	public static int getTotalNum() throws Exception{
		int n=-1;
		String total="select count(*) num from t_Gongqiju";
		Connection conn=null;
		Statement smt=null;
		ResultSet rst=null;
		
		 try {
			 conn=DButil.openConnection();
			 smt=conn.createStatement();
			 rst= smt.executeQuery(total);
			 
			 rst.next();
			 n=rst.getInt("num");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return n;
		
		
	}
	
}
