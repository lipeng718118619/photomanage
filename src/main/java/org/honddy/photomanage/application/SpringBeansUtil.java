package org.honddy.photomanage.application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


/**
 * spring bean
 */
@Service(value = "springBeansUtil")
public class SpringBeansUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;

    }

    /**
     *get spring application context
     * @return ApplicationContext
     */
    public static ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }
}
