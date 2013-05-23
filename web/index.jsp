<%-- 
    Document   : index
    Created on : Dec 13, 2012, 11:04:45 AM
    Author     : adamasbke
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Home</title>
<link href="styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="header">
	<h1><a href="#">Adama Coulibaly </a></h1>
	<h4>Temple University</h4>
        <%@ include file = "menu.jsp"%>
</div>
<div id="wrapper"><div class="inner_copy"></div>

	<%@ include file = "right_content.jsp"%>

        <%@ include file = "left_content.jsp"%>
        
	<div id="content">
		<h2></h2>
		<p><img src="images/p.jpg" alt="" width="180" height="200" /></p>
                <p><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>></p>
		<h3>About me change on master branch </h3>
		<p>I am in BS/MS CS integrated program in the Department of Computer and Information Sciences at Temple University.  I am in senior fifth year and expected to be graduated with Bachelor of Science in CS in Spring 2013 and Master of Science in CS in Spring 2014. I am currently a Research Assistant in the Center of Networked Computing (CNC) and an active member of Temple University programming Team. I represented the University in 2010 during ACM international collegiate programming Context (ICPC).</p>

	</div>
	<div class="clear"></div>
</div>
<%@ include file = "footer.jsp"%>
</body>
</html>
