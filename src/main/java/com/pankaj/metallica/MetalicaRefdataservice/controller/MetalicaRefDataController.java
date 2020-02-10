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
	CounterPartyRepository counterPartService;
	
	@GetMapping("/ref-data-service")
	public LocationBean getLocation(@RequestParam String location) {
	
		try {
			LocationBean locationBean = locationService.findById(Long.parseLong(location)).get();

			return locationBean;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/ref-comodity-service")
	public ComodityBean getCommodity(@RequestParam String comodityId) {
		Optional<ComodityBean> findById = comodityService.findById(Long.parseLong(comodityId));
		return findById.get();
	}
	@GetMapping("/ref-countParty")
	public CounterPartyBean getCounterParty(@RequestParam String partyId) {
		Optional<CounterPartyBean> findById = counterPartService.findById(partyId.toUpperCase());
		return findById.get();
	}

}
