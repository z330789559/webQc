<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<div id="header">
<%@page import="java.sql.Timestamp"%>
<br/>
<br/>
	<div id="rightheader" align="left">
		<font size="3" color="red">
			     <a href="#">欢迎使用人员信息查询系统</a> 
			     </font>   	
	</div>
	<br/>
	<div id="topheader" align="right" ><font size="3" color="red">

			   <%  Timestamp date=new Timestamp(System.currentTimeMillis());
		            out.print(date);
	             %>
	 </font>
	</div>
	<div id="navigation">
	</div>
</div>
