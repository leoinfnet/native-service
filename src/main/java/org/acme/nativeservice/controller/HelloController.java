package org.acme.nativeservice.controller;

import com.github.javafaker.Faker;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.acme.nativeservice.model.ResponsePayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

@Path("/")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GET
    public Response greeting(){
        ResponsePayload responsePayload = new ResponsePayload();
        Faker faker = new Faker();
        responsePayload.message = faker.beer().name();
        responsePayload.dataHora = LocalDateTime.now();
        logger.info(responsePayload.toString());
        return Response.ok().entity(responsePayload).build();
    }
}
