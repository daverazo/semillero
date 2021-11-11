package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidad.Comic;



/**
 * 
 * <b>DescripciÃ³n:<b> Clase que implementa los metodos declarados en la interface IGestionarComraComicLocal
 * <b>Caso de Uso:<b> SEMILLERO 2021
 * @author David Erazo Arcos
 * @version 1.0 
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarCompraComicBean implements IGestionarComraComicLocal {

	@PersistenceContext
	public EntityManager em;
	
	/**
	*
	*Metodo encargado de la compra de n comics retornando un ResultadoDTO que confirma si se hizo la compra o no
	* @author David Erazo Arcos
	* @version 1.0 
	*/
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	@Override
	public ResultadoDTO compraComic(Long idComic, integer cantidad) {
		String consulta = "UPDATE Comic c  WHERE c.id = :idComic";
		Integer cantidadBD=0;         //Atributo que almacena la cantidad de comics que hay en stock
	try {
		
			Query consultaNativa = em.createQuery(consulta);
			consultaNativa.setParameter("idComic", idComic);
			ConsultaCantidadComicDTO = (ConsultaCantidadComicDTO) consultaNativa.getSingleResult();
			cantidadBD=ConsultaCantidadComicDTO.getCantidad();
			
			
			
			if(ConsultaCantidadComicDTO.getEstadoEnum().equals(EstadoEnum.ACTIVO))
			{
				if(cantidadBD<cantidad)
					throw new runtimeExceprion("la cantidad existente del comic es "+cantidadBD+ " y supera la ingresada");
				if(cantidadBD>cantidad){
					consultaNombrePrecioDTO.setExitoso(true);
					consultaNombrePrecioDTO.setMensajeEjecucion("la compra del comic"+consultaNombrePrecioDTO.getNombre()"fue exitosa");
					consultaNombrePrecioDTO.setCantidad("cantidad",cantidadBD-cantidad);
				}
				else{
					consultaNombrePrecioDTO.setExitoso(true);
					consultaNombrePrecioDTO.setMensajeEjecucion("la compra del comic"+consultaNombrePrecioDTO.getNombre()"fue exitosa");	
					consultaNombrePrecioDTO.setCantidad("cantidad",cantidadBD-cantidad);
					consultaNombrePrecioDTO.setParameter("estado", EstadoEnum.ACTIVO);
				
				}
			}
			else{
				throw new runtimeExceprion("el comic seleccionado no cuena con stock en bodega");
			}
			
			consulta.executeUpdate();
			
		} catch (Exception e) {
			consultaNombrePrecioDTO.setExitoso(false);
			consultaNombrePrecioDTO.setMensajeEjecucion("Se ha presentado un error tecnico al consultar el comic");
		}

		return consultaNombrePrecioDTO;
	}
	
	
	
	
	/**
	 * 
	 * Metodo encargado de transformar un comic a un comicDTO
	 * 
	 * @param comic
	 * @return
	 */
	private ComicDTO convertirComicToComicDTO(Comic comic) {
		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId(comic.getId());
		comicDTO.setNombre(comic.getNombre());
		comicDTO.setEditorial(comic.getEditorial());
		comicDTO.setTematicaEnum(comic.getTematicaEnum());
		comicDTO.setColeccion(comic.getColeccion());
		comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
		comicDTO.setPrecio(comic.getPrecio());
		comicDTO.setAutores(comic.getAutores());
		comicDTO.setColor(comic.getColor());
		comicDTO.setFechaVenta(comic.getFechaVenta());
		comicDTO.setEstadoEnum(comic.getEstadoEnum());
		comicDTO.setCantidad(comic.getCantidad());
		return comicDTO;
	}

	/**
	 * 
	 * Metodo encargado de transformar un comicDTO a un comic
	 * 
	 * @param comic
	 * @return
	 */
	private Comic convertirComicDTOToComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
		comic.setId(comicDTO.getId());
		comic.setNombre(comicDTO.getNombre());
		comic.setEditorial(comicDTO.getEditorial());
		comic.setTematicaEnum(comicDTO.getTematicaEnum());
		comic.setColeccion(comicDTO.getColeccion());
		comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
		comic.setPrecio(comicDTO.getPrecio());
		comic.setAutores(comicDTO.getAutores());
		comic.setColor(comicDTO.getColor());
		comic.setFechaVenta(comicDTO.getFechaVenta());
		comic.setEstadoEnum(comicDTO.getEstadoEnum());
		comic.setCantidad(comicDTO.getCantidad());
		return comic;
	}
	
	
	
	
}
