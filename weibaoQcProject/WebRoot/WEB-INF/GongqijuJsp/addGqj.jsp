<%@page pageEncoding="utf-8" 
contentType="text/html;charset=utf-8" %>
 
<html>
	<head>
		<title>add Emp</title>
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
						<div id="rightheader" align="center">
							<p><font size="5" color="blue">
								欢迎添加新项目
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
					
					<form action="zengjiaGqj.action" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table" align="center">
							<tr >
								<td valign="middle" align="right"><font size="3.5">
									站名:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.station" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									表名:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.toolName" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									工器具型号:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" name="bj.toolStyleNo" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									合格证日期:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.toolCardDate" />
								</font></td>
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									工器具送检日期:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.lendDate" />
								</font></td>
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									工器具到站日期:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.comeDate" />
								</font></td>
							</tr>
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									接收人:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.toolPerson" />
								</font></td>
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									工器具位置:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.toolStyle" />
								</font></td>
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									是否已校验:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.toolShima" /></font><font size="2" color="red">不能超过四个汉字</font>
								</td>
								 
							</tr>
							
							<tr>
								<td valign="middle" align="right"><font size="3.5">
									工器具描述:
								</font></td>
								<td valign="middle" align="left"><font size="3.5">
									<input type="text" class="inputgri" name="bj.tooldesc" />
								</font></td>
							</tr>
							
						</table>
						
						<p>
							<input type="submit"  class="button" value="确认" />
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg" align="right">
						时间为：2016/1/3
				</div>
			</div>
		</div>
	</body>
</html>
