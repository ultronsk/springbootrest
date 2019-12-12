package com.telusko;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@Autowired
	AlienRepository repo;
	
	@GetMapping("aliens")
	public List<Alien> getAliens()
	{
		List<Alien> aliens = (List<Alien>) repo.findAll();
		
//		List<Alien> aliens = new ArrayList<>();
		
//		Alien a1 = new Alien();
//		a1.setId(101);
//		a1.setName("Sumit");
//		a1.setPoints(99);
//		
//		Alien a2 = new Alien();
//		a2.setId(102);
//		a2.setName("Akash");
//		a2.setPoints(98);
//		
//		aliens.add(a1);
//		aliens.add(a2);
		
		return aliens;
	}

}
