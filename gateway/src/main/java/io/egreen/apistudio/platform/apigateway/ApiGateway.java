package io.egreen.apistudio.platform.apigateway;

import io.egreen.apistudio.bootstrap.ApiStudio;

import javax.ws.rs.ApplicationPath;

/**
 * Created by dewmal on 8/8/16.
 */
@ApplicationPath("/")
public class ApiGateway {

    public static void main(String[] args) {
        ApiStudio.boot(ApiGateway.class,"0.0.0.0",4949,"/api");
    }
}
