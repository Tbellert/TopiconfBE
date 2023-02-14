package com.topicus.februari.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.topicus.februari.domain.EventM;

@RestController
public class EventEndpoint {
	
	@GetMapping("/ownextrainfo")
	public void justTrying() {
		System.out.println("go");
	}
	@PostMapping("/ownextrainfo")
	public void justTrying2() {
		System.out.println("another");
	}
	@GetMapping("/metpad/{eventname}")
	public void metpad( @PathVariable("eventname") String eventnaam ) {
		System.out.println("met padnaam: "+eventnaam);
	}
	@GetMapping("/metparam")
	public void metparam(@RequestParam("getal") int getal) {
		System.out.println("param: "+getal);
	}
	@PostMapping("/metbody")
	public void metbody(@RequestBody EventM e) {
		System.out.println(e.getTitle());
	}
	@GetMapping("/eventterug")
	public EventM metEventTerug() {
		System.out.println("een event krijgen");
		return new EventM();
	}

}
















