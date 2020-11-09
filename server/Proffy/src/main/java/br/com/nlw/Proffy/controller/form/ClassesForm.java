package br.com.nlw.Proffy.controller.form;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.nlw.Proffy.modelo.ClassSchedule;
import br.com.nlw.Proffy.modelo.Classes;
import br.com.nlw.Proffy.modelo.Users;
import br.com.nlw.Proffy.util.UtilProffy;

public class ClassesForm {

	@NotNull @NotEmpty
	private String name;
	
	private String avatar;
	
	private String whatsapp;
	
	private String bio;
	
	private String subject;
	
	private float cost;
	
	private List<ClassScheduleForm> schedule;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

		public List<ClassScheduleForm> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<ClassScheduleForm> schedule) {
		this.schedule = schedule;
	}

	public Users converterUser() {

		Users user = new Users();
		user.setName(name);
		user.setAvatar(avatar);
		user.setBio(bio);
		user.setWhatsapp(whatsapp);
		return user;
	}

	public Classes converterClass() {
		Classes classes = new Classes();
		classes.setSubject(subject);
		classes.setCost(cost);
		return classes;
	}

	public List<ClassSchedule> converterSchedules() {
		List<ClassSchedule> classSchedules = new ArrayList<ClassSchedule>();
		
		for(ClassScheduleForm form: schedule) {
			ClassSchedule classSchedule = new ClassSchedule();
			classSchedule.setWeekDay(form.getWeekDay());
			classSchedule.setFrom(UtilProffy.converterHorasParaMinutos(form.getFrom()));
			classSchedule.setTo(UtilProffy.converterHorasParaMinutos(form.getTo()));
			classSchedules.add(classSchedule);
		}
		return classSchedules;
		
	}

}
