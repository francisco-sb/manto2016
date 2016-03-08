package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * 
 *
 * <p><a href="Recomendacion.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Recomendacion extends ClaseBase 
        implements Serializable {

    private Long id;
    private String nombre;
    private String estado;
    private String usuario;
    private String fecha;
    private String comentario;
    private Long calificacion;

    public Recomendacion() {
    }

    public Recomendacion(Long id){
        this.id = id;
    }

    public Recomendacion(String nombre, String estado, String usuario, String fecha, String comentario, Long calificacion){
        this.nombre=nombre;
        this.estado=estado;
        this.usuario=usuario;
        this.fecha=fecha;
        this.comentario=comentario;
        this.calificacion=calificacion;
    }

    /**
     * Regresa el id del recomendación.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del recomendación.
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Regresa el nombre del recomendación.
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del recomendación.
     * @return void
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Regresa la estado del recomendación.
     * @return String
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * Establece la estado del recomendación.
     * @return void
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Nuevos métodos

    /**
     * Regresa la población del recomendación.
     * @return String
     */
    public String getUsuario() {
        return this.usuario;
    }

    /**
     * Establece la población del recomendación.
     * @return void
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }    

    /**
     * Regresa la fecha del recomendación.
     * @return String
     */
    public String getFecha() {
        return this.fecha;
    }

    /**
     * Establece la fecha del recomendación.
     * @return void
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Regresa la comentario del recomendación.
     * @return String
     */
    public String getComentario() {
        return this.comentario;
    }

    /**
     * Establece la comentario del recomendación.
     * @return void
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Regresa el calificacion del recomendación.
     * @return Long
     */
    public Long getCalificacion() {
        return this.calificacion;
    }

    /**
     * Establece el calificacion del recomendación.
     * @return void
     */
    public void setCalificacion(Long calificacion) {
        this.calificacion = calificacion;
    }
}
