package com.abc.colorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.colorservice.entity.ColorServiceEntity;

public interface IColorServiceRepository extends JpaRepository<ColorServiceEntity,String>{

}
