package org.med.service;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.med.alarm.Alarm;

import java.util.List;


@Path("/alarms")

public class AlarmsResource {


    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello from Alarms Resource";
    }


    @GET
    @Path("/getAllAlarms")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alarm> getAllAlarms() {

        return null;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alarm> getAlarm(@PathParam("id") String id) {
        return null;
    }
}
