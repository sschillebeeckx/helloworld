package be.abis.helloworld.service;

import be.abis.helloworld.model.Person;

public interface PersonService {

    public abstract  Person findPersonById(int id);
}
