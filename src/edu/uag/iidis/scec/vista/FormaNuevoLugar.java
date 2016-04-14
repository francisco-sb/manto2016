package edu.uag.iidis.scec.vista;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

import org.apache.struts.upload.FormFile;


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
    private String latitud;
    private String longitud;
    private String estado; 
    Collection estados;   

    ///////////////
    private FormFile imagen;

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

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLatitud() {
        return (this.latitud);
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLongitud() {
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

    public FormFile setImagen(FormFile imagen){
        this.imagen = imagen;
    }

    public void getImagen(){
        return imagen;
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
        if (getImagen().getFileSize() == 0) {
            errores.add("common.file.err",new ActionMessage("error.common.file.required"));

            return errores;       
        }



        return errores;

    }

}
