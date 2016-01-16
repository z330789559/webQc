<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.Timestamp"%>
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
				
							<table class="tableborder" cellSpacing="0" cellPadding="0"
								width="100%" border="0">
								<tbody>
									<tr class="header">
										
										<td class="altbg1" width="10%">
											<b>编号</b>
										</td>

										<td class="altbg1" width="10%">
											<b>用户ID</b>
											</td>
											<td class="altbg1" width="40%">
											<b>标题</b>
										 </td>
										<td class="altbg1" width="40%">
											<b>文件名称</b>
										 </td>
										<td class="altbg1" width="20%">
											<b>文件描述</b>
										</td>
										<td class="altbg1" width="20%">
											<b>备注</b>
										</td>
					                       <td class="altbg1" width="20%">
											<b>下载</b>
										</td>
									</tr>
								</tbody>
								<tbody>
									<s:iterator value="chaKanFiles">
										<tr>
											
											<td class="altbg2" >
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property  value="file_id" /></b>
											</td>

											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="user_id" /> </b>
												</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="theme" /> </b>
											</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="fileName" /> </b>
											</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="descript" /> </b>
											</td>
											<td class="altbg2">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><s:property value="beizhu" /> </b>
											</td>
											
											<td class="altbg2">
											&nbsp;&nbsp;<a href="javascript:void(0);" class="delete " data-id="${fileName}" onclick=" predownload(this);">下载</a>
										    </td>
										</tr>
									</s:iterator>
									
								</tbody>
							</table>
							<p>${fileName}</p>
							<br />
							<center>
								
								<input class="button" type="button" value="亲，联系我"
									onclick="location='error.action'"/>;
							</center>
				
					</td>
				</tr>
			</tbody>
		</table>
		<script type="text/javascript" src="../js/jquery.js"></script>
		<script>
		function predownload(o){
		var fileName=  $(o).attr("data-id")

			location.href="downFile.action?name="+fileName;
		}

		</script>

	</body>
</html>
