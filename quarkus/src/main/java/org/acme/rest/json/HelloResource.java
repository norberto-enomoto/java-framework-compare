package org.acme.rest.json;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloResource {

    @GET
    public String sayHello() {
        return "Hello World";
    }
}
