package com.topicus.februari.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.topicus.februari.domain.EventM;
import com.topicus.februari.persistence.EventService;

@RestController
public class EventEndpoint {
	
	@Autowired
	private EventService es;
	
	
	
	@GetMapping("/eventm/ownextrainfo")
	public void justTrying() {
		System.out.println("go");
	}
	@PostMapping("/eventm/ownextrainfo")
	public void justTrying2() {
		es.EventOpslaan();
		System.out.println("another");
	}
	@GetMapping("/eventm/metpad/{eventname}")
	public void metpad( @PathVariable("eventname") String eventnaam ) {
		System.out.println("met padnaam: "+eventnaam);
	}
	@GetMapping("/eventm/metparam")
	public void metparam(@RequestParam("getal") int getal) {
		System.out.println("param: "+getal);
	}
	@PostMapping("/eventm/metbody")
	public void metbody(@RequestBody EventM e) {
		System.out.println(e.getTitle());
	}
	@GetMapping("/eventm/eventterug")
	public EventM metEventTerug() {
		System.out.println("een event krijgen");
		return new EventM();
	}

}
















