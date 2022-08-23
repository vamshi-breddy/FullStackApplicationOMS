package com.abc.accessoryservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accessory")
public class AccessoryEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ACCESS_ID")
	private int access_id;
	
	@Column(name="MODEL_ID")
	private int model_id;
	
	@Column(name="ACCESS_NAME")
	private String access_name;
	
	@Column(name="ACCESS_PRICE")
	private int access_price;

	public AccessoryEntity() {
		
	}
	
	public AccessoryEntity(int access_id, int model_id, String access_name, int access_price) {
		super();
		this.access_id = access_id;
		this.model_id = model_id;
		this.access_name = access_name;
		this.access_price = access_price;
	}

	public int getAccess_id() {
		return access_id;
	}

	public void setAccess_id(int access_id) {
		this.access_id = access_id;
	}

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}

	public String getAccess_name() {
		return access_name;
	}

	public void setAccess_name(String access_name) {
		this.access_name = access_name;
	}

	public int getAccess_price() {
		return access_price;
	}

	public void setAccess_price(int access_price) {
		this.access_price = access_price;
	}
	
	
}
