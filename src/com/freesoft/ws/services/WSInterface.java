
package com.freesoft.ws.services;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSInterface", targetNamespace = "http://interfaces.ws.freesoft.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WSInterface {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String printMessage();

}
