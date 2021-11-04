package com.hbt.semillero.enums;

public enum EstadoEnum {

	ACTIVO("enum.estado.Activo"),
	INACTIVO("enum.estado.Inactivo"),
	;
	
	private String descripcion;
	
	
	EstadoEnum (String descripcion){
		
		this.descripcion=descripcion;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo descripcion
	 * @return El descripcion asociado a la clase
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	

	
}
