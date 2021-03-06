package edu.uag.iidis.scec.vista;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


/**
 * Form bean para el registro de una nueva persona.
 *
 * @author Victor Ramos
 */
public final class FormaNuevoRecomendacion
        extends ValidatorForm {

    private Long id;        
    private String nombre;
    private String estado;
    private String usuario;
    private String fecha;
    private String comentario;
    private Long calificacion;

    private String descripcion;
    private Collection lugares;
    private int contador;    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return (this.nombre);
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return (this.estado);
    }

    //Nuevos métodos
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return (this.usuario);
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return (this.fecha);
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return (this.comentario);
    }

    public void setCalificacion(Long calificacion) {
        this.calificacion = calificacion;
    }

    public Long getCalificacion() {
        return (this.calificacion);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return (this.descripcion);
    }

    public void setLugares(Collection lugares) {
        this.lugares = lugares;
        if (lugares != null) {
          this.contador = lugares.size();
        } else
          this.contador = -1;
    }

    public Collection getLugares() {
        return (this.lugares);
    }
    //**********************************************
    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        nombre=null;
        descripcion=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
