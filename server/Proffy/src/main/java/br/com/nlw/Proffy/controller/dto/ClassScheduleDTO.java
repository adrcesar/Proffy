package br.com.nlw.Proffy.controller.dto;

import br.com.nlw.Proffy.modelo.ClassSchedule;

public class ClassScheduleDTO {
	
	private int weekDay;
	private int from;
	private int to;
	
	public ClassScheduleDTO(ClassSchedule schedule) {
		this.weekDay = schedule.getWeekDay();
		this.from = schedule.getFrom();
		this.to = schedule.getTo();
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
	
	

}
