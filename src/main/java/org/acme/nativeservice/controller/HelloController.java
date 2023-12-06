package org.acme.nativeservice.controller;

import com.github.javafaker.Faker;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.acme.nativeservice.model.ResponsePayload;

import java.time.LocalDateTime;

@Path("/")
public class HelloController {
    @GET
    public Response greeting(){
        ResponsePayload responsePayload = new ResponsePayload();
        Faker faker = new Faker();
        responsePayload.message = faker.beer().name();
        responsePayload.dataHora = LocalDateTime.now();
        return Response.ok().entity(responsePayload).build();
    }
}
