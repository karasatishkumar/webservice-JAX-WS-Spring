package com.techiekernel.ws.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.techiekernel.ws.jaxws.document.FooBar;
import com.techiekernel.ws.jaxws.document.Server;

@WebService
public class FooBarWebService {
	private FooBar fooBar;

	@WebMethod(exclude=true)
	public void setFooBar(FooBar fooBar) {
		this.fooBar = fooBar;
	}
	
	@WebMethod(operationName="callFooBar")
	public String callFooBar(String name){
		return fooBar.callFooBar(name);
	}
	
	@WebMethod(operationName="getServerDetail")
	public Server getServerDetail(String client){
		return fooBar.getServerDetail(client);
	}
}
