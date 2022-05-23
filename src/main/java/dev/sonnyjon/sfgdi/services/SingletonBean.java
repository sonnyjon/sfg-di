package dev.sonnyjon.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by Sonny on 5/23/2022.
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
