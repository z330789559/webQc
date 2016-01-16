<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
 
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
								欢迎添加新成员
								</font>
								<br />
							</p>
						</div>
						<div id="topheader">
							<!--<h1 id="title">
								<a href="#">添加</a>
							</h1>  -->
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content" align="center">
					<p id="whereami">
					</p>
					<form action="zengjiaYg.action" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table" align="center">
							<tr >
								<td valign="middle" align="right"><font size="3.5">
									姓名:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="yg.ygName" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									年龄:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="yg.ygAge" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									性别:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" name="yg.ygGeneral" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									员工学历:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="yg.ygXueLi" />
								</font></td>
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									毕业学校:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="yg.ygSchool" />
								</font></td>
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									隶属部门:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="yg.ygTeam" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									民族:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="yg.ygMinZu" />
								</font></td>
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									籍贯:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="yg.ygJiguan" />
								</font></td>
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									家庭住址:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="yg.ygAddress" /></font><font size="2" color="red">简单明了</font>
								</td> 
							</tr>
							
						</table>
						
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
