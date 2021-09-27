package com.en.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en.core.exeptions.ObjectNotFoundException;
import com.en.core.models.Users;
import com.en.core.repositories.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository repository;
	
	public List<Users> listAll() {
		List<Users> list = repository.findAll();
		return list;
	}
	
	public Users findById(Integer id) {
		Optional<Users> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object Not Found. ID: " + id + ", Class: " + Users.class.getName(), "Usuário não encontrado!"));
	}

}
