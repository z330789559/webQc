<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@page import="java.sql.Timestamp"%>
<div id="header">
     <div id="topheader" align="left" ><font size="3">
		 
			<a href="#">欢迎使用工器具查询系统</a>
	 </font>
	</div>
	<br/>
	
	<div id="rightheader" align="right"><font size="3">
		   <%  Timestamp date=new Timestamp(System.currentTimeMillis());
		            out.print(date);
	             %>
		</font>
	</div>
	<div id="navigation">
	</div>
</div>
