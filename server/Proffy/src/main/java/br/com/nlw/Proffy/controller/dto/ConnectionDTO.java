package br.com.nlw.Proffy.controller.dto;

import java.time.LocalDateTime;

import br.com.nlw.Proffy.modelo.Connections;

public class ConnectionDTO {
	
	private Long id;
	private LocalDateTime createdAt;
	private String name;
	private String error;
	
	public ConnectionDTO(Connections con) {
		this.id = con.getId();
		this.createdAt = con.getCreatedAt();
		this.name = con.getUsers().getName();
	}
	
	public ConnectionDTO(String error) {
		this.error = error;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public String getName() {
		return name;
	}

	public String getError() {
		return error;
	}
	
	
	
	
	
	
	
	

}
