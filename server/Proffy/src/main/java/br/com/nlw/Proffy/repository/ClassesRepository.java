package br.com.nlw.Proffy.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nlw.Proffy.modelo.Classes;

public interface ClassesRepository extends JpaRepository<Classes, Long>{

	List<Classes> findBySubject(String subject);

}
