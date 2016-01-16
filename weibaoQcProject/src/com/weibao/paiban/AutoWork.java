package com.weibao.paiban;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AutoWork {

	
	
	

	/**
	 * 1、人数是一个集合，且需要手动输入总人数，其集合根据人数与站名计算排班方式；
	 * 2、标配一个站内的值班方式为白班2人，夜班2人--
	 * 3、假如3个站，其中一个站的标配为4人，替班2人，要求三天一休班则一共为3*4+2=14人
	 *    最少人数为4人一个站，且方式自动排序
	 * 4、站名也是个数组集合｛str1\str2\str3｝
	 * 5、人数根据站数自动排班
	 * @param num 
	 */
	public static String sortWork(int num) {
		String result = "结果错误";
		String [] station={"三阳主变","友谊主变","金城主变"};
		String []a=("0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18").split(",");
		boolean[] used=new boolean[a.length];
		
		
		  int person=num;
	      Random r=new Random();
	      String[] all=new String[person];
	      int idx;// 数据角标
	     
	      for(int i=0;i<person;i++){
	    	  do{
	    		  
	    	   idx=r.nextInt(a.length);//从a数组中抽取数据；0-18

	    	  }while(used[idx]);
	    	  
	    	  used[idx]=true;  // 标记使用过了
	    	  all[i]=a[idx];// 取一个未使用的一个数，最后构成数组；
	      }
	      Arrays.sort(all);
	   //   System.out.println(Arrays.toString(all));
	      if(person>=station.length*3&&person<station.length*4){
	    	  result="三个主所实行单人三班倒班模式"+"三阳主所"+all[0]+"-"+all[1]+"-"+all[2]+";" +
	    	  		       "金城主所"+all[3]+"-"+all[4]+"-"+all[5]+"友谊主所"+all[6]+"-"+all[7]+"-"+all[8];
	      }
	      if(person<station.length*3){
	    	  result=("对不起人数不够！" +
	    	  		      "你该向项目部调度汇报申请援助，不要私自做决定-----"+Arrays.toString(all));
	    	  
	      }if(person==station.length*4&&person<station.length*4+2){
	    	  result="三个主所可以白天2人，晚上一人"+"三阳主所白班"+all[0]+"-"+all[1]+"" +
	    	  		"三阳主所夜班"+all[2]+"金城主所白班"+all[3]+"-"+all[4]+"金城主所夜班" +
	    	  				""+all[5]+"友谊主所白班"+all[6]+"-"+all[7]+"友谊主所夜班"+all[8];
	    	  
	    	  result="三个主所可以白天2人，晚上一人"+"三阳主所白班"+all[9]+"-"+all[0]+"" +
		    	  		"三阳主所夜班"+all[1]+"金城主所白班"+all[10]+"-"+all[3]+"金城主所夜班" +
    	  				""+all[4]+"友谊主所白班"+all[11]+"-"+all[7]+"友谊主所夜班"+all[6];
	    	  
	    	  result="三个主所可以白天2人，晚上一人"+"三阳主所白班"+all[9]+"-"+all[2]+"" +
		    	  		"三阳主所夜班"+all[0]+"金城主所白班"+all[10]+"-"+all[5]+"金城主所夜班" +
  	  				""+all[3]+"友谊主所白班"+all[11]+"-"+all[8]+"友谊主所夜班"+all[7];
	    	  
	    	  result="三个主所可以白天2人，晚上一人"+"三阳主所白班"+all[1]+"-"+all[2]+"" +
		    	  		"三阳主所夜班"+all[9]+"金城主所白班"+all[4]+"-"+all[5]+"金城主所夜班" +
	  				""+all[10]+"友谊主所白班"+all[6]+"-"+all[8]+"友谊主所夜班"+all[11];
	    	  result="三个主所可以白天2人，晚上一人"+"三阳主所白班"+all[1]+"-"+all[0]+"" +
		    	  		"三阳主所夜班"+all[2]+"金城主所白班"+all[4]+"-"+all[3]+"金城主所夜班" +
	  				""+all[5]+"友谊主所白班"+all[11]+"-"+all[7]+"友谊主所夜班"+all[8];
	      }
	      
	      if(person>=station.length*4+2){
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[0]+"-"+all[1]+"" +
	    	  		"三阳主所夜班"+all[2]+all[3]+"金城主所白班"+all[4]+"-"+all[5]+"金城主所夜班" +
	    	  				""+all[6]+all[7]+"友谊主所白班"+all[8]+"-"+all[9]+"友谊主所夜班"+all[10]+all[11];
	      
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[12]+"-"+all[13]+"" +
		    	  		"三阳主所夜班"+all[0]+all[1]+"金城主所白班"+all[4]+"-"+all[5]+"金城主所夜班" +
		    	  				""+all[6]+all[7]+"友谊主所白班"+all[8]+"-"+all[9]+"友谊主所夜班"+all[10]+all[11];
	      
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[2]+"-"+all[3]+"" +
		    	  		"三阳主所夜班"+all[0]+all[1]+"金城主所白班"+all[12]+"-"+all[13]+"金城主所夜班" +
		    	  				""+all[4]+all[5]+"友谊主所白班"+all[8]+"-"+all[9]+"友谊主所夜班"+all[10]+all[11];
	      
	      
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[2]+"-"+all[3]+"" +
		    	  		"三阳主所夜班"+all[0]+all[1]+"金城主所白班"+all[6]+"-"+all[7]+"金城主所夜班" +
		    	  				""+all[4]+all[5]+"友谊主所白班"+all[12]+"-"+all[13]+"友谊主所夜班"+all[8]+all[9];
	      
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[2]+"-"+all[3]+"" +
		    	  		"三阳主所夜班"+all[0]+all[1]+"金城主所白班"+all[6]+"-"+all[7]+"金城主所夜班" +
		    	  				""+all[4]+all[5]+"友谊主所白班"+all[10]+"-"+all[11]+"友谊主所夜班"+all[8]+all[9];
	      
	      
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[2]+"-"+all[3]+"" +
		    	  		"三阳主所夜班"+all[12]+all[13]+"金城主所白班"+all[6]+"-"+all[7]+"金城主所夜班" +
		    	  				""+all[4]+all[5]+"友谊主所白班"+all[10]+"-"+all[11]+"友谊主所夜班"+all[8]+all[9];
	      
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[0]+"-"+all[1]+"" +
		    	  		"三阳主所夜班"+all[2]+all[3]+"金城主所白班"+all[6]+"-"+all[7]+"金城主所夜班" +
		    	  				""+all[12]+all[13]+"友谊主所白班"+all[10]+"-"+all[11]+"友谊主所夜班"+all[8]+all[9];
	      
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[0]+"-"+all[1]+"" +
		    	  		"三阳主所夜班"+all[2]+all[3]+"金城主所白班"+all[4]+"-"+all[5]+"金城主所夜班" +
		    	  				""+all[6]+all[7]+"友谊主所白班"+all[10]+"-"+all[11]+"友谊主所夜班"+all[12]+all[13];
	    	  result="三个主所可以白天2人，晚上2人"+"三阳主所白班"+all[0]+"-"+all[1]+"" +
		    	  		"三阳主所夜班"+all[2]+all[3]+"金城主所白班"+all[4]+"-"+all[5]+"金城主所夜班" +
		    	  				""+all[6]+all[7]+"友谊主所白班"+all[8]+"-"+all[9]+"友谊主所夜班"+all[10]+all[11];
	      
	
	      }
	      
	     

	 return result;
}
}