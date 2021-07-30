package org.med.service;

import org.glassfish.jersey.server.ResourceConfig;

public class Application extends ResourceConfig {
    public Application() {
        register(new Binder());
        packages(true, "org.med.service");
    }
}
