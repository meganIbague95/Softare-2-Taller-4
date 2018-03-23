/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller4.servicio;

import co.edu.uptc.sw2.taller4.dto.CarreraDTO;
import co.edu.uptc.sw2.taller4.dto.EstudianteDTO;
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
 * @author Megan Nicol
 */
@Path("/Estudiante")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstudianteServicio {
    
     /**
     * retorna una lista con los Estudiante que se encuentran en la base de datos
     *
     * @return retorna una lista de EstudianteDTO
     * @generated
     */
    @GET
    public List<EstudianteDTO> obtenerTodosCarreras() {
        return ProveedorInformacion.instance().obtenerTodos(EstudianteDTO.class);
    }

    /**
     * @param id identificador del elemento Estudiante
     * @return Estudiante del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public EstudianteDTO obtenerEstudiante(@PathParam("id") Long id) {
        return (EstudianteDTO) ProveedorInformacion.instance().obtener(EstudianteDTO.class, id);
    }

    /**
     * almacena la informacion de Estudiante
     *
     * @param dto Estudiante a guardar
     * @return Estudiante con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public EstudianteDTO guardarEstudiante(EstudianteDTO dto) {
        return (EstudianteDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Carrera con el identificador dado
     *
     * @param id identificador del Carrera
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarEstudiante(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(EstudianteDTO.class, id);
    }
    
}
