package com.abc.seriesmodelservice.service;

import java.util.List;

import com.abc.seriesmodelservice.entity.ModelEntity;
import com.abc.seriesmodelservice.entity.SeriesEntity;
import com.abc.seriesmodelservice.seriesentityDTO.SeriesEntityDTO;

public interface ISeriesModelService {

	public List<SeriesEntityDTO> getseriesname();

	public List<ModelEntity> getmodelname(int series_id);
}
