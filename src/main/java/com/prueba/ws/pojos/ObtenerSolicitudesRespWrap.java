package com.prueba.ws.pojos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "obtenerSolicitudesRespWrap")
@XmlAccessorType(XmlAccessType.FIELD)
public class ObtenerSolicitudesRespWrap implements Serializable {

	/**
	 * Serie.
	 */
	private static final long serialVersionUID = -5935386020350675840L;

	@XmlElement(name = "solicitudesResponse", required = true)
	private SolicitudesResponse solicitudesResponse;

	public SolicitudesResponse getSolicitudesResponse() {
		return solicitudesResponse;
	}

	public void setSolicitudesResponse(SolicitudesResponse solicitudesResponse) {
		this.solicitudesResponse = solicitudesResponse;
	}

}