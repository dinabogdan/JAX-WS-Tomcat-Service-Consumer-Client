package com.freesoft.ws.client;

import com.freesoft.ws.services.WSImplementationService;
import com.freesoft.ws.services.WSInterface;

public class WSClient {
	public static void main(String [] args) {
		WSImplementationService webService = new WSImplementationService();
		WSInterface wsInterface= webService.getWSImplementationPort();
		System.out.println(wsInterface.printMessage());
	}

}
