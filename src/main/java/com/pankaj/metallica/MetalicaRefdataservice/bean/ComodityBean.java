package com.pankaj.metallica.MetalicaRefdataservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ComodityBean {
	@Id
	@Column(name = "Comodit_id")
	private  long id;
	private String comodityName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getComodityName() {
		return comodityName;
	}
	public void setComodityName(String comodityName) {
		this.comodityName = comodityName;
	}
	@Override
	public String toString() {
		return "ComodityBean [id=" + id + ", comodityName=" + comodityName + "]";
	}
	

}
