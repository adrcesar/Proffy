package br.com.nlw.Proffy.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.nlw.Proffy.modelo.Users;

public class ConnectionForm {

	
	private Long userId;

	

	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public Users converter() {
		Users user = new Users();
		System.out.println("userId: "+userId);
		user.setId(userId);
		return user;
	}
	
	
}
