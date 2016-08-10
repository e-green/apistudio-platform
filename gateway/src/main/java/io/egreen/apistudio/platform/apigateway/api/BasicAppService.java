package io.egreen.apistudio.platform.apigateway.api;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by dewmal on 8/8/16.
 */
@Path("/")
public class BasicAppService {

    @GET
    @Path("/index")
    public Viewable version() {
        return new Viewable("/index");
    }


}
