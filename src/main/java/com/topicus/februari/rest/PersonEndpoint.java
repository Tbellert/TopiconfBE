package com.topicus.februari.rest;

import com.topicus.februari.domain.Person;
import com.topicus.februari.persistence.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class PersonEndpoint {

    @Autowired
    private PersonService ps;

    @GetMapping("person/returnAllPersons")
    public Iterable<Person> justTrying() {
        return ps.returnAllPersons();
    }

    @GetMapping("person/metpad/{personname}")
    public void metpad(@PathVariable("personname") String persoonnaam){
        System.out.println("met padnaam: " + persoonnaam);
    }

    @GetMapping("person/metparam")
    public void metparam(@RequestParam("naam") String naam){
        System.out.println("param: " + naam);
    }

    @PostMapping("person/saveperson")
    public void savePerson(){
        Person person = new Person();
        person.setName("Roger Wolf");
        person.setDateofbirth(LocalDate.of(1985, 10, 04));
        person.setHometown("Arnhem");
        person.setSpeaker(false);
        ps.savePerson(person);
    }

}
