package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.TipoVehiculoEnum;

public interface AccionesVehiculoInterface {
	
	public int obtenerVelocidadMaxima();
	
	public Long obternerPesoMaximoCarga();
	
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEmun) throws Exception;
	
	/**
	 * 
	 * Metodo encargado de acelerar el vehiculo--- la unica forma de que se pueda hacer un
	 * metodo implementado en una interfaz es haciendolo DEFAULT es algo que permite java 8
	 * <b>Caso de Uso</b>
	 * @author David Erazo Arcos
	 *
	 */
	public default void acelerar() {
		System.out.println("El vehiculo ha iniciado acelerar");
	}
}
