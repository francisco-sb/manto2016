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
    <font size='5'>Reportes Recomendaciones</font>
    <table cellpadding="0" cellspacing="0" width="60%" border="0">
        <tr>
            <td colspan="4">
               <html:errors />
            </td>
        </tr>
        <tr align="center" bgcolor="#CCCCCC">
         <td ><b><fmt:message key="formaListadoRecomendaciones.etiqueta.nombre" /></b></td>
         <td ><b><fmt:message key="formaListadoRecomendaciones.etiqueta.comentario" /></b></td>
         <td ><b><fmt:message key="formaListadoRecomendaciones.etiqueta.calificacion" /></b></td>
         <td ><b><fmt:message key="formaListadoRecomendaciones.etiqueta.usuario" /></b></td>
         <td ><b><fmt:message key="formaListadoRecomendaciones.etiqueta.fecha" /></b></td>
        </tr>
          <c:forEach var="recomendar" items="${formaReporteRecomendaciones.recomendacion}">
            <td align="left" width="10%">
          <c:forEach var="lugar" items="${formaReporteRecomendaciones.lugares}">
            <c:if test="${lugar.nombre == recomendar.nombre}">
              <c:out value="${lugar.nombre}"/>
            </c:if>
          </c:forEach>
          </td>
          <td align="left" width="50%"><c:out value="${recomendar.comentario}"/></td>
          <td align="left" width="10%"><c:out value="${recomendar.calificacion}"/></td>
          <td align="left" width="10%"><c:out value="${recomendar.usuario}"/></td>
          <td align="left" width="30%"><c:out value="${recomendar.fecha}"/></td>
        </tr>
        </c:forEach>
      
    </table>