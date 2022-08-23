package com.abc.seriesmodelservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="series")
public class SeriesEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SERIES_ID")
	private int series_id;
	
	@Column(name="SERIES_NAME")
	private String series_name;

	public SeriesEntity() {
		
	}
	
	public SeriesEntity(int series_id, String series_name) {
		super();
		this.series_id = series_id;
		this.series_name = series_name;
	}

	public int getSeries_id() {
		return series_id;
	}

	public void setSeries_id(int series_id) {
		this.series_id = series_id;
	}

	public String getSeries_name() {
		return series_name;
	}

	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}
	
	
}
