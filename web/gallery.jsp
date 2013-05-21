<%-- 
    Document   : gallery
    Created on : Dec 13, 2012, 12:35:23 PM
    Author     : adamasbke
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Gallery</title>
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
                <table width="340" border="1">

                    <tr>

                        <td colspan="4" align="center" bgcolor="#000000">MY PHOTO</td>

                    </tr>

                    <tr>

                        <td width="79"><a href="images/acm.JPG"><img src="images/acm - small.JPG" width="75" height="75" /></a></td>

                        <td width="79"><a href="images/calculs2.jpg"><img src="images/calculs2 - small.jpg" width="75" height="75" /></a></td>

                        <td width="79"><a href="images/gym.jpg"><img src="images/gym - small.jpg" width="75" height="75" /></a></td>

                        <td width="79"><a href="images/cisFalcon.JPG"><img src="images/cisFalcon - small.JPG" width="75" height="75" /></a></td>

                    </tr>
                </table>>
            </div>
            <div class="clear"></div>
        </div>
        <%@ include file = "footer.jsp"%>
    </body>
</html>
