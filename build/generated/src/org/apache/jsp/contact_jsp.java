package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html> <!-- xmlns=\"http://www.w3.org/1999/xhtml\">-->\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("\n");
      out.write("        <meta name=\"generator\" content=\"Wufoo\"/>\n");
      out.write("        <meta name=\"robots\" content=\"index, follow\"/>\n");
      out.write("        <title>Contact</title>\n");
      out.write("\n");
      out.write("        <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <link href=\"css/form.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\" >\n");
      out.write("\n");
      out.write("            <h1><a href=\"#\">Adama Coulibaly </a></h1>\n");
      out.write("            <h4>Temple University</h4>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("               <a href=\"index.jsp\" class=\"toplinks\">Home</a>\n");
      out.write("                <a href=\"#\" class=\"toplinks\">About Me</a>\n");
      out.write("                <a href=\"gallery.jsp\" class=\"toplinks\">Gallery</a>\n");
      out.write("                <a href=\"courses.jsp\" class=\"toplinks\">Courses</a>\n");
      out.write("\t\t<a href=\"skills.jsp\" class=\"toplinks\">Skills</a>\n");
      out.write("                <a href=\"experience.jsp\" class=\"toplinks\">Experience</a>\n");
      out.write("                <a href=\"resumeac.pdf\" class=\"toplinks\">Resume</a>\n");
      out.write("\t\t<a href=\"contact.jsp\" class=\"toplinks\">Contact</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"wrapper\"><div class=\"inner_copy\"></div>\n");
      out.write("            <div id=\"right\">\n");
      out.write("               <h3>News and Updates</h3>\n");
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
      out.write("                </p> \n");
      out.write("            </div>\n");
      out.write("            <div id=\"left\">\n");
      out.write("               <h3>ADAMA COULIBALY </h3>\n");
      out.write("\t\t<p> Graduate Student <br> (Research Assistant)<br><br> Mailing address: <br>4423 Brown Street 1 floor <br>Philadelphia, PA 19104,<br><br>Email: adamac at temple dot edu<br><br>Phone: 267-243-3954</P>\n");
      out.write("\n");
      out.write("                <h3>Quick Links Here </h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"first\"><a href=\"http://www.temple.edu/cis/\">CIS Department</a></li>\n");
      out.write("\t\t    <li><a href=\"resumeac.pdf\">My Resume</a></li>\n");
      out.write("\t\t    <li><a href=\"http://www.cis.temple.edu/~cctan/reu-2012.html\">REU Site</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("              <form id=\"form105\" name=\"form105\" class=\"wufoo topLabel page\" autocomplete=\"off\" enctype=\"multipart/form-data\" method=\"post\" action=\"http://www.temple.edu/cgi-bin/mail?tuc65784@temple.edu\">\n");
      out.write("\n");
      out.write("<header id=\"header\" class=\"info\">\n");
      out.write("<h2>Send Feedback</h2>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("\n");
      out.write("<li id=\"foli10\" class=\"notranslate      \">\n");
      out.write("<label class=\"desc\" id=\"title10\" for=\"Field10\">\n");
      out.write("Name\n");
      out.write("</label>\n");
      out.write("<span>\n");
      out.write("<input id=\"Field10\" name=\"Field10\" type=\"text\" class=\"field text fn\" value=\"\" size=\"8\" tabindex=\"1\" />\n");
      out.write("<label for=\"Field10\">First</label>\n");
      out.write("</span>\n");
      out.write("<span>\n");
      out.write("<input id=\"Field11\" name=\"Field11\" type=\"text\" class=\"field text ln\" value=\"\" size=\"14\" tabindex=\"2\" />\n");
      out.write("<label for=\"Field11\">Last</label>\n");
      out.write("</span>\n");
      out.write("</li>\n");
      out.write("<li id=\"foli2\" class=\"notranslate      \">\n");
      out.write("<label class=\"desc\" id=\"title2\" for=\"Field2\">\n");
      out.write("Email\n");
      out.write("</label>\n");
      out.write("<div>\n");
      out.write("<input id=\"Field2\" name=\"Field2\" type=\"email\" spellcheck=\"false\" class=\"field text medium\" value=\"\" maxlength=\"255\" tabindex=\"3\" />\n");
      out.write("</div>\n");
      out.write("</li>\n");
      out.write("<li id=\"foli3\" class=\"phone notranslate      \">\n");
      out.write("<label class=\"desc\" id=\"title3\" for=\"Field3\">\n");
      out.write("Phone Number\n");
      out.write("</label>\n");
      out.write("<span>\n");
      out.write("<input id=\"Field3\" name=\"Field3\" type=\"tel\" class=\"field text\" value=\"\" size=\"3\" maxlength=\"3\" tabindex=\"4\" />\n");
      out.write("<label for=\"Field3\">###</label>\n");
      out.write("</span>\n");
      out.write("<span class=\"symbol\">-</span>\n");
      out.write("<span>\n");
      out.write("<input id=\"Field3-1\" name=\"Field3-1\" type=\"tel\" class=\"field text\" value=\"\" size=\"3\" maxlength=\"3\" tabindex=\"5\" />\n");
      out.write("<label for=\"Field3-1\">###</label>\n");
      out.write("</span>\n");
      out.write("<span class=\"symbol\">-</span>\n");
      out.write("<span>\n");
      out.write(" <input id=\"Field3-2\" name=\"Field3-2\" type=\"tel\" class=\"field text\" value=\"\" size=\"4\" maxlength=\"4\" tabindex=\"6\" />\n");
      out.write("<label for=\"Field3-2\">####</label>\n");
      out.write("</span>\n");
      out.write("</li>\n");
      out.write("<li id=\"foli4\" class=\"complex notranslate      \">\n");
      out.write("<label class=\"desc\" id=\"title4\" for=\"Field4\">\n");
      out.write("Address\n");
      out.write("</label>\n");
      out.write("<div>\n");
      out.write("<span class=\"full addr1\">\n");
      out.write("<input id=\"Field4\" name=\"Field4\" type=\"text\" class=\"field text addr\" value=\"\" tabindex=\"7\" />\n");
      out.write("<label for=\"Field4\">Street Address</label>\n");
      out.write("</span>\n");
      out.write("<span class=\"full addr2\">\n");
      out.write("<input id=\"Field5\" name=\"Field5\" type=\"text\" class=\"field text addr\" value=\"\" tabindex=\"8\" />\n");
      out.write("<label for=\"Field5\">Address Line 2</label>\n");
      out.write("</span>\n");
      out.write("<span class=\"left city\">\n");
      out.write("<input id=\"Field6\" name=\"Field6\" type=\"text\" class=\"field text addr\" value=\"\" tabindex=\"9\" />\n");
      out.write("<label for=\"Field6\">City</label>\n");
      out.write("</span>\n");
      out.write("<span class=\"right state\">\n");
      out.write("<input id=\"Field7\" name=\"Field7\" type=\"text\" class=\"field text addr\" value=\"\" tabindex=\"10\" />\n");
      out.write("<label for=\"Field7\">State / Province / Region</label>\n");
      out.write("</span>\n");
      out.write("<span class=\"left zip\">\n");
      out.write("<input id=\"Field8\" name=\"Field8\" type=\"text\" class=\"field text addr\" value=\"\" maxlength=\"15\" tabindex=\"11\" />\n");
      out.write("<label for=\"Field8\">Postal / Zip Code</label>\n");
      out.write("</span>\n");
      out.write("<span class=\"right country\">\n");
      out.write("<select id=\"Field9\" name=\"Field9\" class=\"field select addr\" tabindex=\"12\" >\n");
      out.write("<option value=\"\" selected=\"selected\"></option>\n");
      out.write("<option value=\"United States\" >United States</option>\n");
      out.write("<option value=\"United Kingdom\" >United Kingdom</option>\n");
      out.write("<option value=\"Australia\" >Australia</option>\n");
      out.write("<option value=\"Canada\" >Canada</option>\n");
      out.write("<option value=\"France\" >France</option>\n");
      out.write("<option value=\"New Zealand\" >New Zealand</option>\n");
      out.write("<option value=\"India\" >India</option>\n");
      out.write("<option value=\"Brazil\" >Brazil</option>\n");
      out.write("<option value=\"----\" >----</option>\n");
      out.write("<option value=\"Afghanistan\" >Afghanistan</option>\n");
      out.write("<option value=\"Åland Islands\" >Åland Islands</option>\n");
      out.write("<option value=\"Albania\" >Albania</option>\n");
      out.write("<option value=\"Algeria\" >Algeria</option>\n");
      out.write("<option value=\"American Samoa\" >American Samoa</option>\n");
      out.write("<option value=\"Andorra\" >Andorra</option>\n");
      out.write("<option value=\"Angola\" >Angola</option>\n");
      out.write("<option value=\"Anguilla\" >Anguilla</option>\n");
      out.write("<option value=\"Antarctica\" >Antarctica</option>\n");
      out.write("<option value=\"Antigua and Barbuda\" >Antigua and Barbuda</option>\n");
      out.write("<option value=\"Argentina\" >Argentina</option>\n");
      out.write("<option value=\"Armenia\" >Armenia</option>\n");
      out.write("<option value=\"Aruba\" >Aruba</option>\n");
      out.write("<option value=\"Austria\" >Austria</option>\n");
      out.write("<option value=\"Azerbaijan\" >Azerbaijan</option>\n");
      out.write("<option value=\"Bahamas\" >Bahamas</option>\n");
      out.write("<option value=\"Bahrain\" >Bahrain</option>\n");
      out.write("<option value=\"Bangladesh\" >Bangladesh</option>\n");
      out.write("<option value=\"Barbados\" >Barbados</option>\n");
      out.write("<option value=\"Belarus\" >Belarus</option>\n");
      out.write("<option value=\"Belgium\" >Belgium</option>\n");
      out.write("<option value=\"Belize\" >Belize</option>\n");
      out.write("<option value=\"Benin\" >Benin</option>\n");
      out.write("<option value=\"Bermuda\" >Bermuda</option>\n");
      out.write("<option value=\"Bhutan\" >Bhutan</option>\n");
      out.write("<option value=\"Bolivia\" >Bolivia</option>\n");
      out.write("<option value=\"Bosnia and Herzegovina\" >Bosnia and Herzegovina</option>\n");
      out.write("<option value=\"Botswana\" >Botswana</option>\n");
      out.write("<option value=\"British Indian Ocean Territory\" >British Indian Ocean Territory</option>\n");
      out.write("<option value=\"Brunei Darussalam\" >Brunei Darussalam</option>\n");
      out.write("<option value=\"Bulgaria\" >Bulgaria</option>\n");
      out.write("<option value=\"Burkina Faso\" >Burkina Faso</option>\n");
      out.write("<option value=\"Burundi\" >Burundi</option>\n");
      out.write("<option value=\"Cambodia\" >Cambodia</option>\n");
      out.write("<option value=\"Cameroon\" >Cameroon</option>\n");
      out.write("<option value=\"Cape Verde\" >Cape Verde</option>\n");
      out.write("<option value=\"Cayman Islands\" >Cayman Islands</option>\n");
      out.write("<option value=\"Central African Republic\" >Central African Republic</option>\n");
      out.write("<option value=\"Chad\" >Chad</option>\n");
      out.write("<option value=\"Chile\" >Chile</option>\n");
      out.write("<option value=\"China\" >China</option>\n");
      out.write("<option value=\"Colombia\" >Colombia</option>\n");
      out.write("<option value=\"Comoros\" >Comoros</option>\n");
      out.write("<option value=\"Democratic Republic of the Congo\" >Democratic Republic of the Congo</option>\n");
      out.write("<option value=\"Republic of the Congo\" >Republic of the Congo</option>\n");
      out.write("<option value=\"Cook Islands\" >Cook Islands</option>\n");
      out.write("<option value=\"Costa Rica\" >Costa Rica</option>\n");
      out.write("<option value=\"C&ocirc;te d'Ivoire\" >C&ocirc;te d'Ivoire</option>\n");
      out.write("<option value=\"Croatia\" >Croatia</option>\n");
      out.write("<option value=\"Cuba\" >Cuba</option>\n");
      out.write("<option value=\"Cyprus\" >Cyprus</option>\n");
      out.write("<option value=\"Czech Republic\" >Czech Republic</option>\n");
      out.write("<option value=\"Denmark\" >Denmark</option>\n");
      out.write("<option value=\"Djibouti\" >Djibouti</option>\n");
      out.write("<option value=\"Dominica\" >Dominica</option>\n");
      out.write("<option value=\"Dominican Republic\" >Dominican Republic</option>\n");
      out.write("<option value=\"East Timor\" >East Timor</option>\n");
      out.write("<option value=\"Ecuador\" >Ecuador</option>\n");
      out.write("<option value=\"Egypt\" >Egypt</option>\n");
      out.write("<option value=\"El Salvador\" >El Salvador</option>\n");
      out.write("<option value=\"Equatorial Guinea\" >Equatorial Guinea</option>\n");
      out.write("<option value=\"Eritrea\" >Eritrea</option>\n");
      out.write("<option value=\"Estonia\" >Estonia</option>\n");
      out.write("<option value=\"Ethiopia\" >Ethiopia</option>\n");
      out.write("<option value=\"Faroe Islands\" >Faroe Islands</option>\n");
      out.write("<option value=\"Fiji\" >Fiji</option>\n");
      out.write("<option value=\"Finland\" >Finland</option>\n");
      out.write("<option value=\"Gabon\" >Gabon</option>\n");
      out.write("<option value=\"Gambia\" >Gambia</option>\n");
      out.write("<option value=\"Georgia\" >Georgia</option>\n");
      out.write("<option value=\"Germany\" >Germany</option>\n");
      out.write("<option value=\"Ghana\" >Ghana</option>\n");
      out.write("<option value=\"Gibraltar\" >Gibraltar</option>\n");
      out.write("<option value=\"Greece\" >Greece</option>\n");
      out.write("<option value=\"Grenada\" >Grenada</option>\n");
      out.write("<option value=\"Guatemala\" >Guatemala</option>\n");
      out.write("<option value=\"Guinea\" >Guinea</option>\n");
      out.write("<option value=\"Guinea-Bissau\" >Guinea-Bissau</option>\n");
      out.write("<option value=\"Guyana\" >Guyana</option>\n");
      out.write("<option value=\"Haiti\" >Haiti</option>\n");
      out.write("<option value=\"Honduras\" >Honduras</option>\n");
      out.write("<option value=\"Hong Kong\" >Hong Kong</option>\n");
      out.write("<option value=\"Hungary\" >Hungary</option>\n");
      out.write("<option value=\"Iceland\" >Iceland</option>\n");
      out.write("<option value=\"Indonesia\" >Indonesia</option>\n");
      out.write("<option value=\"Iran\" >Iran</option>\n");
      out.write("<option value=\"Iraq\" >Iraq</option>\n");
      out.write("<option value=\"Ireland\" >Ireland</option>\n");
      out.write("<option value=\"Israel\" >Israel</option>\n");
      out.write("<option value=\"Italy\" >Italy</option>\n");
      out.write("<option value=\"Jamaica\" >Jamaica</option>\n");
      out.write("<option value=\"Japan\" >Japan</option>\n");
      out.write("<option value=\"Jordan\" >Jordan</option>\n");
      out.write("<option value=\"Kazakhstan\" >Kazakhstan</option>\n");
      out.write("<option value=\"Kenya\" >Kenya</option>\n");
      out.write("<option value=\"Kiribati\" >Kiribati</option>\n");
      out.write("<option value=\"North Korea\" >North Korea</option>\n");
      out.write("<option value=\"South Korea\" >South Korea</option>\n");
      out.write("<option value=\"Kuwait\" >Kuwait</option>\n");
      out.write("<option value=\"Kyrgyzstan\" >Kyrgyzstan</option>\n");
      out.write("<option value=\"Laos\" >Laos</option>\n");
      out.write("<option value=\"Latvia\" >Latvia</option>\n");
      out.write("<option value=\"Lebanon\" >Lebanon</option>\n");
      out.write("<option value=\"Lesotho\" >Lesotho</option>\n");
      out.write("<option value=\"Liberia\" >Liberia</option>\n");
      out.write("<option value=\"Libya\" >Libya</option>\n");
      out.write("<option value=\"Liechtenstein\" >Liechtenstein</option>\n");
      out.write("<option value=\"Lithuania\" >Lithuania</option>\n");
      out.write("<option value=\"Luxembourg\" >Luxembourg</option>\n");
      out.write("<option value=\"Macedonia\" >Macedonia</option>\n");
      out.write("<option value=\"Madagascar\" >Madagascar</option>\n");
      out.write("<option value=\"Malawi\" >Malawi</option>\n");
      out.write("<option value=\"Malaysia\" >Malaysia</option>\n");
      out.write("<option value=\"Maldives\" >Maldives</option>\n");
      out.write("<option value=\"Mali\" >Mali</option>\n");
      out.write("<option value=\"Malta\" >Malta</option>\n");
      out.write("<option value=\"Marshall Islands\" >Marshall Islands</option>\n");
      out.write("<option value=\"Mauritania\" >Mauritania</option>\n");
      out.write("<option value=\"Mauritius\" >Mauritius</option>\n");
      out.write("<option value=\"Mexico\" >Mexico</option>\n");
      out.write("<option value=\"Micronesia\" >Micronesia</option>\n");
      out.write("<option value=\"Moldova\" >Moldova</option>\n");
      out.write("<option value=\"Monaco\" >Monaco</option>\n");
      out.write("<option value=\"Mongolia\" >Mongolia</option>\n");
      out.write("<option value=\"Montenegro\" >Montenegro</option>\n");
      out.write("<option value=\"Morocco\" >Morocco</option>\n");
      out.write("<option value=\"Mozambique\" >Mozambique</option>\n");
      out.write("<option value=\"Myanmar\" >Myanmar</option>\n");
      out.write("<option value=\"Namibia\" >Namibia</option>\n");
      out.write("<option value=\"Nauru\" >Nauru</option>\n");
      out.write("<option value=\"Nepal\" >Nepal</option>\n");
      out.write("<option value=\"Netherlands\" >Netherlands</option>\n");
      out.write("<option value=\"Netherlands Antilles\" >Netherlands Antilles</option>\n");
      out.write("<option value=\"Nicaragua\" >Nicaragua</option>\n");
      out.write("<option value=\"Niger\" >Niger</option>\n");
      out.write("<option value=\"Nigeria\" >Nigeria</option>\n");
      out.write("<option value=\"Norway\" >Norway</option>\n");
      out.write("<option value=\"Oman\" >Oman</option>\n");
      out.write("<option value=\"Pakistan\" >Pakistan</option>\n");
      out.write("<option value=\"Palau\" >Palau</option>\n");
      out.write("<option value=\"Palestine\" >Palestine</option>\n");
      out.write("<option value=\"Panama\" >Panama</option>\n");
      out.write("<option value=\"Papua New Guinea\" >Papua New Guinea</option>\n");
      out.write("<option value=\"Paraguay\" >Paraguay</option>\n");
      out.write("<option value=\"Peru\" >Peru</option>\n");
      out.write("<option value=\"Philippines\" >Philippines</option>\n");
      out.write("<option value=\"Poland\" >Poland</option>\n");
      out.write("<option value=\"Portugal\" >Portugal</option>\n");
      out.write("<option value=\"Puerto Rico\" >Puerto Rico</option>\n");
      out.write("<option value=\"Qatar\" >Qatar</option>\n");
      out.write("<option value=\"Romania\" >Romania</option>\n");
      out.write("<option value=\"Russia\" >Russia</option>\n");
      out.write("<option value=\"Rwanda\" >Rwanda</option>\n");
      out.write("<option value=\"Saint Kitts and Nevis\" >Saint Kitts and Nevis</option>\n");
      out.write("<option value=\"Saint Lucia\" >Saint Lucia</option>\n");
      out.write("<option value=\"Saint Vincent and the Grenadines\" >Saint Vincent and the Grenadines</option>\n");
      out.write("<option value=\"Samoa\" >Samoa</option>\n");
      out.write("<option value=\"San Marino\" >San Marino</option>\n");
      out.write("<option value=\"Sao Tome and Principe\" >Sao Tome and Principe</option>\n");
      out.write("<option value=\"Saudi Arabia\" >Saudi Arabia</option>\n");
      out.write("<option value=\"Senegal\" >Senegal</option>\n");
      out.write("<option value=\"Serbia and Montenegro\" >Serbia and Montenegro</option>\n");
      out.write("<option value=\"Seychelles\" >Seychelles</option>\n");
      out.write("<option value=\"Sierra Leone\" >Sierra Leone</option>\n");
      out.write("<option value=\"Singapore\" >Singapore</option>\n");
      out.write("<option value=\"Slovakia\" >Slovakia</option>\n");
      out.write("<option value=\"Slovenia\" >Slovenia</option>\n");
      out.write("<option value=\"Solomon Islands\" >Solomon Islands</option>\n");
      out.write("<option value=\"Somalia\" >Somalia</option>\n");
      out.write("<option value=\"South Africa\" >South Africa</option>\n");
      out.write("<option value=\"Spain\" >Spain</option>\n");
      out.write("<option value=\"Sri Lanka\" >Sri Lanka</option>\n");
      out.write("<option value=\"Sudan\" >Sudan</option>\n");
      out.write("<option value=\"Suriname\" >Suriname</option>\n");
      out.write("<option value=\"Swaziland\" >Swaziland</option>\n");
      out.write("<option value=\"Sweden\" >Sweden</option>\n");
      out.write("<option value=\"Switzerland\" >Switzerland</option>\n");
      out.write("<option value=\"Syria\" >Syria</option>\n");
      out.write("<option value=\"Taiwan\" >Taiwan</option>\n");
      out.write("<option value=\"Tajikistan\" >Tajikistan</option>\n");
      out.write("<option value=\"Tanzania\" >Tanzania</option>\n");
      out.write("<option value=\"Thailand\" >Thailand</option>\n");
      out.write("<option value=\"Togo\" >Togo</option>\n");
      out.write("<option value=\"Tonga\" >Tonga</option>\n");
      out.write("<option value=\"Trinidad and Tobago\" >Trinidad and Tobago</option>\n");
      out.write("<option value=\"Tunisia\" >Tunisia</option>\n");
      out.write("<option value=\"Turkey\" >Turkey</option>\n");
      out.write("<option value=\"Turkmenistan\" >Turkmenistan</option>\n");
      out.write("<option value=\"Tuvalu\" >Tuvalu</option>\n");
      out.write("<option value=\"Uganda\" >Uganda</option>\n");
      out.write("<option value=\"Ukraine\" >Ukraine</option>\n");
      out.write("<option value=\"United Arab Emirates\" >United Arab Emirates</option>\n");
      out.write("<option value=\"United States Minor Outlying Islands\" >United States Minor Outlying Islands</option>\n");
      out.write("<option value=\"Uruguay\" >Uruguay</option>\n");
      out.write("<option value=\"Uzbekistan\" >Uzbekistan</option>\n");
      out.write("<option value=\"Vanuatu\" >Vanuatu</option>\n");
      out.write("<option value=\"Vatican City\" >Vatican City</option>\n");
      out.write("<option value=\"Venezuela\" >Venezuela</option>\n");
      out.write("<option value=\"Vietnam\" >Vietnam</option>\n");
      out.write("<option value=\"Virgin Islands, British\" >Virgin Islands, British</option>\n");
      out.write("<option value=\"Virgin Islands, U.S.\" >Virgin Islands, U.S.</option>\n");
      out.write("<option value=\"Yemen\" >Yemen</option>\n");
      out.write("<option value=\"Zambia\" >Zambia</option>\n");
      out.write("<option value=\"Zimbabwe\" >Zimbabwe</option>\n");
      out.write("</select>\n");
      out.write("<label for=\"Field9\">Country</label>\n");
      out.write("</span>\n");
      out.write("</div>\n");
      out.write("</li>\n");
      out.write("<li id=\"foli12\" class=\"notranslate      \">\n");
      out.write("<fieldset>\n");
      out.write("<![if !IE | (gte IE 8)]>\n");
      out.write("<legend id=\"title12\" class=\"desc\">\n");
      out.write("Relationship\n");
      out.write("</legend>\n");
      out.write("<![endif]>\n");
      out.write("<!--[if lt IE 8]>\n");
      out.write("<label id=\"title12\" class=\"desc\">\n");
      out.write("Relationship\n");
      out.write("</label>\n");
      out.write("<![endif]-->\n");
      out.write("<div>\n");
      out.write("<input id=\"radioDefault_12\" name=\"Field12\" type=\"hidden\" value=\"\" />\n");
      out.write("<span>\n");
      out.write("<input id=\"Field12_0\" name=\"Field12\" type=\"radio\" class=\"field radio\" value=\"Sibling\" tabindex=\"13\" checked=\"checked\"\n");
      out.write("/>\n");
      out.write("<label class=\"choice\" for=\"Field12_0\" >\n");
      out.write("Sibling</label>\n");
      out.write("</span>\n");
      out.write("<span>\n");
      out.write("<input id=\"Field12_1\" name=\"Field12\" type=\"radio\" class=\"field radio\" value=\"Parent\" tabindex=\"14\" />\n");
      out.write("<label class=\"choice\" for=\"Field12_1\" >\n");
      out.write("Parent</label>\n");
      out.write("</span>\n");
      out.write("<span>\n");
      out.write("<input id=\"Field12_2\" name=\"Field12\" type=\"radio\" class=\"field radio\" value=\"Child\" tabindex=\"15\" />\n");
      out.write("<label class=\"choice\" for=\"Field12_2\" >\n");
      out.write("Child</label>\n");
      out.write("</span>\n");
      out.write("<span>\n");
      out.write("<input id=\"Field12_3\" name=\"Field12\" type=\"radio\" class=\"field radio\" value=\"Friend\" tabindex=\"16\" />\n");
      out.write("<label class=\"choice\" for=\"Field12_3\" >\n");
      out.write("Friend</label>\n");
      out.write("</span>\n");
      out.write("<span>\n");
      out.write("<input id=\"Field12_4\" name=\"Field12\" type=\"radio\" class=\"field radio\" value=\"Other\" tabindex=\"17\" onmouseup=\"document.getElementById('Field12_other').focus();\" />\n");
      out.write("<label class=\"choice\" for=\"Field12_4\"  onmouseup=\"document.getElementById('Field12_other').focus();\">\n");
      out.write("Other</label>\n");
      out.write("<input id=\"Field12_other\" name=\"Field12_other_Other\" type=\"text\" class=\"field text other\" value=\"\" onclick=\"document.getElementById('Field12_4').checked = 'checked';\" tabindex=\"18\" />\n");
      out.write("</span>\n");
      out.write("</div>\n");
      out.write("</fieldset>\n");
      out.write("</li><li id=\"foli13\"\n");
      out.write("class=\"notranslate      \"><label class=\"desc\" id=\"title13\" for=\"Field13\">\n");
      out.write("Notes\n");
      out.write("</label>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("<textarea id=\"Field13\"\n");
      out.write("name=\"Field13\"\n");
      out.write("class=\"field textarea medium\"\n");
      out.write("spellcheck=\"true\"\n");
      out.write("rows=\"10\" cols=\"50\"\n");
      out.write("tabindex=\"19\"\n");
      out.write("onkeyup=\"\"\n");
      out.write(" ></textarea>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</li> <li class=\"buttons \">\n");
      out.write("<div>\n");
      out.write("\n");
      out.write("                    <input id=\"saveForm\" name=\"saveForm\" class=\"btTxt submit\"\n");
      out.write("    type=\"submit\" value=\"Submit\"\n");
      out.write(" /></div>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</form> \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("       <div id=\"footer\"><div class=\"fleft\">Copyright Adama Coulibaly 2012</div><div class=\"fright\">Software Developer <a href=\"http://www.temple.edu/cis/\" target=\"_blank\">@ College of Sc. & Tech.</a>  The Smart Choice.</div><div class=\"fcenter\">Design by: <a href=\"http://www.templatesperfect.com/\">Templatesperfect.com</a></div></div>\n");
      out.write("    </body>\n");
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
