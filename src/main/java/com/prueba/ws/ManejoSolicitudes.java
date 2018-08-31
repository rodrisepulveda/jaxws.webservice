package com.prueba.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.prueba.ws.pojos.RequestHeader;
import com.prueba.ws.pojos.SolicitudesResponse;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface ManejoSolicitudes {

	@WebMethod(operationName = "obtenerSolicitudes")
	@RequestWrapper(localName = "obtenerSolicitudesReqWrap", className = "com.prueba.ws.pojos.ObtenerSolicitudesReqWrap", partName = "param_request")
	@ResponseWrapper(localName = "obtenerSolicitudesRespWrap", className = "com.prueba.ws.pojos.ObtenerSolicitudesRespWrap", partName = "datos_response")
	@WebResult(name = "solicitudesResponse")
	SolicitudesResponse obtenerSolicitudes(@WebParam(name = "requestHeader", header = true) RequestHeader requestHeader,
			@WebParam(name = "rut") String rut, @WebParam(name = "nombre") String nombre);

}
