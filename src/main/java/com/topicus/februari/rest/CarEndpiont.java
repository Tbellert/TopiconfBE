package com.topicus.februari.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.topicus.februari.domain.Car;

@RestController
public class CarEndpiont {
	
	//@Autowired
	

	@GetMapping("/Car/update")
	public Iterable<Car> justTry() {
		System.out.println("abc");
		return null;
	}
	
	@PostMapping("/Car/add")
	public void justTry2(@RequestParam("param") String param) {
		System.out.println("abc2" + param);
	}
	
	@PostMapping("/Car/add2")
	public void justTry3(@RequestBody Car car) {
		System.out.println("abc-24" + car.getBrand());
		
	}
	
	
	@DeleteMapping("/Car/delete/{carid}")
	public void deleteCar(@PathVariable("carid") long carid) {
		System.out.println("abc3");
	}
}
