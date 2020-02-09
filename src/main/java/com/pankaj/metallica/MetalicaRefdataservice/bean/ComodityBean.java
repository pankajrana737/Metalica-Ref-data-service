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

}
