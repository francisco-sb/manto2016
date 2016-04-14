package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * 
 *
 * <p><a href="Lugar.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Lugar extends ClaseBase 
        implements Serializable {

    private Long id;
    private String nombre;
    private String descripcion;

    //Nuevos campos
    private Long poblacion;
    private String latitud;
    private String longitud;
    private String estado; 

    public Lugar() {
    }

    public Lugar(Long id){
        this.id = id;
    }

    public Lugar(String nombre, String descripcion, Long poblacion, String latitud, String longitud, String estado){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.poblacion=poblacion;
        this.latitud=latitud;
        this.longitud=longitud;
        this.estado=estado;
    }

    /**
     * Regresa el id del lugar.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del lugar.
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Regresa el nombre del lugar.
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del lugar.
     * @return void
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Regresa la descripción del lugar.
     * @return String
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Establece la descripción del lugar.
     * @return void
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Nuevos métodos

    /**
     * Regresa la población del lugar.
     * @return Long
     */
    public Long getPoblacion() {
        return this.poblacion;
    }

    /**
     * Establece la población del lugar.
     * @return void
     */
    public void setPoblacion(Long poblacion) {
        this.poblacion = poblacion;
    }    

    /**
     * Regresa la latitud del lugar.
     * @return Long
     */
    public String getLatitud() {
        return this.latitud;
    }

    /**
     * Establece la latitud del lugar.
     * @return void
     */
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    /**
     * Regresa la longitud del lugar.
     * @return Long
     */
    public String getLongitud() {
        return this.longitud;
    }

    /**
     * Establece la longitud del lugar.
     * @return void
     */
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    /**
     * Regresa el estado del lugar.
     * @return String
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * Establece el estado del lugar.
     * @return void
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
