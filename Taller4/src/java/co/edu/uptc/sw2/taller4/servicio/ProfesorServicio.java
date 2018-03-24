/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller4.servicio;

import co.edu.uptc.sw2.taller4.dto.ProfesorDTO;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author CamiloBonilla
 */

@Path("/Profesor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfesorServicio {
    
    /**
     * retorna una lista con los Profesores
     *
     * @return retorna una lista de ProfesorDTO
     * @generated
     */
    @GET
    public List<ProfesorDTO> obtenerListaProfesores() {
        return ProveedorInformacion.instance().obtenerTodos(ProfesorDTO.class);
    }

    /**
     * @param id identificador del elemento profesor
     * @return profesor del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public ProfesorDTO obtenerProfesor(@PathParam("id") Long id) {
        return (ProfesorDTO) ProveedorInformacion.instance().obtener(ProfesorDTO.class, id);
    }

    /**
     * almacena la informacion de un profesor
     *
     * @param dto Profesor a guardar
     * @return Profesor con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public ProfesorDTO guardarProfesor(ProfesorDTO dto) {
        return (ProfesorDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Profesor con el identificador dado
     *
     * @param id identificador del Profesor
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarProfesor(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(ProfesorDTO.class, id);
    }
    
    
}
