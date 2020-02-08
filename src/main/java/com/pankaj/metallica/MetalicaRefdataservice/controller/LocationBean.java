package com.pankaj.metallica.MetalicaRefdataservice.controller;

public class LocationBean {
	private long id;	
	
	private String locationName;
		private float latitude;
		private float longitude;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public LocationBean(long id, String locationName, float latitude, float longitude) {
			super();
			this.id = id;
			this.locationName = locationName;
			this.latitude = latitude;
			this.longitude = longitude;
		}
		public String getLocationName() {
			return locationName;
		}
		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}
		public float getLatitude() {
			return latitude;
		}
		public void setLatitude(float latitude) {
			this.latitude = latitude;
		}
		public float getLongitude() {
			return longitude;
		}
		public void setLongitude(float longitude) {
			this.longitude = longitude;
		}
		public LocationBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
