package be.abis.helloworld.controller;

import be.abis.helloworld.model.Person;
import be.abis.helloworld.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApiController {

    @Autowired
    PersonService personService;

    @GetMapping("/api/persons/{id}")
    public Person findPersonById(@PathVariable int id){
        return personService.findPersonById(id);
    }
}
