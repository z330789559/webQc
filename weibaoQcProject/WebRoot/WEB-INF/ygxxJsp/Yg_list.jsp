<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.Timestamp,com.weibao.entity.YuangongXinxi.*" %>
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
										<a href='#'>人员信息管理系统</a>&nbsp;/&nbsp;
										<a href='#'>供电项目部人员信息</a>&nbsp;/&nbsp;<font size="2" color="red">
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
                      <form action="ygXuanZhong.action" method="post" >
						<table class="tableborder" cellSpacing="0" cellPadding="0"
							width="100%" border="0" align="center">
							<tbody>
								<tr class="header">
								   <td class="altbg1" width="5%">
										<b>选择</B>
									</td>
									<td class="altbg1" width="5%">
										<b>编号</B>
									</td>
									<td class="altbg1" width="5%">
										<b>姓名</b>
									</td>
									
									<td class="altbg1" width="5%">
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
									
									<td class="altbg1" width="5%">
										<b> 隶属部门</b>
									</td>
									<td class="altbg1" width="5%">
										<b>民族</b>
									</td>
									<td class="altbg1" width="10%">
										<b>籍贯</b>
									</td>
									
									<td class="altbg1" width="5%">
										<b>家庭住址</b>
									</td>
									<td class="altbg1" width="10%">
										<b>操作</b>
									</td>
									<td class="altbg1" width="10%">
									   <b>备注</b>
									</td>
								</tr>
							</tbody>
							<tbody>
							
								<s:iterator value="ygxxList">
								<!--
								    List<Gongqiju>gqjList= list<Gongqiju>request.getAttribute("gqjList");
								  for(int i=0;i<gqj.size();i++){
								    Gongqiju gqj=gqjList.get(i);
								  }
								  
								   ---->
								<tr>
											<td class="altbg2" align="center">
												<input type="checkbox" name="ygs" value="${yg_id}" />
											</td>
											<td class="altbg2" align="center">
												<a href="ygDtail.action?ygid=${yg_id}"><b><s:property
															value="yg_id"/></b></a>
											</td>

											<td class="altbg2" align="center">
												<b><s:property value="ygName" /> </b>
												</td>
											<td class="altbg2" align="center">
												<b><s:property value="ygAge" /> </b>
											</td>
											<td class="altbg2" align="center">
												<b><s:property value="ygGeneral" /> </b>
											</td>
											<td class="altbg2" align="center">
												<b><s:property value="ygXueLi" /> </b>
												 <!-- -如何变为红色 
												 String msg1=(String)request.getAttribute("date_erro",gqj.getId());
												 -->
												 <!-- <
												     =(msg1=null?""msg)
												 >-- -->

											</td>
											<td class="altbg2" align="center">
												<b><s:property value="ygSchool" /> </b>
											</td>
											<td class="altbg2" align="center">
												<b><s:property value="ygTeam" /> </b>
											</td>
											
											<td class="altbg2" align="center">
												<b><s:property value="ygMinZu" /> </b>
											</td>
											
											<td class="altbg2" align="center">
												<b> <s:property value="ygJiguan" /></b>
											<br></td>
											
											<td class="altbg2" align="center">
												<b> <s:property value="ygAddress" /></b>
											<br></td>
										
											<td class="altbg2" align="center">
								       <a href="javascript:void(0);" class="delete " data-id="${yg_id}" onclick=" deleteRow(${yg_id});">删除</a>
								       &nbsp;<a href="ygDtail.action?yg_id=${yg_id}">更新</a> 
								       <a href="cartSave.action?yg_id=${yg_id}">过期选中</a> 
							        </td>
									<td class="altbg2" style="width:40px;" align="center">
											<a href="ygLookone.action?yg_id=${yg_id}">详细信息 </a>
											
											
											<span style="color:red;">
												 
											</span>
										</td>
										</tr>
							 
							</s:iterator>
						</tbody>
						</table>
					
						<br />
						<center>
							    <input class="button" type="button" value="查看过期列表"
								name="settingsubmit" onclick="location = 'CartList.action';">
								<input type="button" class="button" 
						        value="添加表计" name="settingsubmit" onclick="location='addYg.action'"/>
						        <input type="submit" class="button" 
						        value="批量删除" name="settingsubmit" />
						
						</center>
					</form>	
					</td>
				</tr>
			</tbody>
		</table>
		<script>
		function deleteRow(yg_id){
			
		var y= confirm('是否确认删除?');
		
		if(y){
			location.href="ygDelete.action?yg_id="+yg_id;
		}
		}
		</script>
	</body>
</html>