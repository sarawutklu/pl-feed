package com.example.plfeed.service.impl;

import java.util.List;
import com.example.plfeed.entity.User;
import com.example.plfeed.repository.UserRepository;
import com.example.plfeed.service.inf.UserService;
import com.example.plfeed.share.ModelMapperService;
import com.example.plfeed.vm.SaveUserVM;
import com.example.plfeed.vm.UserVm;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserVm> getUserAll() {
		List<User> users = userRepository.findAll();
		return ModelMapperService.mapList(users, UserVm.class);
	}

	@Override
	public UserVm getUser(String id) {

		User user = userRepository.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found user"));
		return modelMapper.map(user, UserVm.class);
	}

	@Override
	public boolean createUser(SaveUserVM user) {
		User saveUser = modelMapper.map(user, User.class);
		userRepository.save(saveUser);
		return true;
	}

	@Override
	public boolean updateUser(UserVm user) {
		User userDb = userRepository.findById(user.getId()).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found user"));
		userDb.setName(user.getName());
		userDb.setUsername(user.getUsername());
		userDb.setEmail(user.getEmail());
		userRepository.save(userDb);
		return true;
	}

	@Override
	public boolean deleteUser(String id) {
		userRepository.deleteById(id);
		return true;
	}



}
