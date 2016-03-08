    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="/WEB-INF/vista/etiquetas/struts-html.tld" prefix="html" %>


    <br>
    <font size='5'><fmt:message key="formaNuevoRecomendacion.titulo" /></font>

    <form id="forma" action="procesarRegistroRecomendacion.do" method="post">
        <table>
            <tr>
                <td colspan="2">
                   <html:errors />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevoRecomendacion.etiqueta.nombre" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="nombre" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoRecomendacion.nombre}" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevoRecomendacion.etiqueta.usuario" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="usuario" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoRecomendacion.usuario}" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevoRecomendacion.etiqueta.fecha" />
                </td>
                <td align="left">
                    <input type="date" 
                           name="fecha" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoRecomendacion.fecha}" />
                           <!--<input type="text" 
                           name="fecha" 
                           size="20" 
                           maxlength="100" 
                           value="${formaNuevoRecomendacion.fecha}" />-->
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevoRecomendacion.etiqueta.comentario" />
                </td>
                <td align="left">
                    <input type="text" 
                           name="comentario" 
                           size="50" 
                           maxlength="100" 
                           value="${formaNuevoRecomendacion.comentario}" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    <fmt:message key="formaNuevoRecomendacion.etiqueta.calificacion" />
                </td>
                <td align="left">
                    <input type="number" 
                           name="calificacion" 
                           size="50" 
                           maxlength="100" 
                           min="1" 
                           max="5"
                           value="${formaNuevoRecomendacion.calificacion}" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" 
                           name="submit"
                           value="Agregar y terminar"/>
                    <input type="submit" 
                           name="submit"
                           value="Agregar y volver"
                           onclick="forma.action='procesarRegistroRecomendacion.do?volver=si'"/>
                    <input type="button"
                           value="Reset"
                           onclick="location.href='solicitarRegistroRecomendacion.do'" />
                    <input type="submit" 
                           name="org.apache.struts.taglib.html.CANCEL" 
                           value="cancelar" 
                           onclick="bCancel=true;">    
                </td>
            </tr>
        </table>
    </form>