package com.topicus.februari.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.topicus.februari.domain.Tent;

@RestController
public class TentEndpoint {
	@GetMapping("tent/ownextrainfo")
	public void justTrying() {
		System.out.println("Hallo");
	}
	
	@PostMapping("tent/ownextrainfo")
	public void justTrying2() {
		System.out.println("Another");
	}
	
	@GetMapping("tent/metpad/{eventname}")
	public void metPad(@PathVariable("eventname") String eventnaam) {
		System.out.println("met padnaam " + eventnaam);
	}

	@GetMapping("tent/metparam")
	public void metParam(@RequestParam("getal") int getal, int nummer) {
		System.out.println("param " + getal + nummer);
	}
	
	@PostMapping("tent/metbody")
	public void metBody(@RequestBody Tent e) {
		System.out.println(e.getName());
	}
	
	@GetMapping("tent/metevent")
	public Tent metevent() {
		System.out.println("Dit is een tent");
		return new Tent();
	}

}
