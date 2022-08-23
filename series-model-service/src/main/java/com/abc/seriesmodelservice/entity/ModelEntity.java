package com.abc.seriesmodelservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="model")
public class ModelEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MODEL_ID")
	private int model_id;
	
	@Column(name="SERIES_ID")
	private int series_id;
	
	@Column(name="MODEL_NAME")
	private String model_name;
	
	@Column(name="MODEL_PRICE")
	private int model_price;

	public ModelEntity() {
		
	}
	
	public ModelEntity(int model_id, int series_id, String model_name, int model_price) {
		super();
		this.model_id = model_id;
		this.series_id = series_id;
		this.model_name = model_name;
		this.model_price = model_price;
	}

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}

	public int getSeries_id() {
		return series_id;
	}

	public void setSeries_id(int series_id) {
		this.series_id = series_id;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public int getModel_price() {
		return model_price;
	}

	public void setModel_price(int model_price) {
		this.model_price = model_price;
	}
	
}
