<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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
										<a href='#'>主页</a>&nbsp;/&nbsp;
										<a href='biaoji_list.html'>站内表记台帐</a>&nbsp;/&nbsp;表计台帐信息
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
										工器具台帐信息
									</td>
								</tr>
							</tbody>
							<tbody>
								<tr>
								    <td class="altbg1" width="5%">
										<b>编号</b>
									</td>
									<td class="altbg1" width="5%">
										<b>站名</b>
									</td>
									<td class="altbg1" width="10%">
										<b>工器具名称</b>
									</td>
									<td class="altbg1" width="10%">
										<b>工器具型号</b>
									</td>
									<td class="altbg1" width="10%">
										<b>合格证日期</b>
									</td>
									<td class="altbg1" width="10%">
										<b>送检日期</b>
									</td>
									<td class="altbg1" width="10%">
										<b>到站日期</b>
									</td>
									<td class="altbg1" width="5%">
										<b>接收人</b>
									</td>
									<td class="altbg1" width="10%">
										<b>工器具位置</b>
									</td>
									<td class="altbg1" width="10%">
										<b>是否已校验</b>
									</td>	
									<td class="altbg1" width="10%">
										<b>描述</b>
									</td>
									<td class="altbg1" width="10%">
										<b>备注</b>
									</td>
								</tr>
							</tbody>
							<!-- 还没有改 -->
							<tbody>
								 <s:iterator value="gqjList">
									 
								<tr>
									<td class="altbg2">
										<a href="bjDtail.action?gqjCartId=${id}"><b><s:property
															value="id"/></b></a>
									</td>
									<td class="altbg2">
										<b><s:property value="station" /></b>
									</td>
									<td class="altbg2">
									   <b><s:property value="toolName" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="toolStyleNo" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="toolCardDate" /></b>
									</td>
									<td class="altbg2">
										<b><s:property value="lendDate" /> </b>
									</td>
									<td class="altbg2">
										<b><s:property value="comeDate" /> </b>
									</td>
									<td class="altbg2">
										<b><s:property value="toolPerson" /> </b>
									</td>
									<td class="altbg2">
										<b><s:property value="toolStyle" /> </b>
									</td>
									<td class="altbg2">
										<b> <s:property value="toolShima" /></b>
									<br/></td>
									<td class="altbg2">
										<b> <s:property value="tooldesc" /></b>
									<br/></td>
									<td class="altbg2">
										<a href="cartDelete.action?gqjCartid=${id}">删除 &nbsp;&nbsp;</a>
									</td>
								</tr>
										 
										<tr>
											<td class="altbg1" colspan="12">
												<b>总数量：<a href="cartTotal.action"></a></b>
											</td>
										</tr>
										 
										<tr>
											<td class="altbg2" colspan="24">
											<b>没有选中过期表计</b>
											</td>
										</tr>
								</s:iterator> 
							</tbody>
						</table>
						<br />
						<center>
							
							<input class="button" type="button" value="清空表计"
								name="settingsubmit"
								onclick="location = 'clearItem.action';">
								 
								<a href="javascript:history.go(-1);">返回上一页面</a>
						</center>
					    <input class="button" type="button" value="返回表计列表"
								name="settingsubmit" onclick="location = 'gqjList.action';"> 
								&nbsp;&nbsp; 
								&nbsp;&nbsp; 
								&nbsp;&nbsp; 
								&nbsp;&nbsp; 
								&nbsp;&nbsp;
								&nbsp;&nbsp;
								<input class="button" type="button" value="查看删除列表"
								name="settingsubmit" onclick="location = 'rollbackItem.action';">
					</td>
				</tr>
			
			</tbody>
		</table>

	</body>
</html>



