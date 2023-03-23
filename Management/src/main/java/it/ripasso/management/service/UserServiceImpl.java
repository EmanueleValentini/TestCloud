package it.ripasso.management.service;

import it.ripasso.management.dto.UserDto;
import it.ripasso.management.model.Device;
import it.ripasso.management.model.User;
import it.ripasso.management.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repo;

    @Override
    public User save(UserDto userDto) {
        ModelMapper modelMapper = new ModelMapper();
        return repo.save(modelMapper.map(userDto, User.class));
    }

    @Override
    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }
}
