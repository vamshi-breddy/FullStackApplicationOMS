package com.abc.seriesmodelservice.business;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abc.seriesmodelservice.entity.ModelEntity;
import com.abc.seriesmodelservice.entity.SeriesEntity;
import com.abc.seriesmodelservice.repository.IModelRepository;

@Component
public class SeriesModelServiceBusinessImpl implements ISeriesModelServiceBusiness {

	@Autowired
	IModelRepository modelrepo;

	public List<ModelEntity> getfilterbyseriesid(int series_id) {
		return modelrepo.findAll().stream().
				filter(x -> x.getSeries_id() == series_id).
				collect(Collectors.toList());
	}

}
