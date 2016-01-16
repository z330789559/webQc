<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>

<html>
	<head>
		<title>详细信息</title>
	    <meta http-equiv=Content-Type content="text/html; charset=utf-8" />
		<link href="../css/style.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<%@include file="head.jsp" %>
				<div id="content" align="center">
					<p id="whereami">
					</p>
					<h1>
						以下表计均为中铁电气化局一公司无锡地铁项目部监制，请你浏览
					</h1>
					
					<table class="table" align="center" >
						<tr class="table_header">
						   
							<td class="altbg1" width="5%" align="center"><font size="3">
							    编号
							     </font>
							</td>
							 <td class="altbg1" width="10%" align="center"><font size="3">
						          部门
						          </font>
						    </td>
							<td class="altbg1" width="10%" align="center"><font size="3">
								站名</font>
							</td >
							<td class="altbg1" width="10%" align="center"><font size="3">
								表名</font>
							</td>
							<td class="altbg1" width="15%" align="center"><font size="3">
								工器具型号</font>
							</td>
							<td class="altbg1" width="10%" align="center"><font size="3">
								合格证日期</font>
							</td>
							<td class="altbg1" width="5%" align="center"><font size="3">
								送检日期</font>
							</td>
							<td class="altbg1" width="10%" align="center"><font size="3">
								到站日期</font>
							</td>
							<td class="altbg1" width="5%" align="center"><font size="3">
								接收人</font>
							</td>
							 <td class="altbg1" width="10%" align="center"><font size="3">
							    工器具位置 </font>
							 </td>
							<td class="altbg1" width="10%" align="center"><font size="3">
							    是否已校验 </font>
							</td>
							<td class="altbg1" width="10%" align="center"><font size="3">
							    具体描述</font>
							</td>
						</tr>
						 
						
					<tr class="row">
							<td class="altbg2" >
							  
								<input  name="gqj.id" value="${gqj.id}" readonly="readonly" style="background-color: #dddddd"/>
							</td>
						
							<td class="altbg2">
								<input  name="gqj.station" value="${gqj.station}" readonly="readonly" style="background-color: #dddddd" />
							</td>
							<td class="altbg2">
								<input  name="gqj.toolName" value="${gqj.toolName}" readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2">
									<!-- img/d007/ -->
										<!--<img src="img/d007/" width="200"
											height="150" /> -->
											
											<input  name="gqj.toolStyleNo" value="${gqj.toolStyleNo}" readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2">
								<input name="gqj.toolCardDate" value="${gqj.toolCardDate}" readonly="readonly" style="background-color: #dddddd" />
							</td>
							<td class="altbg2">
							<input name="gqj.lendDate" value="${gqj.lendDate}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2">
								<input type="text" name="gqj.comeDate" value="${gqj.comeDate}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2">
								<input type="text" name="gqj.toolPerson" value="${gqj.toolPerson}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2">
								<input type="text" name="gqj.toolStyle" value="${gqj.toolStyle}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2">
								<input type="text" name="gqj.toolShima" value="${gqj.toolShima}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							
							<td class="altbg2">
								<input type="text" name="gqj.tooldesc" value="${gqj.tooldesc}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
					
						</tr>
						
					</table>
					
					<p>
						<input type="button" class="button" 
						value="返回列表" onclick="location='gqjList.action'"/>
					</p>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
	</body>
</html>
