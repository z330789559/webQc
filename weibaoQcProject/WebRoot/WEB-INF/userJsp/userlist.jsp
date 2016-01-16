<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.Timestamp"%>
<jsp:include page="../GongqijuJsp/index.jsp" />
<html>
	<head>
		<meta http-equiv=Content-Type content="text/html; charset=utf-8" />
		<link href="../css/style.css" type="text/css" rel="stylesheet" />
	</head>
      
	<body topMargin="10">
		<div id="append_parent"></div>
		<table cellSpacing=6 cellPadding=2 width="100%" border="0">
			<tbody>
				<tr>
					<td>
						<table class="guide" cellSpacing="0" cellPadding="0" width="100%"
							border="0">
							<tbody>
								<tr>
									<td>
										<a href='#'>主页</a>&nbsp;/&nbsp;
										<a href='#'>注册用户汇总</a>/  <%
		                                  Timestamp date=new Timestamp(System.currentTimeMillis());
		                                   out.print(date);
	                                      %>
									</td>
								</tr>
							</tbody>
						</table>
						<br />
						<form action="userdelet.action">
							<table class="tableborder" cellSpacing="0" cellPadding="0"
								width="100%" border="0">
								<tbody>
									<tr class="header">
										<td class="altbg1" width="5%">
											<b>&nbsp;选择</b>
										</td>
										<td class="altbg1" width="5%">
											<b>编号</b>
										</td>

										<td class="altbg1" width="10%">
											<b>用户名</b>
											</td>
										<td class="altbg1" width="10%">
											<b>电话联系方式</b>
										 </td>
										<td class="altbg1" width="10%">
											<b>入职时间</b>
										</td>
										<td class="altbg1" width="10%">
											<b>离职日期</b>
										</td>
										
										
										<td class="altbg1" width="10%">
											<b>学历</b>
										</td>
                                        
                                        <td class="altbg1" width="10%">
											<b>隶属区域</b>
										</td>
										
										<td class="altbg1" width="10%">
											<b>设置密码</b>
										</td>
										
										<td class="altbg1" width="15%">
											<b>性别</b>
										</td>
										<td class="altbg1" width="5%">
											<b>备注</b>
										</td>
									</tr>
								</tbody>
								<tbody>
									<s:iterator value="userList">
										<tr>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="user_id" value="${user_id}" />
											</td>
											<td class="altbg2" >
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property  value="user_id" /></b>
											</td>

											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="userName" /> </b>
												</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="telephone" /> </b>
											</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="ruzhiDate" /> </b>
											</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="userEmail" /> </b>
											</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="xueLi" /> </b>
											</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="userTeam" /> </b>
											</td>
											
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="password" /> </b>
											</td>
											
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="genarl" /> </b>
											</td>
											<td class="altbg2">
											&nbsp;&nbsp;<a href="javascript:void(0);" class="delete " data-id="${user_id}" onclick=" deleteRow(${user_id});">删除</a>
										    </td>
										</tr>
									</s:iterator>
								</tbody>
							</table>
							<br />
							<center>
								
								<input class="button" type="button" value="亲，联系我"
									onclick="location='error.action'"/>;
							</center>
						</form>
					</td>
				</tr>
			</tbody>
		</table>
		<script>
		function deleteRow(user_id){
			
		var y= confirm('是否确认删除?');
		
		if(y){
			location.href="userdelet.action?user_id="+user_id;
		}
		}
		</script>

	</body>
</html>
