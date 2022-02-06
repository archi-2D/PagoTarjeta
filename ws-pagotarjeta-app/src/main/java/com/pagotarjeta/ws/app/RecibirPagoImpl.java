package com.pagotarjeta.ws.app;
import javax.jws.*; 

@SuppressWarnings("restriction")
@WebService(endpointInterface = "com.pagotarjeta.ws.app.RecibirPago")
public class RecibirPagoImpl implements RecibirPago{

	public String realizarPago(String numeroTarjeta) {
		String resultado = "Tarjeta no valida";
		
		if(numeroTarjeta.equals("1234")) {
			resultado = "Pago Exitoso";
		}
		
		return resultado;
	}

}
