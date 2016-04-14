    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>
<style>
  .HipervinculoAdmon{
    color:#000000;
	text-decoration:none;
  }
  
  .HipervinculoAdmon:hover{
    color:#006666;
	text-decoration:underline;
  }
</style>
    <br>
    <font size='5'>Reportes Lugares</font>
    <table cellpadding="0" cellspacing="0" width="60%" border="0">
        <tr>
            <td colspan="4">
               <html:errors />
            </td>
        </tr>
        <tr align="center" bgcolor="#CCCCCC">
         <td ><b><fmt:message key="formaListadoLugares.etiqueta.estado" /></b></td>
         <td ><b><fmt:message key="formaListadoLugares.etiqueta.nombre" /></b></td>
         <td ><b><fmt:message key="formaListadoLugares.etiqueta.descripcion" /></b></td>
         <td ><b><fmt:message key="formaListadoLugares.etiqueta.poblacion" /></b></td>
         <td ><b><fmt:message key="formaListadoLugares.etiqueta.latitud" /></b></td>
         <td ><b><fmt:message key="formaListadoLugares.etiqueta.longitud" /></b></td>
        </tr>
        <c:forEach var="lugar" items="${formaReporteLugares.lugares}">
            <tr>
                <td align="left">
                  <c:forEach var="estado" items="${formaReporteLugares.estados}">
                    <c:if test="${estado.nombre == lugar.estado}">
                      <c:out value="${estado.nombre}"/>
                    </c:if>
                  </c:forEach>
                </td>
                <td align="left"><c:out value="${lugar.nombre}"/></td>
                <td align="left"><c:out value="${lugar.descripcion}"/></td>
                <td align="left"><c:out value="${lugar.poblacion}"/></td>
                <td align="left"><c:out value="${lugar.latitud}"/></td>
                <td align="left"><c:out value="${lugar.longitud}"/></td>
            </tr>
        </c:forEach>
      
    </table>
