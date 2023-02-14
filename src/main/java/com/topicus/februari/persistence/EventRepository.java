package com.topicus.februari.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import com.topicus.februari.domain.EventM;

@Component
public interface EventRepository extends CrudRepository<EventM, Long>
{

}
