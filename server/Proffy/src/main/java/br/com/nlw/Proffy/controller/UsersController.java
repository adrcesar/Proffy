package br.com.nlw.Proffy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nlw.Proffy.controller.dto.UsersDTO;
import br.com.nlw.Proffy.modelo.Users;
import br.com.nlw.Proffy.repository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping
	public List<UsersDTO> lista(){
		List<Users> users = usersRepository.findAll();
		return UsersDTO.converter(users);
	}

}
