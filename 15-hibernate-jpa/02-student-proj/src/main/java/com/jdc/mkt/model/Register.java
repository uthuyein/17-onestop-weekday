package com.jdc.mkt.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "register_tbl")
public class Register {

	@EmbeddedId
	private RegisterPk id;
	
	@ManyToOne
//	@JoinColumn(insertable = false,updatable = false)
	private Course course;
	
	@ManyToOne
//	@JoinColumn(insertable = false,updatable = false)
	private Classroom classRoom;
	
	@ManyToOne
//	@JoinColumn(insertable = false,updatable = false)
	private Student student;
	
	private LocalDate rgDate;
	private LocalTime rgTime;
}
