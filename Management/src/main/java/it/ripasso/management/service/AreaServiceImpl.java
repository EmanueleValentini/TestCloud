package it.ripasso.management.service;

import it.ripasso.management.dto.AreaDto;
import it.ripasso.management.model.Area;
import it.ripasso.management.repository.AreaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AreaServiceImpl implements AreaService{

    @Autowired
    private AreaRepository repo;

    @Override
    public Area save(AreaDto areaDto) {
        ModelMapper modelMapper = new ModelMapper();
        return repo.save(modelMapper.map(areaDto, Area.class));
    }

    @Override
    public Optional<Area> findById(Long id) {
        return repo.findById(id);
    }
}
