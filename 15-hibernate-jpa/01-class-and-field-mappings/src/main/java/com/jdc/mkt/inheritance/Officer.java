package com.jdc.mkt.inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("2")
public class Officer extends Account{

	private String laptop;
	
	public Officer() {
		super(Member.Officer);
	}
}
