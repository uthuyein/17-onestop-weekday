package com.jdc.mkt.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "register_tbl")
public class Register {

	@EmbeddedId
	private RegisterPk id;
	
	@ManyToOne
	@MapsId("courseId")
//	@JoinColumn(insertable = false,updatable = false)
	private Course course;
	
	@ManyToOne
	@MapsId("classroomId")
//	@JoinColumn(insertable = false,updatable = false)
	private Classroom classRoom;
	
	@ManyToOne
	@MapsId("studentId")
//	@JoinColumn(insertable = false,updatable = false)
	private Student student;
	
	private LocalDate rgDate;
	private LocalTime rgTime;
}
