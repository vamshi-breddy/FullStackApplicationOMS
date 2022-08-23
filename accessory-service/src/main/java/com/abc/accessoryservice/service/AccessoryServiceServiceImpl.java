package com.abc.accessoryservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.accessoryservice.entity.AccessoryEntity;
import com.abc.accessoryservice.repository.IAccessoryServiceRepository;

@Service
public class AccessoryServiceServiceImpl implements IAccessoryService {

	@Autowired
	IAccessoryServiceRepository accessrepo;
	
	public List<AccessoryEntity> getAccessNames() {
		// TODO Auto-generated method stub
		return accessrepo.findAll();
	}

	
	public List<AccessoryEntity> getAccessOfModel(int model_id) {
		// TODO Auto-generated method stub
		return accessrepo.findAll().stream().
				filter(x->x.getModel_id()==model_id).collect(Collectors.toList());
	}

}
