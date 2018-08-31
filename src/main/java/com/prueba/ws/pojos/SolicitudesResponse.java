package com.prueba.ws.pojos;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "solicitudesResponse", propOrder = { "idSolicitud", "nombreSolicitud", "listaSolicitudes" })
@XmlAccessorType(XmlAccessType.FIELD)
public class SolicitudesResponse implements Serializable {

	/**
	 * Serie.
	 */
	private static final long serialVersionUID = 6763688956903041050L;

	@XmlElement(name = "idSolicitud", required = true)
	private Long idSolicitud;

	@XmlElement(name = "nombreSolicitud", required = false)
	private String nombreSolicitud;

	@XmlElement(name = "listaSolicitudes", required = true)
	private List<Solicitud> listaSolicitudes;

	public Long getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(Long idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public String getNombreSolicitud() {
		return nombreSolicitud;
	}

	public void setNombreSolicitud(String nombreSolicitud) {
		this.nombreSolicitud = nombreSolicitud;
	}

	public List<Solicitud> getListaSolicitudes() {
		return listaSolicitudes;
	}

	public void setListaSolicitudes(List<Solicitud> listaSolicitudes) {
		this.listaSolicitudes = listaSolicitudes;
	}

}
