package be.abis.helloworld;

import be.abis.helloworld.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldApplicationTests {
    @Autowired
    PersonService personService;

    @Test
    void person1IsSandy() {
        assertEquals("Sandy",personService.findPersonById(1).getFirstName());
    }

}
