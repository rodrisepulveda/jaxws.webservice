package com.prueba.ws.pojos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "solicitud")
@XmlAccessorType(XmlAccessType.FIELD)
public class Solicitud implements Serializable {

	/**
	 * Serie.
	 */
	private static final long serialVersionUID = 1295144084035703402L;

	@XmlElement(name = "codigo", required = true)
	private int codigo;

	@XmlElement(name = "nombre", required = true)
	private String nombre;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
