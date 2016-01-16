package com.weibao.test.action;

import java.util.ArrayList;

import java.util.Currency;

import com.opensymphony.xwork2.ActionSupport;
import com.weibao.entity.*;
import com.weibao.test.PageInformation;
/*
 * 1、这个没有看懂具体的意思，代码已复制，其链接的jsp需要改动。
 * 2、其中xml 文件没有配置，不知道该怎么配置xml文件。
 * 3、如何根据jsp 中的代码配置action
 * 
 * 
 * */


public class ShowAction extends ActionSupport{
	
	  private int totalPages;

      private boolean hasPre;

      private boolean hasNext;

      private int currentPage=1;

      private ArrayList<Gongqiju> list;
	
      private ArrayList list2= new ArrayList();//这个list用来存放下面的页码起始位置

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
        	  
        	  // 解释什么意思并配置xml 文件

          }

}
      public ArrayList<Gongqiju> getList() {

          pi.getList(currentPage);

          return list;

}

}
