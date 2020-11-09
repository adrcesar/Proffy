package br.com.nlw.Proffy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nlw.Proffy.modelo.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	Optional<Users> findByName(String nome);
	
}
