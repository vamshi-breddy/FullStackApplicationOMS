package com.abc.seriesmodelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.seriesmodelservice.entity.ModelEntity;
import com.abc.seriesmodelservice.entity.SeriesEntity;
import com.abc.seriesmodelservice.seriesentityDTO.SeriesEntityDTO;
import com.abc.seriesmodelservice.service.ISeriesModelService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/s")
public class SeriesModelServiceController {
	@Autowired
	ISeriesModelService service;
	
	
	@GetMapping("/series")
	public List<SeriesEntityDTO> getSeries(){
		return service.getseriesname();
		
	}
	@GetMapping("/model/{series_id}")
	public List<ModelEntity> getModel(@PathVariable int series_id){
		return service.getmodelname(series_id);
		
	}

}
