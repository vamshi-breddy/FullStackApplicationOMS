package com.abc.seriesmodelservice.business;

import java.util.List;

import org.springframework.stereotype.Component;

import com.abc.seriesmodelservice.entity.ModelEntity;


public interface ISeriesModelServiceBusiness {

	List<ModelEntity> getfilterbyseriesid(int series_id);

}
