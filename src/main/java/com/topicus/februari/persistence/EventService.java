package com.topicus.februari.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topicus.februari.domain.EventM;

@Service
public class EventService {
	@Autowired
	private EventRepository er;
	
	public void EventOpslaan() {
		EventM mijnEvent = new EventM();
		mijnEvent.setTitle("Het openingsevent");
		er.save(mijnEvent);
	}

}
