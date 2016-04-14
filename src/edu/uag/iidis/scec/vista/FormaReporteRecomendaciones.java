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
public final class FormaReporteRecomendaciones
        extends ValidatorForm {

    private Collection recomendacion;
    private int contador;
	private Collection lugares;
    private int contador2;

    public void setLugares(Collection lugares) {
        this.lugares = lugares;
        if (lugares != null) {
          this.contador2 = lugares.size();
        } else
          this.contador2 = -1;
    }

    public Collection getLugares() {
        return (this.lugares);
    }
	
    public void setRecomendacion(Collection recomendacion) {
        this.recomendacion = recomendacion;
        if (recomendacion != null) {
          this.contador = recomendacion.size();
        } else
          this.contador = -1;
    }

    public Collection getRecomendacion() {
        return (this.recomendacion);
    }
  
    public int getContador() {
        return (this.contador);
    }


    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        contador=0;
        recomendacion =null;
		contador2=0;
        lugares=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
