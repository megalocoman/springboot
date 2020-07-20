package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class actualizarcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"Stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css\">\r\n");
      out.write("<!--  FONT OSWALD -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Oswald:wght@200;300;400&display=swap\">\r\n");
      out.write("<!-- CUSTON STYLE CSS -->\r\n");
      out.write("<link rel=\"Stylesheet\" href=\"Estilos/Estilos.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"menu-boton\">\r\n");
      out.write("\t\t<i class=\"fas fa-bars\"></i>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<nav class=\"nav-main\">\r\n");
      out.write("\t\t\t<img alt=\"Logo Principal\" src=\"img/logo.png\" class=\"nav-logo\">\r\n");
      out.write("\t\t\t<ul class=\"nav-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"ingresocliente.jsp\">Clientes</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"CreacionOT.jsp\">OT</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"informe.jsp\">Informes de gestión</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Ingresoprofesional.jsp\">Profesionales</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"ingreso.jsp\">Accidentes</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav-menu-derecha\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"> <i class=\"fas fa-search\"></i>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<h1>actualizar datos</h1>\r\n");
      out.write("\t<h2>actualizar cliente</h2>\r\n");
      out.write("\t<form action=\"ServletActualizarCliente\" method=\"get\">\r\n");
      out.write("\t\tRUT : <input type=\"text\" name=\"rut_cli\" id=\"rut_cli\"> <br>\r\n");
      out.write("\t\tNombre: <input type=\"text\" name=\"nombre_cli\" id=\"nombre_cli\"><br>\r\n");
      out.write("\t\tDireccion: <input type=\"text\" name=\"direccion_cli\"\tid=\"direccion_cli\"><br>\r\n");
      out.write("\t \tTelefono: <input type=\"text\" name=\"telefono_cli\" id=\"telefono_cli\"><br> \r\n");
      out.write("\t\tCorreo: <input type=\"text\" name=\"correo_cli\" id=\"correo_cli\"><br>\r\n");
      out.write("\t\tContacto: <input type=\"text\" name=\"contacto_cli\" id=\"contacto_cli\"><br>\r\n");
      out.write("\t\t<input type=\"submit\" name=\"actualizar\" value=\"Actualizar\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<a href=\"consultacliente.jsp\">Ir a consulta de cliente</a>\r\n");
      out.write("\r\n");
      out.write("\t<!-- INVOCAR JS -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/inicio.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
