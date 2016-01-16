<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.sql.Timestamp,com.weibao.entity.Gongqiju.*" %>
<jsp:include page="../GongqijuJsp/index.jsp" />
<html>
	<head>
		<meta http-equiv=Content-Type content="text/html; charset=utf-8" />
		<link href="../css/style.css" type="text/css" rel="stylesheet" />
		<style>
		.over{
		background-color: yellow;
		color:#fff;
		}
		</style>
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
									<td><font size="2.5">
										<a href='#'>工器具</a>&nbsp;/&nbsp;
										<a href='#'>工器具查询系统</a>&nbsp;/
                                           <%
		                                   Timestamp date=new Timestamp(System.currentTimeMillis());
		                                    out.print(date);
	                               	        %>
									</font></td>
								</tr>
							</tbody>
						</table>
						<br />
                      <form action="gqjXuanZhong.action" method="post" >
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
										<b>站名</b>
									</td>
									
									<td class="altbg1" width="5%">
										<b>工具名称</b>
									</td>
									
									<td class="altbg1" width="10%">
										<b>工具型号</b>
									</td>
					
									
									<td class="altbg1" width="10%">
										<b>合格证日期</b>
									</td>
									<td class="altbg1" width="5%">
										<b>送检日期</b>
									</td>
									
									<td class="altbg1" width="5%">
										<b> 返回日期</b>
									</td>
									<td class="altbg1" width="5%">
										<b>接收人</b>
									</td>
									<td class="altbg1" width="10%">
										<b>工具位置</b>
									</td>
									
									<td class="altbg1" width="5%">
										<b>是否校验</b>
									</td>
									<td class="altbg1" width="10%">
										<b>描述 </b>
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
							
								<s:iterator value="gqjList">
								<!--
								    List<Gongqiju>gqjList= list<Gongqiju>request.getAttribute("gqjList");
								  for(int i=0;i<gqj.size();i++){
								    Gongqiju gqj=gqjList.get(i);
								  }
								  
								   ---->
								<tr>
											<td class="altbg2" align="center">
												<input type="checkbox" name="gqjs" value="${id}" />
											</td>
											<td class="altbg2" align="center">
												<a href="#?gqjid=${id}"><b><s:property
															value="id"/></b></a>
											</td>

											<td class="altbg2" align="center">
												<b><s:property value="station" /> </b>
												</td>
											<td class="altbg2" align="center">
												<b><s:property value="toolName" /> </b>
											</td>
											<td class="altbg2" align="center">
												<b><s:property value="toolStyleNo" /> </b>
											</td>
											<td data-date="${toolCardDate}" class="altbg2" align="center">
												<b><s:property value="toolCardDate" /> </b>
												 <!-- -如何变为红色 
												 String msg1=(String)request.getAttribute("date_erro",gqj.getId());
												 -->
												 <!-- <
												     =(msg1=null?""msg)
												 >-- -->

											</td>
											<td class="altbg2" align="center">
												<b><s:property value="lendDate" /> </b>
											</td>
											<td class="altbg2" align="center">
												<b><s:property value="comeDate" /> </b>
											</td>
											
											<td class="altbg2" align="center">
												<b><s:property value="toolPerson" /> </b>
											</td>
											
											<td class="altbg2" align="center">
												<b> <s:property value="toolStyle" /></b>
											<br></td>
											
											<td class="altbg2" align="center">
												<b> <s:property value="toolShima" /></b>
											<br></td>
											<td class="altbg2" align="center">
												<b> <s:property value="tooldesc" /></b>
												<br/>
											</td>
											
											<td class="altbg2" align="center">
								       <a href="javascript:void(0);" class="delete " data-id="${id}" onclick=" deleteRow(${id});">删除</a>
								       &nbsp;<a href="gqjDtail.action?id=${id}">更新</a> 
								       <a href="cartSave.action?id=${id}" class="overPeriod">过期选中</a> 
							        </td>
									<td class="altbg2" style="width:40px;" align="center">
											<a href="gqjLookone.action?Id=${id}">详细信息 </a>
											
											
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
						        value="添加表计" name="settingsubmit" onclick="location='addGqj.action'"/>
						        <input type="submit" class="button" 
						        value="批量删除" name="settingsubmit" />
						
						</center>
					</form>	
					</td>
				</tr>
			</tbody>
		</table>
		<a href="cartGOSave.action">go</a>
		<a href="../up/uploadform.action">上传</a>
		<SCRIPT type="text/javascript" src="../js/jquery.js"></SCRIPT>
		<script>
		function deleteRow(id){
			
		var y= confirm('是否确认删除?');
		
		if(y){
			location.href="gqjDelete.action?id="+id;
		}
		}

		$("td[data-date]").each(function(index,item) {
			console.log(index,item);
			var $this=$(item);
			var s=$this.attr("data-date").split("-");
			var d=new Date(s[0],s[1]-1,s[2]);
	
		var dur=	new Date().getTime()-d.getTime();
		 var yeah=dur/1000/60/60/24/365;
		 if(yeah > 1){
			 $this.closest("tr").find(".overPeriod").addClass("over");
		 }else{
			 $this.closest("tr").find(".overPeriod").hide();
		 }
			
		})
		</script>
	</body>
</html>