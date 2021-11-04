package com.hbt.semillero.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <b>Descripción:<b> Clase que determina el resultado para el ejercicio de la sesion12
 * <b>Caso de Uso:<b> 
 * @author David Erazo Arcos
 * @version
 */

public class EJERCICIO12DTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	
	
	private List<String> NombreComicsMenorLongitud=new ArrayList<String>();
	private List<String> NombreComicsMayorLongitud=new ArrayList<String>();
	private String mensajedeComicsMenorLongitud="Comics con longitud mayor ";
	private String mensajedeComicsMayorrLongitud="Comics con menor longitud";
	
	
	
	
	
	
	/**
	 * Constructor de la clase.
	 */
	public EJERCICIO12DTO() {
		super();
	}
	/**
	 * Constructor de la clase.
	 * @param nombreComicsMenorLongitud
	 * @param nombreComicsMayorLongitud
	 */
	public EJERCICIO12DTO(List<String> nombreComicsMenorLongitud, List<String> nombreComicsMayorLongitud) {
		super();
		NombreComicsMenorLongitud = nombreComicsMenorLongitud;
		NombreComicsMayorLongitud = nombreComicsMayorLongitud;
	}
	
	
	/**
	 * Metodo encargado de retornar el valor del atributo NombreComicsMenorLongitud
	 * @return El nombreComicsMenorLongitud asociado a la clase
	 */
	
	public List<String> getNombreComicsMenorLongitud() {
		return NombreComicsMenorLongitud;
	}
	
	
	
	
	/**
	 * Metodo encargado de retornar el valor del atributo mensajedeComicsMenorLongitud
	 * @return El mensajedeComicsMenorLongitud asociado a la clase
	 */
	public String getMensajedeComicsMenorLongitud() {
		return mensajedeComicsMenorLongitud;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo mensajedeComicsMenorLongitud
	 * @param mensajedeComicsMenorLongitud El nuevo mensajedeComicsMenorLongitud a modificar.
	 */
	public void setMensajedeComicsMenorLongitud(String mensajedeComicsMenorLongitud) {
		this.mensajedeComicsMenorLongitud = mensajedeComicsMenorLongitud;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo mensajedeComicsMayorrLongitud
	 * @return El mensajedeComicsMayorrLongitud asociado a la clase
	 */
	public String getMensajedeComicsMayorrLongitud() {
		return mensajedeComicsMayorrLongitud;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo mensajedeComicsMayorrLongitud
	 * @param mensajedeComicsMayorrLongitud El nuevo mensajedeComicsMayorrLongitud a modificar.
	 */
	public void setMensajedeComicsMayorrLongitud(String mensajedeComicsMayorrLongitud) {
		this.mensajedeComicsMayorrLongitud = mensajedeComicsMayorrLongitud;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo NombreComicsMenorLongitud
	 * @param nombreComicsMenorLongitud El nuevo nombreComicsMenorLongitud a modificar.
	 */
	public void setNombreComicsMenorLongitud(List<String> nombreComicsMenorLongitud) {
		NombreComicsMenorLongitud = nombreComicsMenorLongitud;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo NombreComicsMayorLongitud
	 * @return El nombreComicsMayorLongitud asociado a la clase
	 */
	public List<String> getNombreComicsMayorLongitud() {
		return NombreComicsMayorLongitud;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo NombreComicsMayorLongitud
	 * @param nombreComicsMayorLongitud El nuevo nombreComicsMayorLongitud a modificar.
	 */
	public void setNombreComicsMayorLongitud(List<String> nombreComicsMayorLongitud) {
		NombreComicsMayorLongitud = nombreComicsMayorLongitud;
	}
	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EJERCICIO12DTO [NombreComicsMenorLongitud=" + NombreComicsMenorLongitud + ", NombreComicsMayorLongitud="
				+ NombreComicsMayorLongitud + ", mensajedeComicsMenorLongitud=" + mensajedeComicsMenorLongitud
				+ ", mensajedeComicsMayorrLongitud=" + mensajedeComicsMayorrLongitud + "]";
	}
	
	
	
	
	
}


