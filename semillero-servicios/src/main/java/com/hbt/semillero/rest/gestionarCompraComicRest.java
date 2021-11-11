package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;


/**
 * 
 * <b>DescripciÃ³n:<b> Clase que contiene las firmas de los servicios
 * <b>Caso de Uso:<b> SEMILLERO 2021
 * @author David Erazo Arcos
 * @version 1.0 
 */


@Path("/gestionarCompraComic")
public class gestionarCompraComicRest {
	
	@EJB
	private IGestionarCompraComicLocal gestionarCompraComicLocal;

	
	
	@POST
	@Path("/compraComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ComicDTO compraComic(@QueryParam("idComic") Long idComic,Integer Cantidad) {
		ConsultaCantidadComicDTO comicDTOResult = new ConsultaCantidadComicDTO();
		try {
			comicDTOResult = this.gestionarCompraComicLocal.compraComic(comicDTO,Cantidad);
		}  catch (Exception e) {
			comicDTOResult.setExitoso(false);
			comicDTOResult.setMensajeEjecucion("Se ha presentado un error tecnico, causa: " + e.getMessage());
		}
		return comicDTOResult;
	} 
	
}
