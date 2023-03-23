package it.ripasso.management.service;

import it.ripasso.management.dto.DeviceDto;
import it.ripasso.management.model.Area;
import it.ripasso.management.model.Device;
import it.ripasso.management.repository.DeviceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeviceServiceImpl implements DeviceService{

    @Autowired
    private DeviceRepository repo;

    @Override
    public Device save(DeviceDto deviceDto) {
        ModelMapper modelMapper = new ModelMapper();
        return repo.save(modelMapper.map(deviceDto, Device.class));
    }

    @Override
    public Optional<Device> findById(Long id) {
        return repo.findById(id);
    }
}
