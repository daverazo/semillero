package com.hbt.semillero.dto;

/**
 * 
 * <b>DescripciÃ³n:<b> 
 * <b>Caso de Uso:<b> SEMILLERO 2021
 * @author David Erazo Arcos
 * @version 1.0 
 */
public class ConsultaCantidadComicDTO extends ResultadoDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Atributos tipo Integer que se utiliza para almacenar la cantidad de comics en stock
	private Integer cantidad;
	
	
	public ConsultaCantidadComicDTO() {
		//Constructor vacio
	}
	
	//metodo para obtener la cantidad de comics en estock
	public Integer getCantidad() {
		return cantidad;
	}
	
	//metodo para asignar la cantidad de comics en stock
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}
