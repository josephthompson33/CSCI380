/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.2
 * Generated at: 2017-11-09 19:44:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class programs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("   <head>\n");
      out.write("\n");
      out.write("      <title>Heroin Programs Page</title>\n");
      out.write("      <!-- link rel=\"stylesheet\" href=\"\" -->\n");
      out.write("      <style>\n");
      out.write("\n");
      out.write("      body{\n");
      out.write("         text-shadow: 1px 1px 1px black!important; \n");
      out.write("         background-image: url(\"gradient.jpeg\");\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      ul.menu{\n");
      out.write("         list-style-type: square;\n");
      out.write("         margin:0;\n");
      out.write("         padding:0;\n");
      out.write("         width: 15%;\n");
      out.write("         position:fixed;\n");
      out.write("         height: 100%;\n");
      out.write("         overflow: auto;\n");
      out.write("\n");
      out.write("      } \n");
      out.write("\n");
      out.write("      h1{\n");
      out.write("         text-align:center;\n");
      out.write("         font-variant:small-caps;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      li a{\n");
      out.write("         text-align:center;\n");
      out.write("         display: block;\n");
      out.write("         background-color: #43BBAA;\n");
      out.write("         color:white;\n");
      out.write("         padding: 10px 1px;\n");
      out.write("         border-radius: 25px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      li a.active{\n");
      out.write("         background-color:#3FAA68;\n");
      out.write("         color:white;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      li a:hover:not(.active){\n");
      out.write("         background-color: #99BBB6;\n");
      out.write("         color:white;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      div{\n");
      out.write("         margin-left:16%;\n");
      out.write("         padding: 1px 16px;\n");
      out.write("         height:1000px;\n");
      out.write("         color:white;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      </style>\n");
      out.write("\n");
      out.write("   </head>\n");
      out.write("\n");
      out.write("   <body>\n");
      out.write("      <ul class=\"menu\">\n");
      out.write("         <li>  <a href= \"homePage.jsp\"><b>Home</b></a>                                         </li>\n");
      out.write("         <br>\n");
      out.write("         <li>  <a class =\"active\" href=\"#programs\"><b>Programs</b></a>                          </li>\n");
      out.write("         <br>\n");
      out.write("         <li>  <a href=\"houses.jsp\"><b>Halfway Houses</b></a>                                  </li>\n");
      out.write("         <br>\n");
      out.write("         <li>  <a href=\"resources.jsp\"><b>Other Resources</b></a>                              </li>\n");
      out.write("         <br>\n");
      out.write("         <li>  <a href=\"aboutUs.jsp\"><b>About Us</b></a>                                       </li>\n");
      out.write("      </ul>\n");
      out.write("\n");
      out.write("      <div class =\"welcome\">\n");
      out.write("         <b>\n");
      out.write("            <h1> Programs Page For Our Project </h1>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("            <p> text n stuff here.... </p>\n");
      out.write("\n");
      out.write("         </b>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("   </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
