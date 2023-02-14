package com.topicus.februari.rest;

import com.topicus.februari.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonEndpoint {

//    @Autowired
//    PersonService ps;

    @GetMapping("returnAllPersons")
    public void justTrying() {
        System.out.println("go");
    }

    @GetMapping("metpad/{personname}")
    public void metpad(@PathVariable("personname") String persoonnaam){
        System.out.println("met padnaam: " + persoonnaam);
    }

    @GetMapping("metparam")
    public void metparam(@RequestParam("naam") String naam){
        System.out.println("param: " + naam);
    }


}
