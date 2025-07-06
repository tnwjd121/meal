package com.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.domain.Food;
import com.test.test.domain.FoodRep;

@RestController
@CrossOrigin
public class FoodController {
	
	@Autowired
	private FoodRep foodRep;
	
	@GetMapping("/foods")
	public Iterable<Food> getFood() {
		return foodRep.findAll();
	}

}
