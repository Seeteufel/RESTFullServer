package org.med.service;

import java.util.*;
import javax.ws.rs.core.Application;

public class AlarmsRepository extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(AlarmsResource.class);
        return set;
    }


}
