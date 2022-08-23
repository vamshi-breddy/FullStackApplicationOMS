package com.abc.accessoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.accessoryservice.entity.AccessoryEntity;
import com.abc.accessoryservice.service.IAccessoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/a")
public class AccessoryServiceController {
       
	@Autowired
        IAccessoryService accessserv;
       
	@GetMapping("/accessory")
	public List<AccessoryEntity> getAccessories(){
		return accessserv.getAccessNames();
	}
	
	@GetMapping("/access/{model_id}")
	public List<AccessoryEntity> getAccessoryofModel(@PathVariable int model_id){
		return accessserv.getAccessOfModel(model_id);
		
	}

     
        
}
