package com.hbt.semillero.enums;

/**
 * 
 * <b>Descripción:<b> Clase que determina la 
 * enumeracion para representar los tipos de tematica aceptados por un comic
 * <b>Caso de Uso:<b> 
 * @author David Erazo Arcos
 * @version
 */

public enum TematicaEnum {

	AVENTURAS("enum.tematica.Aventura"),
	BELICO("enum.tematica.Belico"),
	HUMORISTICO("enum.tematica.Humoristico"),
	DEPORTIVO("enum.tematica.Deportivo"),
	FANTASTICO("enum.tematica.Fantastico"),
	CIENCIA_FICCION("enum.tematica.Ciencia_Ficcion"),
	HISTORICO("enum.tematica.Historico"),
	HORROR("enum.tematica.Horror"),
	
	;
	private String descripcion;
	
	
	TematicaEnum (String descripcion){
		
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
