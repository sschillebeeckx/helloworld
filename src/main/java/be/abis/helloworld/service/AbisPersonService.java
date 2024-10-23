package be.abis.helloworld.service;

import be.abis.helloworld.model.Person;
import org.springframework.stereotype.Component;

@Component
public class AbisPersonService implements PersonService {

   @Override
    public Person findPersonById(int id) {
       System.out.println("bla");
        return new Person("Sandy",42);
    }


}
