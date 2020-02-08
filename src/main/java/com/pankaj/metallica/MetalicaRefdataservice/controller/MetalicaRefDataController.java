package com.pankaj.metallica.MetalicaRefdataservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetalicaRefDataController {
	
	@GetMapping("/ref-data-service")
	public LocationBean getLocation(@RequestParam String location) {
		
		return new LocationBean(123L, location, 125.44555f, 1.0245544f);
		
	}

}
