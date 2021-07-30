package org.med.service;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.core.Application;

public class SwaggerConfiguration extends Application {

    public SwaggerConfiguration() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/RESTFullServer/webapi");
        beanConfig.setResourcePackage(AlarmsResource.class.getPackage().getName());
        beanConfig.setTitle("Swagger API");
        beanConfig.setDescription("Alarms API");
        beanConfig.setScan(true);
    }
}
