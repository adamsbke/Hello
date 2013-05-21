<%-- 
    Document   : shi_lecture
    Created on : Feb 4, 2013, 12:29:45 PM
    Author     : adamasbke
--%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Dr. Shi Lecture</title>
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
                <h3>Professor Yuan Shi Lecture </h3>
                <ul>
                    <li class="first"><a href="http://templecst.hosted.panopto.com/Panopto/Pages/Viewer/Default.aspx?id=63d30297-283c-47d6-8244-1e69cce26e96">lecture 1: Introduction to Static Multiplexing Computing</a>  <a href="http://www.youtube.com/watch?v=ZolH7v8kvI8"> Video</a></li>
                    <li><a href="#">Lecture 2</a></li>
                    <li><a href="#">Lecture 3</a></li>



                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <%@ include file = "footer.jsp"%>
    </body>
</html>
