package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Page</title>\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css?family=Montserrat:400,800');\n");
      out.write("\n");
      out.write("* {\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tbackground: #f6f5f7;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\tfont-family: 'Montserrat', sans-serif;\n");
      out.write("\theight: 100vh;\n");
      out.write("\tmargin: -20px 0 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tfont-weight: 100;\n");
      out.write("\tline-height: 20px;\n");
      out.write("\tletter-spacing: 0.5px;\n");
      out.write("\tmargin: 20px 0 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span {\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("\tcolor: #333;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tmargin: 15px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tborder: 1px solid #FF4B2B;\n");
      out.write("\tbackground-color: #FF4B2B;\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tpadding: 12px 45px;\n");
      out.write("\tletter-spacing: 1px;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\ttransition: transform 80ms ease-in;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:active {\n");
      out.write("\ttransform: scale(0.95);\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:focus {\n");
      out.write("\toutline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.ghost {\n");
      out.write("\tbackground-color: transparent;\n");
      out.write("\tborder-color: #FFFFFF;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("\tbackground-color: #FFFFFF;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\talign-items: center;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\tpadding: 0 50px;\n");
      out.write("\theight: 100%;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input {\n");
      out.write("\tbackground-color: #eee;\n");
      out.write("\tborder: none;\n");
      out.write("\tpadding: 12px 15px;\n");
      out.write("\tmargin: 8px 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("  \tbox-shadow: 0 14px 28px rgba(0,0,0,0.25), \n");
      out.write("\t\t\t0 10px 10px rgba(0,0,0,0.22);\n");
      out.write("\tposition: relative;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\twidth: 768px;\n");
      out.write("\tmax-width: 100%;\n");
      out.write("\tmin-height: 480px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\theight: 100%;\n");
      out.write("\ttransition: all 0.6s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign-in-container {\n");
      out.write("\tleft: 0;\n");
      out.write("\twidth: 50%;\n");
      out.write("\tz-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .sign-in-container {\n");
      out.write("\ttransform: translateX(100%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sign-up-container {\n");
      out.write("\tleft: 0;\n");
      out.write("\twidth: 50%;\n");
      out.write("\topacity: 0;\n");
      out.write("\tz-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .sign-up-container {\n");
      out.write("\ttransform: translateX(100%);\n");
      out.write("\topacity: 1;\n");
      out.write("\tz-index: 5;\n");
      out.write("\tanimation: show 0.6s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes show {\n");
      out.write("\t0%, 49.99% {\n");
      out.write("\t\topacity: 0;\n");
      out.write("\t\tz-index: 1;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t50%, 100% {\n");
      out.write("\t\topacity: 1;\n");
      out.write("\t\tz-index: 5;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay-container {\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 50%;\n");
      out.write("\twidth: 50%;\n");
      out.write("\theight: 100%;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\ttransition: transform 0.6s ease-in-out;\n");
      out.write("\tz-index: 100;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .overlay-container{\n");
      out.write("\ttransform: translateX(-100%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay {\n");
      out.write("\tbackground: #FF416C;\n");
      out.write("\tbackground: -webkit-linear-gradient(to right, #FF4B2B, #FF416C);\n");
      out.write("\tbackground: linear-gradient(to right, #FF4B2B, #FF416C);\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: 0 0;\n");
      out.write("\tcolor: #FFFFFF;\n");
      out.write("\tposition: relative;\n");
      out.write("\tleft: -100%;\n");
      out.write("\theight: 100%;\n");
      out.write("\twidth: 200%;\n");
      out.write("  \ttransform: translateX(0);\n");
      out.write("\ttransition: transform 0.6s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .overlay {\n");
      out.write("  \ttransform: translateX(50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay-panel {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\talign-items: center;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\tpadding: 0 40px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\ttop: 0;\n");
      out.write("\theight: 100%;\n");
      out.write("\twidth: 50%;\n");
      out.write("\ttransform: translateX(0);\n");
      out.write("\ttransition: transform 0.6s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay-left {\n");
      out.write("\ttransform: translateX(-20%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .overlay-left {\n");
      out.write("\ttransform: translateX(0);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay-right {\n");
      out.write("\tright: 0;\n");
      out.write("\ttransform: translateX(0);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container.right-panel-active .overlay-right {\n");
      out.write("\ttransform: translateX(20%);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-container {\n");
      out.write("\tmargin: 20px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-container a {\n");
      out.write("\tborder: 1px solid #DDDDDD;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tdisplay: inline-flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\tmargin: 0 5px;\n");
      out.write("\theight: 40px;\n");
      out.write("\twidth: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer {\n");
      out.write("    background-color: #222;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 14px;\n");
      out.write("    bottom: 0;\n");
      out.write("    position: fixed;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    text-align: center;\n");
      out.write("    z-index: 999;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer p {\n");
      out.write("    margin: 10px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer i {\n");
      out.write("    color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer a {\n");
      out.write("    color: #3c97bf;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Weekly Coding Challenge #1: Sign in/up Form</h2>\n");
      out.write("<div class=\"container\" id=\"container\">\n");
      out.write("\t<div class=\"form-container sign-up-container\">\n");
      out.write("            <form action=\"MainController\" method=\"POST\">\n");
      out.write("\t\t\t<h2>STORE</h2>\n");
      out.write("                        <h2 style=\"margin-top: -20px\">MANAGEMENT</h2>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\t\t\t<div class=\"social-container\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<span></span>\n");
      out.write("                        <button type=\"submit\" value=\"Revenue\" name=\"action\">Revenue</button>\n");
      out.write("                        <br>\n");
      out.write("                        <button type=\"submit\" value=\"Product\" name=\"action\">Product</button>\n");
      out.write("                        <br>\n");
      out.write("                        <button type=\"submit\" value=\"Invoice\" name=\"action\">INVOICE</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"form-container sign-in-container\">\n");
      out.write("\t\t<form action=\"MainController\" method=\"POST\">\n");
      out.write("\t\t\t<h2>CUSTOMER MANAGEMENT</h2>\n");
      out.write("\t\t\t<button type=\"submit\" value=\"Account\" name=\"action\">ACCOUNT</button>\n");
      out.write("                        <br>\n");
      out.write("                        <button type=\"submit\" value=\"Order\" name=\"action\">ORDER</button>\n");
      out.write("                        <br>\n");
      out.write("                        <button type=\"submit\" value=\"Feedback\" name=\"action\">FEEDBACK</button>\n");
      out.write("                        <br>\n");
      out.write("                        <a href=\"login.jsp\">LOG OUT</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"overlay-container\">\n");
      out.write("\t\t<div class=\"overlay\">\n");
      out.write("\t\t\t<div class=\"overlay-panel overlay-left\">\n");
      out.write("\t\t\t\t<h1>Welcome Back!</h1>\n");
      out.write("\t\t\t\t<p>To keep connected with us please login with your personal info</p>\n");
      out.write("\t\t\t\t<button class=\"ghost\" id=\"signIn\">Sign In</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"overlay-panel overlay-right\">\n");
      out.write("\t\t\t\t<h1>Hello, Friend!</h1>\n");
      out.write("\t\t\t\t<p>Enter your personal details and start journey with us</p>\n");
      out.write("\t\t\t\t<button class=\"ghost\" id=\"signUp\">Sign Up</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            const signUpButton = document.getElementById('signUp');\n");
      out.write("            const signInButton = document.getElementById('signIn');\n");
      out.write("            const container = document.getElementById('container');\n");
      out.write("\n");
      out.write("                signUpButton.addEventListener('click', () => {\n");
      out.write("                container.classList.add(\"right-panel-active\");\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("\n");
      out.write("                signInButton.addEventListener('click', () => {\n");
      out.write("                container.classList.remove(\"right-panel-active\");\n");
      out.write("                });\n");
      out.write("        </script>\n");
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