package com.abc.colorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.colorservice.entity.ColorServiceEntity;
import com.abc.colorservice.service.IColorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/c")
public class ColorServiceController {

	@Autowired
	IColorService colorserv;
	
	@GetMapping("/colors")
	public List<ColorServiceEntity> getColors(){
		return colorserv.getColorNames();
		
	}
	
	@GetMapping("/col/{model_id}")
	public List<ColorServiceEntity> getColorsOfModel(@PathVariable int model_id){
		return colorserv.getColorNamesOfModel(model_id);
		
	}

}
