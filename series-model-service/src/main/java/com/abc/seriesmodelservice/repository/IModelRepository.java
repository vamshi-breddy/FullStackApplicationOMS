package com.abc.seriesmodelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.abc.seriesmodelservice.entity.ModelEntity;

public interface IModelRepository extends JpaRepository<ModelEntity,String> {

}
