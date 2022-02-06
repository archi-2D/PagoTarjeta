package com.pagotarjeta.ws.app;
import javax.jws.*;

@SuppressWarnings("restriction")
@WebService
public interface RecibirPago {
	@WebMethod(operationName="recibirPago")
	@WebResult(name="respuestaPago") String realizarPago(@WebParam(name="numeroTarjeta") String numeroTarjeta);
}
