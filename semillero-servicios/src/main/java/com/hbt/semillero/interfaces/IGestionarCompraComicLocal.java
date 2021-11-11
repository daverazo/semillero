package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ResultadoDTO;



/**
 * 
 * <b>DescripciÃ³n:<b> Clase tipo interface que declara los metodos que implemeta el Bean
 * <b>Caso de Uso:<b> SEMILLERO 2021
 * @author David Erazo Arcos
 * @version 1.0 
 */

@Local
public interface IGestionarCompraComicLocal {
	
	//Declaracion de metodo de la compra de un comic
	public ResultadoDTO compraComic(Long idComic, Integer cantidad);

}
