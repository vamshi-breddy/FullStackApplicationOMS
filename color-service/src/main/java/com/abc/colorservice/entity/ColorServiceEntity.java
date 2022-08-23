package com.abc.colorservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="color")
public class ColorServiceEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="COLOR_ID")
	private int color_id;
	
	@Column(name="MODEL_ID")
		private int model_id;
	
	@Column(name="COLOR_NAME")
	private String color_name;
	
	@Column(name="COLOR_PRICE")
	private int color_price;
	
	@Column(name="COLORS_QUAN_AVAILABLE")
	private int colors_quan_available;

	public int getColor_id() {
		return color_id;
	}

	public void setColor_id(int color_id) {
		this.color_id = color_id;
	}

	public int getModel_id() {
		return model_id;
	}

	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}

	public String getColor_name() {
		return color_name;
	}

	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}

	public int getColor_price() {
		return color_price;
	}

	public void setColor_price(int color_price) {
		this.color_price = color_price;
	}

	public int getColors_quan_available() {
		return colors_quan_available;
	}

	public void setColors_quan_available(int colors_quan_available) {
		this.colors_quan_available = colors_quan_available;
	}

	public ColorServiceEntity(int color_id, int model_id, String color_name, int color_price,
			int colors_quan_available) {
		super();
		this.color_id = color_id;
		this.model_id = model_id;
		this.color_name = color_name;
		this.color_price = color_price;
		this.colors_quan_available = colors_quan_available;
	}
	
	public ColorServiceEntity() {
		
	}
	
}
