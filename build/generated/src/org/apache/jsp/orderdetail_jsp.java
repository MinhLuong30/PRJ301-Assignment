package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"admin.jsp\">Logout</a>\n");
      out.write("    <form action=\"MainController\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" name=\"action\" value=\"Show Inventory\"/>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>NO</th>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>NAME</th>\n");
      out.write("                <th>DESCRIPTION</th>\n");
      out.write("                <th>ARTIST</th>\n");
      out.write("                <th>PRICE</th>\n");
      out.write("                <th>IMAGE</th>\n");
      out.write("                <th>QUANTITY</th>\n");
      out.write("                <th>REPORT</th>\n");
      out.write("                <th><input type=\"button\" value=\"Check\" onclick=\"check()\"/> </th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            \n");
      out.write("            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ITEMS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"i\" varStatus=\"counter\">\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <form action=\"MainController\" method=\"POST\" style=\"display:inline;\">\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${counter.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td><input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.comicid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 50px;\" readonly ></td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"name\" style=\"width: 140px;\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"description\" style=\"width: 290px;\" ></td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.artist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"artist\" style=\"width: 120px;\" ></td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"price\" style=\"width: 60px;\"></td>\n");
      out.write("                        <td><img src=\"./images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 80px;\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"quantity\" style=\"width: 80px;\"></td>\n");
      out.write("                        <td><input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.report}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"width: 60px;\"></td>\n");
      out.write("                        <td>                \n");
      out.write("                            <input type=\"button\" value=\"Remove\" onclick=\"remove('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.comicid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\"/>   \n");
      out.write("                        </td>    \n");
      out.write("                        <td>\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.comicid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Update\" name=\"action\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </form>\n");
      out.write("                </tr>\n");
      out.write("            </c:forEach> \n");
      out.write("                                \n");
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("        <div>ADD New Product</div>\n");
      out.write("                <tr>\n");
      out.write("                <form action=\"MainController\" method=\"post\">\n");
      out.write("                    <div>Product ID <input type=\"text\" name=\"comicID\" size=\"2\" required</div>\n");
      out.write("                    <div>Product Name <input type=\"text\" name=\"name\" size=\"20\"required</div>\n");
      out.write("                    <div>Description <input type=\"text\" name=\"description\" size=\"20\"required</div>\n");
      out.write("                    <div>Artist <input type=\"text\" name=\"artist\" size=\"20\"required</div>\n");
      out.write("                    <div>Product Price <input type=\"text\" name=\"price\" size=\"5\"required</div>   \n");
      out.write("                    <div>Image Link <input type=\"text\" name=\"image\" size=\"20\"required</div>\n");
      out.write("                    <div>Quantity <input type=\"text\" name=\"quantity\" size=\"1\"required</div>\n");
      out.write("                \n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"Add\">                                  \n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
