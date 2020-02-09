package com.pankaj.metallica.MetalicaRefdataservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.metallica.MetalicaRefdataservice.bean.ComodityBean;
import com.pankaj.metallica.MetalicaRefdataservice.bean.ComodityRepository;
import com.pankaj.metallica.MetalicaRefdataservice.bean.CounterPartyBean;
import com.pankaj.metallica.MetalicaRefdataservice.bean.CounterPartyRepository;
import com.pankaj.metallica.MetalicaRefdataservice.bean.LocationBean;
import com.pankaj.metallica.MetalicaRefdataservice.bean.LocationRepository;

@RestController
public class MetalicaRefDataController {
	
	@Autowired
	LocationRepository locationService;
	@Autowired
	ComodityRepository comodityService;
	@Autowired
	CounterPartyRepository CounterPartService;
	
	@GetMapping("/ref-data-service")
	public LocationBean getLocation(@RequestParam String location) {
		long locationId = Long.parseLong(location);
		System.out.println(locationId);
	
		return locationService.findLocationbyId(locationId);
		
	}

}
