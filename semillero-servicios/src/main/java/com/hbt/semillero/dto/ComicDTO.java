package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

public class ComicDTO implements Serializable {


	private Long id;
	private String nombre;
	private String Editorial;
	private TematicaEnum Tematica;
	private String Coleccion;
	private Integer numeroPagina;
	private BigDecimal precio;
	private String autores;
	private Boolean color;
	private LocalDate fechaVenta;
	private EstadoEnum estado;
	private Integer cantidad;
	private TematicaEnum tematicaEnum;
	
	
	
	public TematicaEnum getTematica() {
		return Tematica;
	}

	public void setTematica(TematicaEnum tematica) {
		Tematica = tematica;
	}

	public void setEstadoEnum(EstadoEnum estado) {
		this.estado = estado;
	}

	
	public ComicDTO() {
		super();
	}

	public void setTematicaEnum(TematicaEnum tematicaEnum) {
		this.tematicaEnum = tematicaEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tematicaEnum
	 * @return El tematicaEnum asociado a la clase
	 */
	public TematicaEnum getTematicaEnum() {
		return tematicaEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo estadoEnum
	 * @return El estadoEnum asociado a la clase
	 */
	

	
	
	
	
	
	/**
	 * Constructor de la clase.
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param fantastico
	 * @param coleccion
	 * @param numeroPagina
	 * @param precio
	 * @param autores
	 * @param color
	 * @param fechaVenta
	 * @param activo
	 * @param cantidad
	 */
	public ComicDTO(Long id, String nombre, String editorial, TematicaEnum fantastico, String coleccion, Integer numeroPagina,
			BigDecimal precio, String autores, Boolean color, LocalDate fechaVenta, EstadoEnum activo, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		Editorial = editorial;
		Tematica = fantastico;
		Coleccion = coleccion;
		this.numeroPagina = numeroPagina;
		this.precio = precio;
		this.autores = autores;
		this.color = color;
		this.fechaVenta = fechaVenta;
		this.estado = activo;
		this.cantidad = cantidad;
	}
	
	
	
	
	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	
	
	
	public Long getId() {
		return id;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo Editorial
	 * @return El editorial asociado a la clase
	 */
	public String getEditorial() {
		return Editorial;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo Editorial
	 * @param editorial El nuevo editorial a modificar.
	 */
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo Tematica
	 * @return El tematica asociado a la clase
	 */
	
	/**
	 * Metodo encargado de retornar el valor del atributo Coleccion
	 * @return El coleccion asociado a la clase
	 */
	public String getColeccion() {
		return Coleccion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo Coleccion
	 * @param coleccion El nuevo coleccion a modificar.
	 */
	public void setColeccion(String coleccion) {
		Coleccion = coleccion;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo numeroPagina
	 * @return El numeroPagina asociado a la clase
	 */
	public Integer getNumeroPaginas() {
		return numeroPagina;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo numeroPagina
	 * @param numeroPagina El nuevo numeroPagina a modificar.
	 */
	public void setNumeroPaginas(Integer numeroPagina) {
		this.numeroPagina = numeroPagina;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return precio;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo autores
	 * @return El autores asociado a la clase
	 */
	public String getAutores() {
		return autores;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo autores
	 * @param autores El nuevo autores a modificar.
	 */
	public void setAutores(String autores) {
		this.autores = autores;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * @return El color asociado a la clase
	 */
	public Boolean getColor() {
		return color;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(Boolean color) {
		this.color = color;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo fechaVenta
	 * @return El fechaVenta asociado a la clase
	 */
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo fechaVenta
	 * @param fechaVenta El nuevo fechaVenta a modificar.
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * @return El estado asociado a la clase
	 */
	public EstadoEnum getEstadoEnum() {
		return estado;
	}
	
	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * @return El cantidad asociado a la clase
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public void setExitoso(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setMensajeEjecucion(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
