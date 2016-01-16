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
		<table cellSpacing="6" cellPadding="2" width="100%" border="0">
			<tbody>
				<tr>
					<td>
						<table class="guide" cellSpacing="0" cellPadding="0" width="100%"
							border="0">
							<tbody>
								<tr>
									<td>
										工器具update验证/
										<%  Timestamp date=new Timestamp(System.currentTimeMillis());
		                                     out.print(date);
	                                       %>
									</td>
								</tr>
							</tbody>
						</table>
						<br />


						<form id="settingsubmit" action="gqjList.action" method="post">
							<input type="hidden" name="gqj.id" value="${gqj.id}" />
							<table class="tableborder" cellSpacing="0" cellPadding="0"
								width="100%" border="0" align="center">
								<tbody>
									<tr class="header">
										<td colSpan="3">
											变更表计信息
										</td>
									</tr>
								</tbody>
								<tbody align="center">
									<tr>
										<td class="altbg1" width="10%">
											<b>站名:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.station" value="${gqj.station}"
												readonly="readonly" style="background-color: #dddddd" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>工器具名称:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.toolName" value="${gqj.toolName}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>工器具型号:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
										<input type="text" class="inputgri" 
									       name="gqj.toolStyleNo" value="${gqj.toolStyleNo}"/>
										
											<!--<input type="text" name="b.pic"
												value="${b.pic}" />  -->
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>合格证日期:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.toolCardDate" value="${gqj.toolCardDate}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>送检日期:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.lendDate" value="${gqj.lendDate}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>到站日期:</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.comeDate" value="${gqj.comeDate}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									
									<tr>
										<td class="altbg1" width="10%">
											<b>接收人：</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.toolPerson" value="${gqj.toolPerson}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="10%">
											<b>工器具位置：</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.toolStyle" value="${gqj.toolStyle}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									
									<tr>
										<td class="altbg1" width="10%">
											<b>是否已校验：</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.toolShima" value="${gqj.toolShima}" />
										</td>
										<td>
											<span style="color: red">不得超过四个字</span>
										</td>
									</tr>
									
									<tr>
										<td class="altbg1" width="10%">
											<b>工器具描述：</b>
										</td>
										<td class="altbg2" valign="middle" width="10%">
											<input type="text" name="gqj.tooldesc" value="${gqj.tooldesc}" />
										</td>
										<td>
											<span style="color: red">简单明了</span>
										</td>
									</tr>
								</tbody>
							</table>
							<br />
							<center>
								
								<input class="button" type="submit" value="返回工器具列表"
									name="settingsubmit" />
							</center>
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</body>
</html>
