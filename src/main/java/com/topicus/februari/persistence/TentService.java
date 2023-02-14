package com.topicus.februari.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topicus.februari.domain.Tent;

@Service
public class TentService {
	@Autowired
	private TentRepository he;
	
	public void TentOpslaan(String eventnaam) {
		Tent tent = new Tent();
		tent.setName(eventnaam);
		he.save(tent);
	}
	
	public Iterable<Tent> geefAlles() {
		return he.findAll();
	}
}
