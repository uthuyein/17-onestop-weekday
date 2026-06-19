package com.jdc.mkt.inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("3")
public class Teacher extends Account{

	@OneToOne
	private Car car;
	
	public Teacher() {
		super(Member.Teacher);
	}
}
