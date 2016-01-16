package com.weibao.YgXxAction;


import java.util.List;


import com.weibao.entity.YuangongXinxi;

public class YgListAction extends YgBaseAction{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 12222L;
	private  List<YuangongXinxi>ygxxList;
	public String execute() throws Exception {
		
		ygxxList=ygdao.findAll();
	/*	for(int i=0;i<gqjList.size();i++){
			Gongqiju gqj=gqjList.get(i);
			
			Date date=new Date();
			String str=gqj.getToolCardDate();
			DateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
			Date s1=fmt.parse(str);
			long s2=s1.getTime();
			String date1=fmt.format(date);
			long d1=date.getTime();
			long c = s2 - d1;
			if ((date1.equals(str)) || (c < 172800000L)) {
				request.setAttribute("date_error" + gqj.getId(), "表计过期了");
			}
			 request.setAttribute("gqjList", gqjList);
		}
		
		request.getRequestDispatcher("biaoji_list.jsp").forward(request, response);*/
		return "sucess";
	}
	public List<YuangongXinxi> getYgxxList() {
		return ygxxList;
	}
	public void setYgxxList(List<YuangongXinxi> ygxxList) {
		this.ygxxList = ygxxList;
	}
	

}
