package it.ripasso.management.service;

import it.ripasso.management.dto.DeviceDto;
import it.ripasso.management.model.Device;

import java.util.Optional;

public interface DeviceService {

    Device save(DeviceDto deviceDto);

    Optional<Device> findById(Long id);
}
