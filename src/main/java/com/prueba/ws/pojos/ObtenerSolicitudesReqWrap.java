package com.prueba.ws.pojos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "obtenerSolicitudesReqWrap", propOrder = { "rut", "nombre" })
@XmlAccessorType(XmlAccessType.FIELD)
public class ObtenerSolicitudesReqWrap implements Serializable {

	/**
	 * Serie.
	 */
	private static final long serialVersionUID = -403207396561305397L;

	@XmlElement(name = "rut", required = true)
	private String rut;

	@XmlElement(name = "nombre", required = false)
	private String nombre;

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
