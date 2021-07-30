package org.med.service;


import io.swagger.annotations.Api;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.med.alarm.Alarm;
import org.med.alarm.AlarmRepository;

import java.util.List;


@Path("/alarms")
@Api(value = "Alarms Service")
public class AlarmsResource {

    @Inject
    private AlarmRepository alarms;
//    private AlarmRepository alarms = new AlarmRepository();

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello from Alarms Resource";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alarm> getAllAlarms() {

        return alarms.getAllAlarms();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alarm> getAlarm(@PathParam("id") String id) {
        return null;
    }
}
