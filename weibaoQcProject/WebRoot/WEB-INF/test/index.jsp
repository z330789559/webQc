<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

 

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

</head>

<body>

<s:form action="ShowAction" method="GET">

  

   <h1>CurrentPage <s:property value="currentPage"/></h1>

  

   <!--show items of this page-->

   <s:iterator value="list" status="status">

        <s:property value="id"/>

        <s:property value="station"/>
        <s:property value="toolName"/>

        <s:property value="toolStyleNo"/>
        <s:property value="toolCardDate"/>

        <s:property value="lendDate"/>
        <s:property value="toolPerson"/>

        <s:property value="toolStyle"/>
        <s:property value="toolShima"/>

        <s:property value="tooldesc"/>
      
        <BR>

   </s:iterator>

            

   <!--define the url of the previous page and next page-->

     <s:url id="url_pre" value="ShowAction.action">

         <s:param name="currentPage" value="currentPage-1"></s:param>

     </s:url>

     <s:url id="url_next" value="ShowAction.action">

         <s:param name="currentPage" value="currentPage+1"></s:param>

     </s:url> 

    

   <!-- use url defined above -->    

   <s:a href="%{url_pre}">Pre</s:a>

  

   <s:iterator value="list2" status="status">

      <s:url id="url" value="ShowAction.action">

      <!-- pass the currentPage parameter -->

         <s:param name="currentPage" value="currentPage"></s:param>

      </s:url>

      <s:a href="%{url}"><s:property value="currentPage"/>&nbsp</s:a>

   </s:iterator>

   <s:a href="%{url_next}">Next</s:a>

</s:form>  

</body>

</html>