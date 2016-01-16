<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<STYLE>
.controlGroup{
width:70%;
margin:20px 0;
}
form{
padding-left:50px;
}
.controlGroup label{
width:20%;
display:inline-block;
text-align:left;
}
.controlGroup input{
width:70%;
padding:10px;
}
.subbtn{
width:30%;
padding:5px;
}
</STYLE>
<title>upload</title>
</head>
<body>
   <h1>  
                  文件上传----
   </h1>
   <form action="upload.action" method="post" theme="xhtml" enctype="multipart/form-data">
   <div class="controlGroup">
    <input type="file" name="some"/>
   </div>
 

      <div class="controlGroup">
       <label for="subject">主题：</label><input type="text" name="subject"/>
      </div>
        <div class="controlGroup">
       <label for="subject">描述：</label><input type="text" name="descript"/>
      </div>
        <div class="controlGroup">
       <label for="subject">备注：</label><input type="text" name="mark"/>
      </div>
       
      <div class="subbtn" align="center">
 <input type="submit" value="提交">
 </div>
   </form>
   </body>
</html>