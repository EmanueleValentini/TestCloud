package it.ripasso.management.controller;

import it.ripasso.management.dto.DeviceDto;
import it.ripasso.management.model.Area;
import it.ripasso.management.model.Device;
import it.ripasso.management.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DeviceControllerImpl implements DeviceController{

    @Autowired
    private DeviceService service;
    @PostMapping
    @Override
    public ResponseEntity<Device> save(DeviceDto deviceDto) {
        Device savedDevice = service.save(deviceDto);
        return new ResponseEntity<>(savedDevice, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<Device>> findById(@PathVariable("id") Long id) {
        Optional<Device> foundDevice = service.findById(id);
        return new ResponseEntity<>(foundDevice,HttpStatus.FOUND);
    }
}
