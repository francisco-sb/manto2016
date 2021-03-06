package edu.uag.iidis.scec.control;

import edu.uag.iidis.scec.vista.*;
import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.servicios.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;



public final class MCURegistrarLugar 
        extends MappingDispatchAction {

    private Log log = LogFactory.getLog(MCURegistrarUsuario.class);


    public ActionForward solicitarRegistroLugar(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">solicitarRegistroLugar");
        }

        return (mapping.findForward("exito"));
    }



    public ActionForward procesarRegistroLugar(
                ActionMapping mapping,
                ActionForm form,
                HttpServletRequest request,
                HttpServletResponse response)
            throws Exception {

        if (log.isDebugEnabled()) {
            log.debug(">procesarRegistroLugar");
        }

        // Verifica si la acción fue cancelada por el usuario
        if (isCancelled(request)) {
            if (log.isDebugEnabled()) {
                log.debug("<La acción fue cancelada");
            }
            return (mapping.findForward("cancelar"));
        }

        
        // Se obtienen los datos para procesar el registro
        FormaNuevoLugar forma = (FormaNuevoLugar)form;

        Lugar lugar = new Lugar(forma.getNombre(),
                          forma.getDescripcion(),
                          forma.getPoblacion(),
                          forma.getLatitud(),
                          forma.getLongitud(),
                          forma.getEstado());

        ManejadorLugares mr = new ManejadorLugares();
        int resultado = mr.crearLugar(lugar);

        ///////////////////////////////////////////////
        /*FileUploadForm fileUploadForm = (FileUploadForm)form;
        
        FormFile file = fileUploadForm.getFile();
        
        //Get the servers upload directory real path name
        String filePath = 
               getServlet().getServletContext().getRealPath("/") +"upload";
        
        //create the upload folder if not exists
        File folder = new File(filePath);
        if(!folder.exists()){
            folder.mkdir();
        }
        
        String fileName = file.getFileName();
        
        if(!("").equals(fileName)){  
            
            System.out.println("Server path:" +filePath);
            File newFile = new File(filePath, fileName);
              
            if(!newFile.exists()){
              FileOutputStream fos = new FileOutputStream(newFile);
              fos.write(file.getFileData());
              fos.flush();
              fos.close();
            }  
            
            request.setAttribute("uploadedFilePath",newFile.getAbsoluteFile());
            request.setAttribute("uploadedFileName",newFile.getName());
        }*/
        ////////////////////////////////////////////

        ActionMessages errores = new ActionMessages();
        switch (resultado) {
            case 0:   
                return (mapping.findForward("exito"));

            case 1:
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.nombreLugarYaExiste",
                                               forma.getNombre()));                
                saveErrors(request, errores);
                return (mapping.getInputForward());

            case 3:
                log.error("Ocurrió un error de infraestructura");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));                
                saveErrors(request, errores);
                return (mapping.getInputForward());

            default:
                log.warn("ManejadorUsuario.crearUsuario regresó reultado inesperado");
                errores.add(ActionMessages.GLOBAL_MESSAGE,
                            new ActionMessage("errors.infraestructura"));                
                saveErrors(request, errores);
                return (mapping.getInputForward());
        }
    }

}
