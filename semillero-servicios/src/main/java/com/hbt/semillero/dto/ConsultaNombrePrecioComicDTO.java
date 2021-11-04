package com.hbt.semillero.dto;

import java.math.BigDecimal;

public class ConsultaNombrePrecioComicDTO extends ResultadoDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private BigDecimal precio;
	
	
	

	public ConsultaNombrePrecioComicDTO(boolean exitoso, String mensajeEjecucion, String nombre, BigDecimal precio) {
		super(exitoso, mensajeEjecucion);
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	
	public ConsultaNombrePrecioComicDTO(boolean exitoso, String mensajeEjecucion) {
		super(exitoso, mensajeEjecucion);
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}

