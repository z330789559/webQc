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
						以下表计均为中铁电气化局一公司无锡地铁项目部人员信息
					</h1>
					
					<table class="table" align="center" >
						<tr class="table_header">
						   
							<td class="altbg1" width="5%" align="center"><font size="3">
							    编号
							     </font>
							</td>
							 <td class="altbg1" width="10%" align="center"><font size="3">
						          姓名
						          </font>
						    </td>
							<td class="altbg1" width="10%" align="center"><font size="3">
								年龄</font>
							</td >
							<td class="altbg1" width="10%" align="center"><font size="3">
								性别</font>
							</td>
							<td class="altbg1" width="10%" align="center"><font size="3">
								学历</font>
							</td>
							<td class="altbg1" width="10%" align="center"><font size="3">
								毕业学校</font>
							</td>
							<td class="altbg1" width="5%" align="center"><font size="3">
								隶属部门</font>
							</td>
							<td class="altbg1" width="10%" align="center"><font size="3">
								民族</font>
							</td>
							<td class="altbg1" width="5%" align="center"><font size="3">
								籍贯</font>
							</td>
							 <td class="altbg1" width="10%" align="center"><font size="3">
							    家庭住址 </font>
							 </td>
							  <td class="altbg1" width="5%" align="center"><font size="3">
							    备注 </font>
							 </td>
							
						</tr>
						 
						
					<tr class="row">
							<td class="altbg2" align="center">
							  
								<input  name="ygxx.yg_id" value="${ygxx.yg_id}" readonly="readonly" style="background-color: #dddddd"/>
							</td>
						
							<td class="altbg2" align="center">
								<input  name="ygxx.ygName" value="${ygxx.ygName}" readonly="readonly" style="background-color: #dddddd" />
							</td>
							<td class="altbg2" align="center">
								<input  name="ygxx.ygAge" value="${ygxx.ygAge}" readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2" align="center">
									<!-- img/d007/ -->
										<!--<img src="img/d007/" width="200"
											height="150" /> -->
											
											<input  name="ygxx.ygGeneral" value="${ygxx.ygGeneral}" readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2" align="center">
								<input name="ygxx.ygXueLi" value="${ygxx.ygXueLi}" readonly="readonly" style="background-color: #dddddd" />
							</td>
							<td class="altbg2" align="center">
							<input name="ygxx.ygSchool" value="${ygxx.ygSchool}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2" align="center">
								<input type="text" name="ygxx.ygTeam" value="${ygxx.ygTeam}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2" align="center">
								<input type="text" name="ygxx.ygMinZu" value="${ygxx.ygMinZu}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2" align="center">
								<input type="text" name="ygxx.ygJiguan" value="${ygxx.ygJiguan}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2" align="center">
								<input type="text" name="ygxx.ygAddress" value="${ygxx.ygAddress}"  readonly="readonly" style="background-color: #dddddd"/>
							</td>
							<td class="altbg2" align="center">
								<input type="text" name="" value=""  readonly="readonly" style="background-color: #dddddd"/>
							</td>

						</tr>
						
					</table>
					
					<p>
						<input type="button" class="button" 
						value="返回列表" onclick="location='ygList.action'"/>
					</p>
				</div>
			</div>
			<%@include file="footer.jsp" %>
		</div>
	</body>
</html>
