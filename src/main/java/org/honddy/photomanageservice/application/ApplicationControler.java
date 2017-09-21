package org.honddy.photomanageservice.application;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import javax.ws.rs.Path;
import java.util.Arrays;

/**
 * @author Honddy
 */
public class ApplicationControler extends ResourceConfig {

    public ApplicationControler() {

        this.register(RequestContextFilter.class);
        this.register(JacksonJsonProvider.class);
        injectJerseyResource();

    }

    /**
     * inject by @Path marked  jersey resource
     */
    private void injectJerseyResource() {

        String[] beanNames = SpringBeansUtil.getApplicationContext().getBeanNamesForAnnotation(Path.class);

        if (beanNames == null || beanNames.length == 0) {
            return;
        }

        Arrays.asList(beanNames).stream().forEach((beanName) -> {
            this.register(
                    SpringBeansUtil.getApplicationContext()
                            .getBean(beanName).getClass());
        });

    }
}