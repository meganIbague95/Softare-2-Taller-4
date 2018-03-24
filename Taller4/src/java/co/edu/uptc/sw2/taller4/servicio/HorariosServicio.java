/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller4.servicio;

import co.edu.uptc.sw2.taller4.dto.HorarioDTO;
import co.edu.uptc.sw2.taller4.dto.MateriaDTO;
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

@Path("/Horarios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HorariosServicio {
    
    /**
     * retorna una lista con los horarios
     *
     * @return retorna una lista de horarios
     * @generated
     */
    @GET
    public List<HorarioDTO> obtenerListaHorarios() {
        return ProveedorInformacion.instance().obtenerTodos(HorarioDTO.class);
    }

    /**
     * @param id identificador del elemento horario
     * @return Horario del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public HorarioDTO obtenerHorario(@PathParam("id") Long id) {
        return (HorarioDTO) ProveedorInformacion.instance().obtener(HorarioDTO.class, id);
    }

    /**
     * almacena la informacion de un horario
     *
     * @param dto horario a guardar
     * @return horario con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public HorarioDTO guardarHorario(HorarioDTO dto) {
        return (HorarioDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Materia con el identificador dado
     *
     * @param id identificador de la Materia
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarHorario(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(HorarioDTO.class, id);
    }
    
    
}
