package dev.sonnyjon.sfgdi.repositories;

/**
 * Created by Sonny on 5/22/2022.
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
