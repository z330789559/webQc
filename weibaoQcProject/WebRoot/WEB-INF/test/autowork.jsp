<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
 <%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>add person</title>
		<meta http-equiv=Content-Type content="text/html; charset=utf-8" />
		<link href="../css/style.css" type="text/css" rel="stylesheet" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
					<br/>
					<br/>
					<br/>
					<div id="footer">
				    <div id="footer_bg" align="right"><font size="3" color="red">
						
	                      </font>
				    </div>
						<div id="rightheader" align="center">
							<p><font size="5" color="blue">
								欢迎使用自动排班信息管理系统
								</font>
								<br />
							</p>
						</div>
						<div id="topheader">
							
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content" align="center">
					<p id="whereami">
					</p>
					<form action="autoWork.action" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table" align="center">
							<tr >
								<td valign="middle" align="right"><font size="3.5">
									目前员工人数:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="num" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									值守站名1:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="station1" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									值守站名2:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" name="station2" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									值守站名3:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="station3" />
								</font></td>
							</tr>

							<tr>
								<td valign="middle" align="right"><font size="3.5">
									人员排班安排:<!-- -在这一块显示具体方案 ,一直报黄线-->
								</font></td>
							
							</tr>
							
						</table>
							     <div style="margin:20px;">
								<s:property value="sortResult"  />
								</div>
						<p>
							<input type="submit"  class="button" value="确认" />
						</p>
					</form>
				</div>
			</div>
			
			</div>
		</div>
	</body>
</html>
