package com.weibao.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import javax.xml.registry.infomodel.User;

import com.weibao.entity.Gongqiju;
import com.weibao.util.DButil;

public class  PageInformation  {
	
	  private int pageSize;//ÿһҳ��������Ŀ����

      private int totalRows;//һ���ж�����

      private int totalPages;//һ���ж���ҳ

     

      private int currentPage=1;//��ʼ����ǰҳΪ��һҳ

      private boolean hasPrevious = false;//�Ƿ���ǰҳ����δʹ�ã��д�����

      private boolean hasNext = false;//�Ƿ��к�ҳ����δʹ�ã��д�����

     

      private ArrayList<Gongqiju> list = new ArrayList<Gongqiju>();//��Ž�����б�

      //private DatabaseGeneralServices DBUtil;//�Լ�д�Ļ��connection���࣬�����Լ�ʵ��

      private Connection conn;          

      private PreparedStatement ps;

      private ResultSet rs;
      
      
      String sql="select id,station,toolName,toolStyleNo,toolCardDate," +
		"lendDate,comeDate,toolPerson,toolStyle,toolShima,tooldesc,rn" +
		" from(select id,station,toolName,toolStyleNo,toolCardDate,lendDate," +
		"comeDate,toolPerson,toolStyle,toolShima,tooldesc,rownum rn from t_Gongqiju" +
		" where rownum<?)where rn>=?";
	
      public PageInformation(){
    	  
    	  pageSize = 10;//ÿҳ����Ϊ20��
    	  totalRows = initRowCount();//�õ����������Ƚϴ����֪��ʲô���ɵķ���������select count(*)...

          totalPages =((totalRows+pageSize)-1)/pageSize;//�����ҳ��

          initList(1);
    	  
    	  
      }
      private void initList(int currentPage){

          list.removeAll(list);
          try {
			conn=DButil.openConnection();
			ps = conn.prepareStatement("SELECT * FROM t_Gongqiju LIMIT ?,10");

            int temp = (currentPage-1)*10;

            ps.setInt(1, temp);

            rs = ps.executeQuery();

            while (rs.next()){

                     Gongqiju gqj = new Gongqiju();

                     gqj.setId(rs.getLong("id"));
        			 gqj.setStation(rs.getString("station"));
        			 gqj.setToolName(rs.getString("toolName"));
        			 gqj.setToolStyleNo(rs.getString("toolStyleNo"));
        			 gqj.setToolCardDate(rs.getString("toolCardDate"));
        			 gqj.setLendDate(rs.getString("lendDate"));
        			 gqj.setComeDate(rs.getString("comeDate"));
        			 gqj.setToolPerson(rs.getString("toolPerson"));
        			 gqj.setToolStyle(rs.getString("toolStyle"));
        			 gqj.setToolShima(rs.getString("toolShima"));
        			 gqj.setTooldesc(rs.getString("tooldesc"));
        			 
                     list.add(gqj);

            }

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DButil.closeConnection(conn);

		}
 
      }
      
      private int initRowCount(){
    	  
    	  try {
			conn=DButil.openConnection();
			ps = conn.prepareStatement("SELECT * FROM t_Gongqiju");
			 rs = ps.executeQuery();

             rs.last();

             int result = rs.getRow();

             rs.first();

             return result;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DButil.closeConnection(conn);
		}
    	  
		return 0;
    	  
      }
      
      public ArrayList<Gongqiju> getList(int cp) {

          initList(cp);

          ArrayList<Gongqiju> temp = new ArrayList<Gongqiju>();

          for(int i =0;i<10;i++){

                   temp.add(list.get(i));

          }

          return temp;

 }
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public boolean isHasPrevious() {
		return hasPrevious;
	}
	public void setHasPrevious(boolean hasPrevious) {
		this.hasPrevious = hasPrevious;
	}
	public boolean isHasNext() {
		return hasNext;
	}
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	public ArrayList<Gongqiju> getList() {
		return list;
	}
	public void setList(ArrayList<Gongqiju> list) {
		this.list = list;
	}
	
}