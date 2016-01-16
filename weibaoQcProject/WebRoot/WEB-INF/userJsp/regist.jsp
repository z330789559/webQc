<%@page language="java" pageEncoding="utf-8" contentType="text/html; charset=UTF-8"%>
<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.Timestamp"%>
<html>
	<head>
	<title>注册界面</title>
		<meta http-equiv=Content-Type content="text/html; charset=utf-8" />
		<link href="../css/style.css" type="text/css" rel="stylesheet" />
		
	</head>
	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
					<br/>
						<div id="rightheader" align="left" >
							<p><font size="3">
								中铁电气化局集团第一工程有限公司无锡供电安装项目部
								 </font>
								<br />
							</p>
						</div>
						<div id="rightheader" align="right" ><font size="3" color="red">
						    <%
		                                  Timestamp date=new Timestamp(System.currentTimeMillis());
		                                   out.print(date);
	                                      %>
	                                      </font>
						</div>
						<div id="topheader">
							<h1 id="title" align="center">
								注册界面
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
				
					<form action="registSe.action" method="get" >
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table" align="center">
							<tr>
								<td  align="right">
									&nbsp;&nbsp;&nbsp;&nbsp;用户名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri"  id="name"
									name="u.userName" />
								<span style="color:red;"><s:property value="registerro"  /></span>
								</td>
							</tr>
							<tr><td col="2"><label id="error"></label></td></tr>
							<tr>
								<td valign="middle" align="right">
									&nbsp;&nbsp;&nbsp;&nbsp;联系电话:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="u.telephone" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									&nbsp;&nbsp;&nbsp;&nbsp;入职时间:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="u.ruzhiDate" />
								</td>
							</tr>
							
							<tr>
								<td valign="middle" align="right">
									&nbsp;&nbsp;&nbsp;&nbsp;邮箱:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="u.userEmail" />
								</td>
							</tr>
							
							<tr>
								<td valign="middle" align="right">
									&nbsp;&nbsp;&nbsp;&nbsp;学历:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="u.xueLi" />
								</td>
							</tr>
							
							<tr>
								<td valign="middle" align="right">
									&nbsp;&nbsp;&nbsp;&nbsp;隶属部门:
								</td>
								<td valign="middle" align="left">
									
									<input type="text" class="inputgri" name="u.userTeam" />
								</td>
							</tr>
							
							<tr>
								<td valign="middle" align="right">
									&nbsp;&nbsp;&nbsp;&nbsp;密码:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="u.password" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									&nbsp;&nbsp;&nbsp;&nbsp;性别:
								</td>
								<td valign="middle" align="left">
									男
									<input type="radio" class="inputgri" name="u.genarl" value="男" checked="checked"/>
									女
									<input type="radio" class="inputgri" name="u.genarl" value="女"/>
								</td>
							</tr>
							
							
						</table>
						<p align="center">
							&nbsp;&nbsp;&nbsp;&nbsp;<font size="4"><input type="submit" class="button" 
							value="确认" /></font>
						</p>
					</form>
				</div>
			</div>
			<div id="footer" align="center">
				<div id="footer_bg"><font size="3" color="red">
				欢迎加入运营维护信息管理系统
				 </font>
				</div>
			</div>
		</div>
		
	</body>
</html>
