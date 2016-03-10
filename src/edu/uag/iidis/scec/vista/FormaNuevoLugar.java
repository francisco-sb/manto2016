package edu.uag.iidis.scec.vista;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


/**
 * Form bean para el registro de una nueva persona.
 *
 * @author Victor Ramos
 */
public final class FormaNuevoLugar
        extends ValidatorForm {

    private String nombre;
    private String descripcion;

    //Nuevos campos
    private Long poblacion;
    private Long latitud;
    private Long longitud;
    private String estado; 
    Collection estados;   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return (this.nombre);
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return (this.descripcion);
    }

    //Nuevos métodos
    public void setPoblacion(Long poblacion) {
        this.poblacion = poblacion;
    }

    public Long getPoblacion() {
        return (this.poblacion);
    }

    public void setLatitud(Long latitud) {
        this.latitud = latitud;
    }

    public Long getLatitud() {
        return (this.latitud);
    }

    public void setLongitud(Long longitud) {
        this.longitud = longitud;
    }

    public Long getLongitud() {
        return (this.longitud);
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return (this.estado);
    }

    public void setEstados(Collection estados){
        this.estados = estados;
    }

    public Collection getEstados(){
        return (this.estados);
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
