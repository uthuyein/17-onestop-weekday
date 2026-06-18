package com.jdc.mkt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class RegisterPk  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name ="course_id",insertable = false,updatable = false)
	private int courseId;
	
	@Column(name ="student_id",insertable = false,updatable = false)
	private int studentId;
	
	@Column(name ="classroom_id",insertable = false,updatable = false)
	private int classroomId;
}
