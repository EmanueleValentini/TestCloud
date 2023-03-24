package it.ripasso.management.controller;

import it.ripasso.management.dto.UserDto;
import it.ripasso.management.model.Area;
import it.ripasso.management.model.User;
import it.ripasso.management.service.AreaService;
import it.ripasso.management.service.UserService;
import it.ripasso.management.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/user")
@RestController
@CrossOrigin("*")
public class UserControllerImpl implements UserController{

    @Autowired
    private UserService userService;

    @Autowired
    private AreaService areaService;

    @PostMapping("/{id_area}")
    @Override
    public ResponseEntity<User> save(@RequestBody UserDto userDto,@PathVariable("id_area") Long id_area) {
        User user = new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setEmail(userDto.getEmail());
        user.setBadge(userDto.getBadge());
        user.setBDay(userDto.getBDay());
        user.setActiveFlag(userDto.isActiveFlag());
        Area area = areaService.findById(id_area).get();
        user.setArea(area);
        User savedUser = userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") Long id) {
        Optional<User> userFind = userService.findById(id);
        return new ResponseEntity<>(userFind,HttpStatus.FOUND);
    }
}
