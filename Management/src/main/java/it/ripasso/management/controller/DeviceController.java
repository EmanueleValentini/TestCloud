package it.ripasso.management.controller;

import it.ripasso.management.dto.AreaDto;
import it.ripasso.management.dto.DeviceDto;
import it.ripasso.management.model.Device;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/device")
public interface DeviceController {

    @PostMapping()
    ResponseEntity<Device> save(@RequestBody DeviceDto deviceDto);

    @GetMapping("/{id}")
    ResponseEntity<Optional<Device>> findById(@PathVariable("id") Long id);
}

