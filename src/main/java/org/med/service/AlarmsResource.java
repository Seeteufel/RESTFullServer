package org.med.service;

import com.sun.tools.javac.util.List;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.med.alarm.Alarm;
import org.med.alarm.PerceivedSeverity;

import java.time.LocalDate;
import java.time.Month;



@Path("/alarms")
public class AlarmsResource {


    private List<Alarm> alarmsStorage = List.of(
    new Alarm("123",PerceivedSeverity.MAJOR, LocalDate.of(2021, Month.APRIL, 13), "lorem", "ipsum"),
    new Alarm("abc", PerceivedSeverity.MINOR, LocalDate.of(2021, Month.MARCH, 29), "olof", "Thor")
    );


    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello from Alarms Resource";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alarm> getAllAlarms() {
        return alarmsStorage;
    }

//    @GET
//    @Path("/{id}")
//    public List<Alarm> getAlarm(@PathParam("id") String id) {
//        return storage.stream()
//                .filter(a -> a.getNotificationIdentifier() == id)
//                .collect(Collectors.toList());
//    }
}
