<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.Timestamp"%>

<html>
	<head>
	     <title>登录界面</title>
		<meta http-equiv=Content-Type content="text/html; charset=utf-8" />
		<link href="../css/style.css" type="text/css" rel="stylesheet" />
	</head>

	<body>
	
		<div id="wrap">
			<div id="top_content">
					<div id="header" align="center" >
					<br/>
					<br/>
					<br/>
					<br/>
						<div id="rightheader"><font size="4">
						   中铁电气化局集团第一工程有限公司无锡地铁供电项目部
							</font>
						</div>
						
						<div id="navigation">
						</div>
					</div>
				<div id="content" align="center">
					<p id="whereami">
					</p>
					<h1>
						&nbsp;&nbsp;&nbsp;登录界面
					</h1>
					<form action="../login/dologin.action" method="post">
						<table align="center" cellpadding="0" cellspacing="0" border="0"
							class="form_table" style="height:139px;width:300px">
							<tr>
								<td valign="middle" align="right">
								  <font size="4">
									用户名:
									</font>
								</td>
								<td valign="middle" align="left"><font size="4">
									<input type="text" class="inputgri" id="name"
									name="u.userName" /></font>

								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
								   <font size="4">
									密码:
									</font>
								</td>
								<td valign="middle" align="left"><font size="4">
									<input type="password" class="inputgri" id="password"
									name="u.password" />
									</font>
								</td>
							</tr>
						</table>
						<p>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font><input type="submit" class="button" 
							value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							
							<input type="button" class="button" 
							value="注册" onclick="location='regist.action'"/>
							</font>
						</p>

					</form>
				</div>
			</div>
			<div id="footer" >
				<div id="footer_bg" align="right"><font size="3">

					</font>
				</div>
			</div>
		</div>
	</body>
</html>
