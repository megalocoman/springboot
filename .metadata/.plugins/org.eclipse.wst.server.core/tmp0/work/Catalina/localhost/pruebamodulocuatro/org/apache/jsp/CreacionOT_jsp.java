package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreacionOT_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>Crear OT</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"StyleSheet\" href=\"Estilos/estilo.css\" type=\"text/css\"> -->\r\n");
      out.write("<link rel=\"Stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.1/css/all.min.css\">\r\n");
      out.write("<!--  FONT OSWALD -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Oswald:wght@200;300;400&display=swap\">\r\n");
      out.write("<!-- CUSTON STYLE CSS -->\r\n");
      out.write("<link rel=\"Stylesheet\" href=\"Estilos/Estilos.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script src=\"js/validaciones.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"menu-boton\">\r\n");
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
      out.write("\r\n");
      out.write("<h1>Crear OT</h1>\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"CrearOT\" name=\"formcrea\" method=\"post\">\r\n");
      out.write("<!-- \t\t<table width=\"50%\" border=\"0\"> -->\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">Fecha actividad</td>\r\n");
      out.write("\t\t\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t\t\t<label for=\"txtfecact\"></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"datepicker\" name=\"txtfecact\" readonly=\"\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">Valor</td>\r\n");
      out.write("\t\t\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t\t\t<label for=\"txtval\"></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtval\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">Pago</td>\r\n");
      out.write("\t\t\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t\t\t<label for=\"txtpag\"></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtpag\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">Status actividad</td>\r\n");
      out.write("\t\t\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t\t\t<label for=\"txtstatact\"></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtstatact\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">Rut Cliente (*)</td>\r\n");
      out.write("\t\t\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t\t\t<label for=\"txtrutcli\"></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtrutcli\" >\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">Rut Profesional</td>\r\n");
      out.write("\t\t\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t\t\t<label for=\"txtrutprof\"></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtrutprof\">\r\n");
      out.write("<!-- \t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"30%\">Codigo actividad (*)</td>\r\n");
      out.write("\t\t\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t\t\t<label for=\"txtcodact\"></label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtcodact\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\t<div id=\"Boton\">\r\n");
      out.write("\t\t\t<input type=\"submit\" onclick=\"return valida(this)\" value=\"Agregar OT\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!-- \t<label for=\"txtfecact\">Fecha actividad:</label> -->\r\n");
      out.write("<!-- \t\t<input type=\"text\" maxlength=\"10\" name=\"txtfecact\" /> <br /> -->\r\n");
      out.write("<!-- \t\t<label for=\"txtval\">Valor OT:</label> -->\r\n");
      out.write("<!-- \t\t<input type=\"text\" name=\"txtval\" /> <br /> -->\r\n");
      out.write("<!-- \t\t<label for=\"txtpag\">Pago OT:</label> -->\r\n");
      out.write("<!-- \t\t<input type=\"text\" name=\"txtpag\" /> <br /> -->\r\n");
      out.write("<!-- \t\t<label for=\"txtstatact\">Status Actividad:</label> -->\r\n");
      out.write("<!-- \t\t<input type=\"text\" name=\"txtstatact\" /> <br /> -->\r\n");
      out.write("<!-- \t\t<label for=\"txtrutcli\">Rut Cliente:</label> -->\r\n");
      out.write("<!-- \t\t<input type=\"text\" name=\"txtrutcli\" required/> <br /> -->\r\n");
      out.write("<!-- \t\t<label for=\"txtrutprof\">Rut Profesional:</label> -->\r\n");
      out.write("<!-- \t\t<input type=\"text\" name=\"txtrutprof\" required/> <br /> -->\r\n");
      out.write("<!-- \t\t<label for=\"txtcodact\">Código Actividad:</label> -->\r\n");
      out.write("<!-- \t\t<input type=\"text\" name=\"txtcodact\" required/> <br /><br /> -->\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- \t\t<input type=\"submit\" value=\"Agregar OT\" /> -->\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/ListarOT\">Volver al\r\n");
      out.write("\t\tlistado de OT</a>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /CreacionOT.jsp(50,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cumensaje != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /CreacionOT.jsp(51,2) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cumensaje}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
