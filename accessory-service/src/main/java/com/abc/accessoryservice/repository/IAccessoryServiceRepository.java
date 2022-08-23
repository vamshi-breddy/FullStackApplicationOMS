package com.abc.accessoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.accessoryservice.entity.AccessoryEntity;

public interface IAccessoryServiceRepository extends 
                           JpaRepository<AccessoryEntity,String>{

}
