<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv=Content-Type content="text/html; charset=utf-8" />
		<link href="css/main/style.css"
			type="text/css" rel="stylesheet" />
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
										<a href='#'>副页</a>&nbsp;/&nbsp;
										<a href='biaoji_list.html'>川浦区域表记台帐</a>&nbsp;/&nbsp;表计台帐信息
									</td>
								</tr>
							</tbody>
						</table>
						<br />
						<table class="tableborder" cellSpacing="0" cellPadding="0"
							width="100%" border="0">
							<tbody>
								<tr class="header">
									<td class="altbg2" colspan="12">
										表计台帐信息
									</td>
								</tr>
							</tbody>
							<tbody>
								<tr>
								    <td class="altbg1" width="5%">
										<b>编号</b>
									</td>
									<td class="altbg1" width="10%">
										<b>站名</b>
									</td>
									<td class="altbg1" width="10%">
										<b>表名</b>
									</td>
									<td class="altbg1" width="10%">
										<b>图片</b>
									</td>
									<td class="altbg1" width="10%">
										<b>出厂编号</b>
									</td>
									<td class="altbg1" width="5%">
										<b>型号</b>
									</td>
									<td class="altbg1" width="10%">
										<b>日期</b>
									</td>
									<td class="altbg1" width="8%">
										<b>是否被校验</b>
									</td>	
									<td class="altbg1" width="30">
										&nbsp;
									</td>
									<td class="altbg1" width="10%">
										&nbsp;
									</td>
									
								</tr>
							</tbody>
							
							<tbody>
								<!-- -不知道怎么修改了啊-- -->
								<tr>
									<td class="altbg2">
										<a href="bjDtail.action?gqjCartId=${id}"><b><s:property
															value="id"/></b></a>
									</td>
									<td class="altbg2">
										<b><s:property value="station" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="name" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="pic" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="chuchangNo" /></b>
									</td>
									 
									
								 
									<td class="altbg2">
										<a href="rollbackItem.action?gqjCartId=${id}"">恢复 &nbsp;&nbsp;</a>
										 
											
											<span style="color:red;">
											 
											</span>
									</td>
								</tr>
									
								  
										 
							</tbody>
						</table>
						<br />
						<center>
							
							<input class="button" type="button" value="清空表计"
								name="settingsubmit"
								onclick="location = 'clearItem.action';">
								<a href="javascript:history.go(-1);">返回</a>
						</center>
					    <input class="button" type="button" value="返回表计列表"
								name="settingsubmit" onclick="location = 'gqjList.action';">
								
					</td>
				</tr>
			</tbody>
		</table>

	</body>
</html>



