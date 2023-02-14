package com.topicus.februari.persistence;

import com.topicus.februari.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository pr;

    public Iterable<Person> returnAllPersons(){
        return pr.findAll();
    }

    public void savePerson(Person person) {
        pr.save(person);
    }
}
