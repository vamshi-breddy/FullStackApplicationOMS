package com.abc.colorservice.service;

import java.util.List;

import com.abc.colorservice.entity.ColorServiceEntity;

public interface IColorService {

	List<ColorServiceEntity> getColorNames();

	List<ColorServiceEntity> getColorNamesOfModel(int model_id);

}
