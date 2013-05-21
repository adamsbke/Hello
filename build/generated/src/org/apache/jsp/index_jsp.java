package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Home</title>\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<h1><a href=\"#\">Adama Coulibaly </a></h1>\n");
      out.write("\t<h4>Temple University</h4>\n");
      out.write("\t<div id=\"menu\">\n");
      out.write("\t\t<a href=\"index.jsp\" class=\"toplinks\">Home</a>\n");
      out.write("                <a href=\"index.jsp\" class=\"toplinks\">About Me</a>\n");
      out.write("                <a href=\"gallery.jsp\" class=\"toplinks\">Gallery</a>\n");
      out.write("                <a href=\"courses.jsp\" class=\"toplinks\">Courses</a>\n");
      out.write("\t\t<a href=\"skills.jsp\" class=\"toplinks\">Skills</a>\n");
      out.write("                <a href=\"experience.jsp\" class=\"toplinks\">Experience</a>\n");
      out.write("                <a href=\"resumeac.pdf\" class=\"toplinks\">Resume</a>\n");
      out.write("\t\t<a href=\"contact.jsp\" class=\"toplinks\">Contact</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"wrapper\"><div class=\"inner_copy\"></div>\n");
      out.write("\t<div id=\"right\">\n");
      out.write("\t\t<h3>News and Updates</h3>\n");
      out.write("\t\t<p><span class=\"date\">Fall 2012</span>\n");
      out.write("                    <ul>\n");
      out.write("\t\t\t<li class=\"first\"><a href=\"http://www.cis.temple.edu/~korsh/CIS8511Syllabus.html\">Programming Technique</a></li>\n");
      out.write("\t\t\t<li><a href=\"http://www.cis.temple.edu/~wolfgang/CIS%204398%20Project%20In%20Computer%20Science.pdf\">Project in Computer Science</a></li>\n");
      out.write("\t\t\t<li><a href=\"https://phys.cst.temple.edu/directory/faculty/borovitskaya.html\">Physics</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("                </p>\n");
      out.write("\t\t<p><span class=\"date\">Spring 2013</span>\n");
      out.write("                    <ul>\n");
      out.write("\t\t\t<li class=\"first\"><a href=\"http://www.cis.temple.edu/~wu/teaching/spring_2012.html\">Distributed Computing</a></li>\n");
      out.write("\t\t\t<li><a href=\"http://www.cis.temple.edu/~wu/teaching/spring_2010.html\">Ad hoc Network</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">Race and Diversity</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("                </p>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"left\">\n");
      out.write("\t\t<h3>ADAMA COULIBALY </h3>\n");
      out.write("\t\t<p> Graduate Student <br> (Research Assistant)<br><br> Mailing address: <br>4423 Brown Street 1 floor <br>Philadelphia, PA 19104,<br><br>Email: adamac at temple dot edu<br><br>Phone: 267-243-3954</P>\n");
      out.write("\n");
      out.write("\t\t<h3>Quick Links</h3>\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li class=\"first\"><a href=\"http://www.temple.edu/cis/\">CIS Department</a></li>\n");
      out.write("\t\t\t<li><a href=\"resumeac.pdf\">My Resume</a></li>\n");
      out.write("\t\t\t<li><a href=\"http://www.cis.temple.edu/~cctan/reu-2012.html\">REU Site</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t<h2></h2>\n");
      out.write("\t\t<p><img src=\"images/p.jpg\" alt=\"\" width=\"180\" height=\"200\" /></p>\n");
      out.write("                <p><br><br><br><br><br><br><br><br><br><br></p>\n");
      out.write("\t\t<h3>About me </h3>\n");
      out.write("\t\t<p>I am in BS/MS CS integrated program in the Department of Computer and Information Sciences at Temple University.  I am in senior fifth year and expected to be graduated with Bachelor of Science in CS in Spring 2013 and Master of Science in CS in Spring 2014. I am currently a Research Assistant in the Center of Networked Computing (CNC) and an active member of Temple University programming Team. I represented the University in 2010 during ACM international collegiate programming Context (ICPC).</p>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\"><div class=\"fleft\">Copyright Adama Coulibaly 2012</div><div class=\"fright\">Software Developer <a href=\"http://www.temple.edu/cis/\" target=\"_blank\">@ College of Sc. & Tech.</a>  The Smart Choice.</div><div class=\"fcenter\">Design by: <a href=\"http://www.templatesperfect.com/\">Templatesperfect.com</a></div></div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
