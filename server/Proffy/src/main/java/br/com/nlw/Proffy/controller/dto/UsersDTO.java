package br.com.nlw.Proffy.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.nlw.Proffy.modelo.Users;



public class UsersDTO {
	
	private Long id;
	private String name;
	private String avatar;
	private String whatsapp;
	private String bio;
	
	public UsersDTO(Users users) {
		this.id = users.getId();
		this.name = users.getName(); 
		this.avatar = users.getAvatar();
		this.whatsapp = users.getWhatsapp();
		this.bio = users.getBio();
	}

	public Long getId() {
		return id;
	}

		public String getName() {
		return name;
	}

	public String getAvatar() {
		return avatar;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public String getBio() {
		return bio;
	}

	public static List<UsersDTO> converter(List<Users> users) {
		// substitui o for
		return users.stream().map(UsersDTO::new).collect(Collectors.toList()); //quando era lista....
		//para page é assim:
		//return topicos.map(TopicoDto::new);
		
	}
	
	

}
