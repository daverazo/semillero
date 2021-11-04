package com.hbt.semillero.enums;

public enum TipoVehiculoEnum {
	
	TERRESTRE("Terrestre",1),
	ACUATICO("Acuatico",2),
	AEREO("Aereo",3);

	private String tipo;
	private int identificador=0;
	
	TipoVehiculoEnum(String tipo,int id)
	{
		this.tipo =tipo;	
		this.identificador=id;
	}

	public String getTipo() {
		return tipo;
	}

	public Object getIdentificador() {
		return identificador;
	}
	
	
	
}
