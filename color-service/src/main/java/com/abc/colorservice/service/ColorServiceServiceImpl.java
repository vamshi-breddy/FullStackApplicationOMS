package com.abc.colorservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.colorservice.entity.ColorServiceEntity;
import com.abc.colorservice.repository.IColorServiceRepository;

@Service
public class ColorServiceServiceImpl implements IColorService {

	@Autowired
	IColorServiceRepository  colorrepo;
	
	public List<ColorServiceEntity> getColorNames() {
		// TODO Auto-generated method stub
		return colorrepo.findAll();
	}

	
	public List<ColorServiceEntity> getColorNamesOfModel(int model_id) {
		// TODO Auto-generated method stub
		return colorrepo.findAll().stream().filter(x->x.getModel_id()==model_id)
				.collect(Collectors.toList());
	}



}
