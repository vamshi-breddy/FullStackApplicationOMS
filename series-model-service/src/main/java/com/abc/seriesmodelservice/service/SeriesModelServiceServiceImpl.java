package com.abc.seriesmodelservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.seriesmodelservice.business.ISeriesModelServiceBusiness;
import com.abc.seriesmodelservice.entity.ModelEntity;
import com.abc.seriesmodelservice.entity.SeriesEntity;
import com.abc.seriesmodelservice.repository.IModelRepository;
import com.abc.seriesmodelservice.repository.ISeriesRepository;
import com.abc.seriesmodelservice.seriesentityDTO.SeriesEntityDTO;

@Service
public class SeriesModelServiceServiceImpl implements ISeriesModelService {
	@Autowired
	ISeriesRepository seriesrepo;

	@Autowired
	IModelRepository modelrepo;

	@Autowired
	ISeriesModelServiceBusiness serbusiness;

	public List<SeriesEntityDTO> getseriesname() {
		return seriesrepo.getseriesnames();
	}

	public List<ModelEntity> getmodelname(int series_id) {
		// TODO Auto-generated method stub
		return serbusiness.getfilterbyseriesid(series_id);
	}
}
