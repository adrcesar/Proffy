package br.com.nlw.Proffy.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.nlw.Proffy.controller.dto.ClassClassScheduleDTO;
import br.com.nlw.Proffy.controller.dto.ClassesDTO;
import br.com.nlw.Proffy.controller.form.ClassesForm;
import br.com.nlw.Proffy.modelo.ClassSchedule;
import br.com.nlw.Proffy.modelo.Classes;
import br.com.nlw.Proffy.modelo.Users;
import br.com.nlw.Proffy.repository.ClassScheduleRepository;
import br.com.nlw.Proffy.repository.ClassesRepository;
import br.com.nlw.Proffy.repository.UsersRepository;
import br.com.nlw.Proffy.util.UtilProffy;

@RestController
@RequestMapping("/classes")
public class ClassesController {

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private ClassesRepository classRepository;

	@Autowired
	private ClassScheduleRepository classScheduleRepository;

	@GetMapping
	public List<ClassClassScheduleDTO> lista(	@RequestParam(required = true) String subject,
									@RequestParam(required = true) int weekDay,
									@RequestParam(required = true) String time,
									@PageableDefault(sort = "id", direction = Direction.ASC, page = 0, size = 10) Pageable paginacao) {
		
		
		int timeInt = UtilProffy.converterHorasParaMinutos(time);
		
		
		List<ClassSchedule> classesSchedule = classScheduleRepository.findBySubjectAndWeekDayAndTime(subject, weekDay, timeInt, paginacao); 
		
				
		return ClassClassScheduleDTO.converter(classesSchedule);

	}

	@PostMapping
	@Transactional
	public ResponseEntity<ClassesDTO> cadastrar(@RequestBody @Valid ClassesForm form, UriComponentsBuilder uriBuilder) {
		try {
			Users user = form.converterUser();
			usersRepository.save(user);

			Classes classes = form.converterClass();
			classes.setUsers(user);
			classRepository.save(classes);

			List<ClassSchedule> schedules = form.converterSchedules();
			for (ClassSchedule schedule : schedules) {
				schedule.setClasses(classes);
				classScheduleRepository.save(schedule);
			}

			URI uri = uriBuilder.path("/classes/{id}").buildAndExpand(classes.getId()).toUri();
			return ResponseEntity.created(uri).body(new ClassesDTO(user, classes, schedules));

		} catch (Exception e) {
			return ResponseEntity.badRequest().body(new ClassesDTO("Unexpected error while creating new class"));
		}

	}

}
