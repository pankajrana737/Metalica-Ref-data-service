package com.pankaj.metallica.MetalicaRefdataservice.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CounterPartyBean {
	@Id
	private String counterPartyID;
	
	private String counterPartyName;

	public String getCounterPartyID() {
		return counterPartyID;
	}

	public void setCounterPartyID(String counterPartyID) {
		this.counterPartyID = counterPartyID;
	}

	public String getCounterPartyName() {
		return counterPartyName;
	}

	public void setCounterPartyName(String counterPartyName) {
		this.counterPartyName = counterPartyName;
	}

	@Override
	public String toString() {
		return "CounterPartyBean [counterPartyID=" + counterPartyID + ", counterPartyName=" + counterPartyName + "]";
	}
	
	

}
