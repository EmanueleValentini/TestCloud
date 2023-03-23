package it.ripasso.management.controller;

import it.ripasso.management.dto.AreaDto;
import it.ripasso.management.model.Area;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/area")
public interface AreaController {

    @PostMapping()
    ResponseEntity<Area> save(@RequestBody AreaDto areaDto);

    @GetMapping("/{id}")
    ResponseEntity<Optional<Area>> findById(@PathVariable("id") Long id);
}
