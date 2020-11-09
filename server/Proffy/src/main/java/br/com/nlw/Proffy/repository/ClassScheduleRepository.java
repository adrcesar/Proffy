package br.com.nlw.Proffy.repository;

import java.util.List;


import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.nlw.Proffy.modelo.ClassSchedule;

public interface ClassScheduleRepository extends JpaRepository<ClassSchedule, Long>{

	@Query("SELECT c FROM ClassSchedule c WHERE  c.classes.subject = :subject and c.weekDay = :weekDay and c.from <= :timeInt and c.to > :timeInt")
	List<ClassSchedule> findBySubjectAndWeekDayAndTime(String subject, int weekDay, int timeInt, Pageable paginacao);

}
