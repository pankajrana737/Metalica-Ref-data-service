package com.pankaj.metallica.MetalicaRefdataservice.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CounterPartyBean {
	@Id
	private String counterPartyID;
	
	private String counterPartyName;
	
	

}
