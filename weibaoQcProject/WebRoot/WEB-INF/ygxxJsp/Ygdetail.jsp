<%@ page pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.Timestamp"%>
<html>
	<head>
		<meta http-equiv=Content-Type content="text/html; charset=utf-8" />
		<link href="../css/style.css" type="text/css" rel="stylesheet" />
	</head>
	<body topMargin="10">
		<div id="append_parent"></div>
		<div id="footer_bg" align="right">
						
	                      
				    </div>
		<table cellSpacing="6" cellPadding="2" width="100%" border="0">
			<tbody>
				<tr>
					<td>
						<table class="guide" cellSpacing="0" cellPadding="0" width="100%"
							border="0">
							<tbody>
								<tr>
									<td><font size="2.5" color="red">
										员工信息更改/
										<%
		                                  Timestamp date=new Timestamp(System.currentTimeMillis());
		                                   out.print(date);
	                                      %>
	                                      </font>
									</td>
								</tr>
							</tbody>
						</table>
						<br />


						<form id="settingsubmit" action="ygUpdate.action" method="post">
							<input type="hidden" name="ygxx.yg_id" value="${ygxx.yg_id}" />
							<table class="tableborder" cellSpacing="0" cellPadding="0"
								width="100%" border="0">
								<tbody>
									<tr class="header">
										<td colSpan="3">
											变更员工信息
										</td>
									</tr>
								</tbody>
								<tbody align="center">
									<tr>
										<td class="altbg1" width="10%">
											<b>姓名:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="ygxx.ygName" value="${ygxx.ygName}"
												readonly="readonly" style="background-color: #dddddd" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>年龄:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="ygxx.ygAge" value="${ygxx.ygAge}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>员工性别:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
										<input type="text" class="inputgri" 
									       name="ygxx.ygGeneral" value="${ygxx.ygGeneral}"/>
										
											<!--<input type="text" name="b.pic"
												value="${b.pic}" />  -->
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>学历:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="ygxx.ygXueLi" value="${ygxx.ygXueLi}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>毕业学校:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="ygxx.ygSchool" value="${ygxx.ygSchool}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>隶属部门:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="ygxx.ygTeam" value="${ygxx.ygTeam}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									
									<tr>
										<td class="altbg1" width="10%">
											<b>民族：</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="ygxx.ygMinZu" value="${ygxx.ygMinZu}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>籍贯：</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="ygxx.ygJiguan" value="${ygxx.ygJiguan}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									
									<tr>
										<td class="altbg1" width="10%">
											<b>家庭住址：</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="ygxx.ygAddress" value="${ygxx.ygAddress}" />
										</td>
										
									</tr>
							
								</tbody>
							</table>
							<br />
							<center>
								<input class="button" type="button" value="取消"
									onclick="location='ygList.action'"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input class="button" type="submit" value="提 交"
									name="settingsubmit" />
							</center>
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</body>
</html>
