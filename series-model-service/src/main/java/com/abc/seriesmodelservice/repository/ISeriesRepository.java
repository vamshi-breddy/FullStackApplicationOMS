package com.abc.seriesmodelservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.seriesmodelservice.entity.SeriesEntity;
import com.abc.seriesmodelservice.seriesentityDTO.SeriesEntityDTO;

@Repository
public interface ISeriesRepository extends JpaRepository<SeriesEntity,Integer> {
	
	@Query("select new com.abc.seriesmodelservice.seriesentityDTO.SeriesEntityDTO(s.series_name,s.series_id) from SeriesEntity s")
	public List<SeriesEntityDTO> getseriesnames();
	}
