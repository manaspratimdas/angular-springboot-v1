package com.store.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STORE")
public class Store {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private Long id;
	
	@Column(name="StoreName")
	private String storeName;
	
	@Column(name="Location")
	private String location;

	
	public Store() {
		
	}


	public Store(String storeName, String location) {
		
		this.storeName = storeName;
		this.location = location;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Store [id=" + id + ", storeName=" + storeName + ", location=" + location + "]";
	}
	
	

}
