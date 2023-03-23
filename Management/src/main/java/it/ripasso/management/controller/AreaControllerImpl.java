package it.ripasso.management.controller;

import it.ripasso.management.dto.AreaDto;
import it.ripasso.management.model.Area;
import it.ripasso.management.service.AreaService;
import it.ripasso.management.service.AreaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AreaControllerImpl implements AreaController{

    @Autowired
    private AreaServiceImpl areaService;

    @PostMapping()
    @Override
    public ResponseEntity<Area> save(@RequestBody AreaDto areaDto) {
        Area areaSaved = areaService.save(areaDto);
        return new ResponseEntity<>(areaSaved, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<Area>> findById(@PathVariable("id") Long id) {
        Optional<Area> areaFind = areaService.findById(id);
        return new ResponseEntity<>(areaFind,HttpStatus.FOUND);
    }
}
