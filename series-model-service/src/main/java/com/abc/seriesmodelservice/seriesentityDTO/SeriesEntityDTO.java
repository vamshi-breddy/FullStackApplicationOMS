package com.abc.seriesmodelservice.seriesentityDTO;

public class SeriesEntityDTO {

	private int series_id;

	private String series_name;

	public SeriesEntityDTO(String series_name,int series_id) {
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
