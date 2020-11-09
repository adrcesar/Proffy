package br.com.nlw.Proffy.controller.dto;

import java.util.ArrayList;
import java.util.List;


import br.com.nlw.Proffy.modelo.ClassSchedule;
import br.com.nlw.Proffy.modelo.Classes;
import br.com.nlw.Proffy.modelo.Users;

public class ClassesDTO {
	private long   id;
	private String name;
	private String avatar;
	private String whatsapp;
	private String bio;
	private String subject;
	private float cost;
	private List<ClassScheduleDTO> schedules = new ArrayList<ClassScheduleDTO>();
	private String error;
	
	public ClassesDTO(Users user, Classes classes, List<ClassSchedule> schedules) {
		this.id = user.getId();
		this.name = user.getName();
		this.avatar = user.getAvatar();
		this.whatsapp = user.getWhatsapp();
		this.bio = user.getBio();
		this.subject = classes.getSubject();
		this.cost = classes.getCost();
		
		for (ClassSchedule schedule : schedules) {
			ClassScheduleDTO scheduleDTO = new ClassScheduleDTO(schedule);
			this.schedules.add(scheduleDTO);
		}
	}
	
	public ClassesDTO(String error) {
		this.error = error;
	}
	
	

	public long getId() {
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

	public String getSubject() {
		return subject;
	}

	public float getCost() {
		return cost;
	}

	public List<ClassScheduleDTO> getSchedules() {
		return schedules;
	}

	public String getError() {
		return error;
	}

	

	
	
	
	
	
	
	
	
	
	

}
