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
										<a href='#'>更改页</a>&nbsp;/&nbsp;
										<a href='biaoji_list.html'>恢复员工信息台账</a>
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
										员工信息
									</td>
								</tr>
							</tbody>
							<tbody>
								<tr>
								    <td class="altbg1" width="5%">
										<b>编号</b>
									</td>
									<td class="altbg1" width="10%">
										<b>姓名</b>
									</td>
									<td class="altbg1" width="10%">
										<b>年龄</b>
									</td>
									<td class="altbg1" width="10%">
										<b>性别</b>
									</td>
									<td class="altbg1" width="10%">
										<b>学历</b>
									</td>
									<td class="altbg1" width="5%">
										<b>毕业学校</b>
									</td>
									<td class="altbg1" width="10%">
										<b>隶属部门</b>
									</td>
									<td class="altbg1" width="8%">
										<b>民族</b>
									</td>	
									<td class="altbg1" width="30">
										<b>籍贯</b>
									</td>
									<td class="altbg1" width="10%">
										<b>家庭住址</b>
									</td>
									
								</tr>
							</tbody>
							
							<tbody>
								<!-- -不知道怎么修改了啊-- -->
								<tr>
									<td class="altbg2">
										<a href="ygDtail.action?ygCartId=${yg_id}"><b><s:property
															value="yg_id"/></b></a>
									</td>
									<td class="altbg2">
										<b><s:property value="ygName" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="ygAge" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="ygGeneral" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="ygXueLi" /></b>
									</td>
									 
									<td class="altbg2">
										<b><s:property value="ygSchool" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="ygTeam" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="ygMinZu" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="ygJiguan" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="ygAddress" /></b>
									</td>
								 
									<td class="altbg2">
										<a href="rollbackItem.action?ygCartId=${yg_id}"">恢复 &nbsp;&nbsp;</a>
										 
											
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
								name="settingsubmit" onclick="location = 'ygList.action';">
								
					</td>
				</tr>
			</tbody>
		</table>

	</body>
</html>



