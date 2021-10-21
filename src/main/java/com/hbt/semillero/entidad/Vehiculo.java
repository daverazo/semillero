package com.hbt.semillero.entidad;

import java.math.BigDecimal;

public class Vehiculo {
 
	private String color;
	private String tipoVehiculo;
	private int numeroLlantas;
	private int numeroAsientos;
	private boolean requiereLicencia;
	private BigDecimal precio;
	
	
/**
 * 
 * Metodo encargado de retornar el valor del atributo color
 * <b>Caso de Uso</b>
 * @author TAD
 * 
 * @return
 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * Metodo encargado de modificar el valor del atributo
	 * <b>Caso de Uso</b>
	 * @author TAD
	 * 
	 * @param color
	 */

	public void setColor(String color) {
		this.color = color;
	}
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public int getNumeroLlantas() {
		return numeroLlantas;
	}
	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}
	public int getNumeroAsientos() {
		return numeroAsientos;
	}
	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}
	public boolean isRequiereLicencia() {
		return requiereLicencia;
	}
	public void setRequiereLicencia(boolean requiereLicencia) {
		this.requiereLicencia = requiereLicencia;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
}
