package com.weibao.test.action;

import java.util.ArrayList;

import java.util.Currency;

import com.opensymphony.xwork2.ActionSupport;
import com.weibao.entity.*;
import com.weibao.test.PageInformation;
/*
 * 1�����û�п����������˼�������Ѹ��ƣ������ӵ�jsp��Ҫ�Ķ���
 * 2������xml �ļ�û�����ã���֪������ô����xml�ļ���
 * 3����θ���jsp �еĴ�������action
 * 
 * 
 * */


public class ShowAction extends ActionSupport{
	
	  private int totalPages;

      private boolean hasPre;

      private boolean hasNext;

      private int currentPage=1;

      private ArrayList<Gongqiju> list;
	
      private ArrayList list2= new ArrayList();//���list������������ҳ����ʼλ��

      private PageInformation pi;
      
      
      
      public String execute(){

          init(currentPage);

          return SUCCESS;

}
      private void init(int currentPage){

          pi = new PageInformation();

          pi.getTotalPages();

          pi.isHasPrevious();

          pi.isHasNext();

        pi.getList(currentPage);

         

          for(int i =currentPage;i<=currentPage+10;i++){

           //    conCurrent c = new Current();

                //   c.setCurrentPage(i);

                  // list2.add(c);
        	  
        	  // ����ʲô��˼������xml �ļ�

          }

}
      public ArrayList<Gongqiju> getList() {

          pi.getList(currentPage);

          return list;

}

}
