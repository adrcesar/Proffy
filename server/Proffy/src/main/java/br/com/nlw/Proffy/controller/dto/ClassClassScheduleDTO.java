package br.com.nlw.Proffy.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;


import br.com.nlw.Proffy.modelo.ClassSchedule;

public class ClassClassScheduleDTO {
	
	private long   id;
	private String name;
	private String avatar;
	private String whatsapp;
	private String bio;
	private String subject;
	private float cost;
	private int weekDay;
	private int from;
	private int to;
	private String error;
	
	private ClassClassScheduleDTO(ClassSchedule classesSchedule) {
		this.id = classesSchedule.getClasses().getUsers().getId();
		this.name = classesSchedule.getClasses().getUsers().getName();
		this.avatar = classesSchedule.getClasses().getUsers().getAvatar();
		this.whatsapp = classesSchedule.getClasses().getUsers().getWhatsapp();
		this.bio = classesSchedule.getClasses().getUsers().getBio();
		this.subject = classesSchedule.getClasses().getSubject();
		this.cost = classesSchedule.getClasses().getCost();
		this.weekDay = classesSchedule.getWeekDay();
		this.from = classesSchedule.getFrom();
		this.to = classesSchedule.getTo();
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

	public int getWeekDay() {
		return weekDay;
	}

	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

	public String getError() {
		return error;
	}

	public static List<ClassClassScheduleDTO> converter(List<ClassSchedule> classesSchedule) {
		//return classesSchedule.map(ClassClassScheduleDTO::new);
		return classesSchedule.stream().map(ClassClassScheduleDTO::new).collect(Collectors.toList()); //quando era lista....
	}
	
	

}
