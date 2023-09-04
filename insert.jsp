<jsp:useBean id="eo" class="ip.SignBean">
<jsp:setProperty name="eo" property="*"/>
</jsp:useBean>
<%
boolean b=eo.store();
if(b)
out.println("<h1><center><b>Record Inserted</b></center></h1>");
else
out.println("<h1><center><b>Record Not Inserted</b></center></h1>");
%>
<br>
<h1><center><a href="insert.html">Home Page</a></center></h1>