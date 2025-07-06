package com.test.test.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface EatRep extends JpaRepository<Eat, Long> {
	
	

}
