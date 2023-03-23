package it.ripasso.management.service;

import it.ripasso.management.dto.AreaDto;
import it.ripasso.management.model.Area;

import java.util.Optional;

public interface AreaService {

    Area save(AreaDto areaDto);

    Optional<Area> findById(Long id);
}
