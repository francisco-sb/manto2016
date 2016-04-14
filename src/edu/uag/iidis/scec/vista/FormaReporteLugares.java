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
public final class FormaReporteLugares
        extends ValidatorForm {

    private Collection lugares;
    private int contador;
    private Collection estados;
    private int contador2;

    public void setEstados(Collection estados) {
        this.estados = estados;
        if (estados != null) {
          this.contador2 = estados.size();
        } else
          this.contador2 = -1;
    }

    public Collection getEstados() {
        return (this.estados);
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
  
    public int getContador() {
        return (this.contador);
    }

    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        contador=0;
        lugares =null;
        contador2=0;
        estados=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
