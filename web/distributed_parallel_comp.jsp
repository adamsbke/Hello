<%--
    Document   : courses
    Created on : Dec 13, 2012, 1:30:39 PM
    Author     : adamasbke
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>Distributed and Parallel Computing</title>
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
                <h3>Distributed and Parallel Computing </h3>
                <ul>
                    <li class="first"><a href="https://computing.llnl.gov/tutorials/parallel_comp/">Introduction to Parallel Computing</a>  <a href="http://www.youtube.com/watch?v=ZolH7v8kvI8"> Video</a></li>
                    <li><a href="https://computing.llnl.gov/tutorials/mpi/">Message Passing Interface (MPI) Tutorial</a></li>
                    <li><a href="http://pdsgroup.hpclab.ceid.upatras.gr/files/CUDA-Parallel-Programming-Tutorial.pdf">Parallel Programming in CUDA</a></li>
                     <li><a href="shi_lecture.jsp">Professor Yuan Shi's Lecture</a></li>



                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <%@ include file = "footer.jsp"%>
    </body>
</html>
