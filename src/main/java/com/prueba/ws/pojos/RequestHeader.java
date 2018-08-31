package com.prueba.ws.pojos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "requestHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestHeader implements Serializable {

	/**
	 * Serie.
	 */
	private static final long serialVersionUID = 2620759699682682269L;

	@XmlElement(name = "idSession", required = true)
	private String idSession;

	@XmlElement(name = "nombreUsuario", required = true)
	private String nombreUsuario;

	public String getIdSession() {
		return idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

}
