
package com.prueba.ws;

import java.util.LinkedList;
import java.util.List;

import javax.jws.WebService;

import com.prueba.ws.pojos.RequestHeader;
import com.prueba.ws.pojos.Solicitud;
import com.prueba.ws.pojos.SolicitudesResponse;
import com.sun.xml.ws.developer.SchemaValidation;

@WebService(endpointInterface = "com.prueba.ws.ManejoSolicitudes")
@SchemaValidation
public class ManejoSolicitudesImpl implements ManejoSolicitudes {

	public SolicitudesResponse obtenerSolicitudes(RequestHeader requestHeader, String rut, String nombre) {

		SolicitudesResponse solicitudesResponse = new SolicitudesResponse();

		solicitudesResponse.setIdSolicitud(2L);

		solicitudesResponse.setNombreSolicitud("la solicitud");

		List<Solicitud> listaSolicitudes = new LinkedList<Solicitud>();

		Solicitud solicitud = new Solicitud();

		solicitud.setCodigo(1);

		solicitud.setNombre("El nombre");

		listaSolicitudes.add(solicitud);

		Solicitud solicitud2 = new Solicitud();

		solicitud2.setCodigo(2);

		solicitud2.setNombre("El nombre2");

		listaSolicitudes.add(solicitud2);

		solicitudesResponse.setListaSolicitudes(listaSolicitudes);

		return solicitudesResponse;

	}

}
