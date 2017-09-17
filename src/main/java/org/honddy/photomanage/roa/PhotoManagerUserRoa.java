package org.honddy.photomanage.roa;

import org.glassfish.jersey.internal.inject.Custom;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/photo-manager/user")
@Component(value = "photoManagerUserRoa")
public class PhotoManagerUserRoa {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addUser(){
        return "{\"test\":\"test\"}";
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getUser()
    {
        return "{\"test\":\"test99999\"}";
    }

}
