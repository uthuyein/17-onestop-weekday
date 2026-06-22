package com.jdc.mkt.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "employee_tbl")
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	@Column(nullable = false,length = 45)
	private String name;
	
	@NonNull
	@PrimaryKeyJoinColumn
	@OneToOne(cascade = CascadeType.PERSIST)
	private Contact contact;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Department department;
	
	public void addContact(Contact contact) {
		contact.setEmployee(this);
		this.contact = contact;
	}
	
	
}