<%@ page pageEncoding="utf-8"%>
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
										注册用户汇总验证
									</td>
								</tr>
							</tbody>
						</table>
						<br />


						<form id="settings" action="userupdate.action" method="post">
							<input type="hidden" name="u.user_id" value="${u.user_id}" />
							<table class="tableborder" cellSpacing="0" cellPadding="0"
								width="100%" border="0">
								<tbody>
									<tr class="header">
										<td colSpan="3">
											变更用户信息
										</td>
									</tr>
								</tbody>
								<tbody>
									<tr>
										<td class="altbg1" width="20%">
											<b>用户名:</b>
										</td>
										<td class="altbg2" valign="middle" width="20%">
											<input type="text" name="u.userName" value="${u.username}"
												readonly="readonly" style="background-color: #dddddd" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="20%">
											<b>电话:</b>
										</td>
										<td class="altbg2">
											<input type="text" name="u.telephone" value="${u.telephone}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="20%">
											<b>开始时间:</b>
										</td>
										<td class="altbg2">
											<input type="text" name="u.ruzhiDate"
												value="${u.ruzhiDate}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="20%">
											<b>邮箱:</b>
										</td>
										<td class="altbg2">
											<input type="text" name="u.userEmail" value="${u.userEmail}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="20%">
											<b>学历:</b>
										</td>
										<td class="altbg2">
											<input type="text" name="u.xueLi" value="${u.xueLi}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="20%">
											<b>隶属部门:</b>
										</td>
										<td class="altbg2">
											<input type="text" name="u.userTeam" value="${u.userTeam}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									
									<tr>
										<td class="altbg1" width="20%">
											<b>密码：</b>
										</td>
										<td class="altbg2">
											<input type="text" name="u.password" value="${u.password}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
									<tr>
										<td class="altbg1" width="20%">
											<b>性别：</b>
										</td>
										<td class="altbg2">
											<input type="text" name="u.genarl" value="${u.genarl}" />
										</td>
										<td>
											<span style="color: red"> </span>
										</td>
									</tr>
								</tbody>
							</table>
							<br />
							<center>
								<input class="button" type="button" value="取消"
									onclick="location='zhucelist.action'"/>;

								<input class="button" type="button" value="恢复"
									name="settingsubmit" />
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
