package com.abc.accessoryservice.service;

import java.util.List;

import com.abc.accessoryservice.entity.AccessoryEntity;

public interface IAccessoryService {
	
	public List<AccessoryEntity> getAccessNames();


	public List<AccessoryEntity> getAccessOfModel(int model_id);



	}
