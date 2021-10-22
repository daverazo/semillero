package com.hbt.semillero.enums;

public enum TipoVehiculoEnum {
	
	TERRESTRE("Terrestre"),
	ACUATICO("Acuatico"),
	AEREO("Aereo");

	private String tipo;
	
	TipoVehiculoEnum(String tipo)
	{
		this.tipo =tipo;	
	}

	public String getTipo() {
		return tipo;
	}
	
	
	
}
