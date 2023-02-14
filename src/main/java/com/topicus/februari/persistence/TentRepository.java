package com.topicus.februari.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.topicus.februari.domain.Tent;

@Component
public interface TentRepository extends CrudRepository<Tent, Long>{

}
