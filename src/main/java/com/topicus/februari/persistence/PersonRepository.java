package com.topicus.februari.persistence;

import com.topicus.februari.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository extends CrudRepository<Person, Long> {
}

