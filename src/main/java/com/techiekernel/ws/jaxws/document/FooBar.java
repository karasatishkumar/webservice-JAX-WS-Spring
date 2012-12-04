package com.techiekernel.ws.jaxws.document;

/**
 * Service end point interface
 * @author satish
 *
 */
public interface FooBar {
	String callFooBar(String name);
	
	Server getServerDetail(String client);
}
