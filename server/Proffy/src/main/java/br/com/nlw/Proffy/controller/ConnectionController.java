package br.com.nlw.Proffy.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.nlw.Proffy.controller.dto.ClassClassScheduleDTO;
import br.com.nlw.Proffy.controller.dto.ConnectionDTO;
import br.com.nlw.Proffy.controller.dto.TotalConnectionDTO;
import br.com.nlw.Proffy.controller.form.ConnectionForm;
import br.com.nlw.Proffy.modelo.ClassSchedule;
import br.com.nlw.Proffy.modelo.Connections;
import br.com.nlw.Proffy.modelo.Users;
import br.com.nlw.Proffy.repository.ConnectionsRepository;
import br.com.nlw.Proffy.repository.UsersRepository;
import br.com.nlw.Proffy.util.UtilProffy;

@RestController
@RequestMapping("/connections")
public class ConnectionController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private ConnectionsRepository conRepository;
	
	@GetMapping()
	public ResponseEntity<TotalConnectionDTO> count() {
		
		List<Connections> connections = conRepository.findAll();
		TotalConnectionDTO total = new TotalConnectionDTO(connections.size());
				
		return ResponseEntity.ok(total);

	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<ConnectionDTO> cadastrar(@RequestBody @Valid ConnectionForm form, UriComponentsBuilder uriBuilder){
		try {
			Users user = form.converter();
			Optional<Users> userFind = usersRepository.findById(user.getId());
			
			if (userFind.isEmpty()) {
				return ResponseEntity.badRequest().body(new ConnectionDTO("Invalid User to connection"));
			}
			
			Connections con = new Connections();
			con.setUsers(userFind.get());
			conRepository.save(con);
			
			URI uri = uriBuilder.path("/connections/{id}").buildAndExpand(con.getId()).toUri();
			return ResponseEntity.created(uri).body(new ConnectionDTO(con));
			
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(new ConnectionDTO("Unexpected error while creating new connection"));
		}
	}
}